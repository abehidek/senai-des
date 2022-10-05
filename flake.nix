{
  description = "A prisma test project";
  inputs.nixpkgs.url = "github:NixOS/nixpkgs/master";
  inputs.flake-utils.url = "github:numtide/flake-utils";

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system: let
      pkgs = nixpkgs.legacyPackages.${system};
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
          # android-studio
          nodePackages.typescript
          nodePackages.expo-cli
          nodePackages.prisma
          nodejs-16_x
          pscale
          (yarn.override { nodejs = nodejs-16_x;  })
        ];
        shellHook = with pkgs; '']
          export PYTHONPATH=${mpython-w-pkgs}/${mpython-w-pkgs.sitePackages}
          export PRISMA_MIGRATION_ENGINE_BINARY="${prisma-engines}/bin/migration-engine"
          export PRISMA_QUERY_ENGINE_BINARY="${prisma-engines}/bin/query-engine"
          export PRISMA_QUERY_ENGINE_LIBRARY="${prisma-engines}/lib/libquery_engine.node"
          export PRISMA_INTROSPECTION_ENGINE_BINARY="${prisma-engines}/bin/introspection-engine"
          export PRISMA_FMT_BINARY="${prisma-engines}/bin/prisma-fmt"
        '';
      };
    });
}