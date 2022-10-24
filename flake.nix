{
  description = "A prisma test project";
  inputs.nixpkgs.url = "github:NixOS/nixpkgs/22.05";
  inputs.nixpkgs-unstable.url = "github:nixos/nixpkgs/nixpkgs-unstable";
  inputs.flake-utils.url = "github:numtide/flake-utils";

  outputs = { self, nixpkgs, nixpkgs-unstable, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system: let

      pkgs = import nixpkgs {
        inherit system;
        config = { allowUnfree = true; };
      };
      unstable = nixpkgs-unstable.legacyPackages.${system};
      mpython = pkgs.python310;
      mpython-w-pkgs = mpython.withPackages(p: with p; [
        pygame
        tkinter
        pandas
        pip
        openpyxl
        matplotlib
        django
        djangorestframework
      ]); 
    in {
      devShell = pkgs.mkShell {
        nativeBuildInputs = [ pkgs.bashInteractive ];
        buildInputs = with pkgs; [
          mpython-w-pkgs
          jdk
          nodejs
          yarn
          nodePackages.expo-cli
          ngrok
          # android-studio
          nodePackages.typescript
        ];
        shellHook = with pkgs; '']
          export PYTHONPATH=${mpython-w-pkgs}/${mpython-w-pkgs.sitePackages}
        '';
      };
    });
}