sexo = input("Digite seu sexo (M/F): ")

if sexo == "f" or sexo == "m":
    sex = 1

else:
    sex = 0

while sex == 0:
    sexo = input("Erro!! Sexo inválido, digite novamente (M/F): ")

    if sexo == "f" or sexo == "m":
        sex = 1

    else:
        sex = 0

else:
    if sexo =="m":
        sexoout = "masculino"

    else:
        sexoout = "feminino"

    print(f"Seu sexo é {sexoout}")