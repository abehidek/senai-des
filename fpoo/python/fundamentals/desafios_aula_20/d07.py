maior = 0
menor = 100000

for i in range(1,6):
    peso = int(input(f"Peso da {i} pessoa: "))

    if peso > maior:
        maior = peso

    else:
        maior = maior

    if peso < menor:
        menor = peso

    else:
        menor = menor

print("O maior peso é: ",maior)
print("O menor peso é: ",menor)
