num = 0
cont=0
soma = 0

while num != 999:
    num = int(input("Digite um valor: "))

    soma = num + soma
    cont += 1

else:
    print("------------------------------------")
    print(cont-1)
    print(soma-999)
    print("Programa finaliazado")