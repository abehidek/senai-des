somaidade = 0
idade = 0
idadeanterior = 0
fem = 0

for i in range(1,5):
    print(f"----------{i}° pessoa ----------")
    nome = str(input("Digite seu nome: "))
    sexo = str(input("Digite seu sexo: "))
    idade = int(input("Digite sua idade: "))

    somaidade = idade + somaidade

    if sexo == "feminino" and idade>20:
        fem = fem + 1

    else:
        if idade > idadeanterior:
            nomesaver = nome
            idadeanterior = idade

print("A média de idade deste grupo é de: ",somaidade/4)
print("O nome do homem mais velho deste grupo é: ",nomesaver)
print("A quantidade de mulheres com menos de 20 anos deste grupo é de: ",fem)
