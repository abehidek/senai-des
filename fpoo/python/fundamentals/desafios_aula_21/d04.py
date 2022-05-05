ver = 0
soma = 0
cont = 0
menor = 1000000000000000

while ver == 0:
    prod = str(input("Digite o nome do produto: "))
    price = float(input("Digite o preço do produto: "))
    verification = str(input("Deseja continuar? "))

    verification = verification.upper()

    soma = price + soma

    if price > 1000:
        cont += 1

    if price <= menor:
        menor = price
        menor_nome = prod

    if verification == "NAO" or verification == "N":
        ver = 1

    elif verification == "SIM" or verification == "S":
        ver = 0

print(" ")
print("-------------------------")
print("A soma dos produtos é: ",soma)
print(" ")
print("A quantidade de itens que custam mais que R$ 1000,00 é: ",cont)
print(" ")
print("O produto com menor preço é o ",menor_nome)
