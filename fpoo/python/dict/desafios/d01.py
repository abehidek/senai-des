aluno = dict()
lista = list()

aluno["aluno"] = input("Aluno: ")
aluno["nota"] = float(input("Nota: "))
lista.append(aluno.copy())

print(f'O Nome é igual a {aluno["aluno"]}')
print(f'Nota é igual a {aluno["nota"]}')

if aluno["nota"] <= 3.9:
    print("Aluno está reprovado")
elif aluno["nota"] <= 6.5:
    print("Aluno está de recuperação")
else:
    print("Aluno está aprovado")
