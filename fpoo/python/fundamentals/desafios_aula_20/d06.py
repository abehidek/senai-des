maiores = 0
menores = 0

for i in range(1, 8):
    ano = int(input(f"Ano de nascimento da {i} pessoa: "))

    if (2022 - ano) >= 18:
        maiores = maiores+1

    else:
        menores = menores+1

print("Total de maiores: ", maiores)
print("Total de menores: ", menores)