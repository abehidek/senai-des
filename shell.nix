# Este arquivo é apenas utilizado quem utilizar o gerenciador de pacotes Nix e desejar copiar o ambiente de desenvolvimento utilizado
# shell.nix
{ pkgs ? import <nixpkgs> {} }:
let
  unstable = import (fetchTarball https://nixos.org/channels/nixos-unstable/nixexprs.tar.xz) { };
  my-python = pkgs.python38;
  python-with-my-packages = my-python.withPackages (p: with p; [
    pygame
    tkinter
    pandas
    pip
    # other python packages you want
  ]);
in
pkgs.mkShell {
  buildInputs = [
    python-with-my-packages
    unstable.jdk
    pkgs.pfetch
  ];
  shellHook = ''
    # maybe set more env-vars
    export PYTHONPATH=${python-with-my-packages}/${python-with-my-packages.sitePackages}
  '';
}

