import sys

number = int(input("Digite um numero: "))


if number>=0:
    for i in range (1,11):
        result = number*i

        print(number," X ",i," = ",result)

else:
    sys.exit("Programa encerrado!!")