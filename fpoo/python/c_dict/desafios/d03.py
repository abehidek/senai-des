from datetime import date

dicionario = {}
ano_atual = date.today().year
dicionario["nome"] = str(input("Nome: "))
ano_nascimento = int(input("Ano de nascimento: "))
dicionario["idade"] = ano_atual - ano_nascimento
dicionario["ctps"] = int(input("Número da carteira de trabalho (0 se não tiver): "))

if dicionario["ctps"] > 0:
    dicionario["contratação"] = int(input("Ano de contratação: "))
    dicionario["salario"] = float(input("Salário: R$"))
    dicionario["aposentadoria"] = dicionario["contratação"] + 35

print(dicionario)
print("*" * 40)

for chave, valor in dicionario.items():
    if chave == "ctps":
        if valor == 0:
            print("Não tem carteira de trabalho.")
    else:
        print(f"O campo {chave} tem o valor {valor}.")
