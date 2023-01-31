{
  description = "Shell environments for development";
  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixpkgs-unstable";
    stable.url = "github:nixos/nixpkgs/nixos-22.11";
    abehidek.url = "github:abehidek/env.nix";
  };
  outputs = {
    self,
    nixpkgs,
    stable,
    abehidek,
    ...
  } @ inputs: let
    inherit (self) outputs;
    supportedSystems = [ "x86_64-linux" ];
    forAllSystems = nixpkgs.lib.genAttrs supportedSystems;
  in rec {
    devShells = forAllSystems (system: {
      default = let
        pkgs = nixpkgs.legacyPackages.${system};
        node16Pkgs = import nixpkgs {
          inherit system;
          config = { allowUnfree = true; };
          overlays = [(final: prev: { nodejs = prev.nodejs-16_x; })];
        };
        myPython = pkgs.python310;
        myPythonWithPkgs = myPython.withPackages(p: with p; [
          pygame
          tkinter
          pandas
          pip
          openpyxl
          matplotlib
          django
          djangorestframework
        ]);
      in pkgs.mkShell {
        nativeBuildInputs = [ pkgs.bashInteractive ];
        inputsFrom = [ abehidek.devShells.${system}.nodejs ];
        buildInputs = with pkgs; [
          myPythonWithPkgs
          jdk
          node16Pkgs.nodePackages.expo-cli
          node16Pkgs.ngrok
        ];
        PYTHONPATH="${myPythonWithPkgs}/${myPythonWithPkgs.sitePackages}";
      };
    });
  };
}