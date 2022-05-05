cont = 0
soma=0
maior = 0
menor = 100000000000
acrescentar = 0

while acrescentar == 0:

    num = int(input("Digite um valor: "))

    if num > maior:
        maior = num

    if num < menor:
        menor = num

    soma = num + soma
    cont += 1

    confirm = input("Deseja acrescentar mais um valor? ")
    confirm = confirm.upper()

    if confirm == 'N' or confirm == "NÃO":
        acrescentar = 1

    else:
        acrescentar = 0


else:
    media = soma/cont
    print("A media desses valores é: ",media)
    print("O maior numero digitado foi o: ",maior)
    print("O menor numero digitado foi o: ",menor)