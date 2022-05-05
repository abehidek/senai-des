import random
import sys

lose = 0

while lose == 0:
    control = str(input("Par ou ímpar? "))
    number = int(input("Digite um numero: "))
    result = (number+random.randint(0, 10)) % 2

    control = control.upper()

    if control == "PAR":

        if result == 0:
            print(" ")
            print("Parabéns, você ganhou!")
            print("-------------------------------------------")

        else:
            print(" ")
            print("Você perdeu!!")
            print("-------------------------------------------")
            lose = 1

    elif control == "IMPAR":

        if result != 0:
            print(" ")
            print("Parabéns, você ganhou!")
            print("-------------------------------------------")

        else:
            print(" ")
            print("Você perdeu!!")
            print("-------------------------------------------")
            lose = 1

    else:
        sys.exit("Opção inválida!! Programa encerrado!")