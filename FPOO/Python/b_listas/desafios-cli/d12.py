alunos = list()
while True:
    aluno = list()
    nome = input("Nome: ")
    n1 = float(input("Nota 1: "))
    n2 = float(input("Nota 2: "))
    aluno.extend([nome, n1, n2, (n1/n2)/2])
    alunos.append(aluno)
    o = input('Deseja continuar? [S/N]: ')
    if o.upper() == 'N':
        break

print("+-----+-------------------+-----+")
print('|Nº   |Nome               |Media|')
print("+-----+-------------------+-----+")
for i, aluno in enumerate(alunos):
    nome = ''
    media = 0
    for j, v in enumerate(aluno):
        if j == 0:
            nome = aluno[j]+(' '*(15 - len(aluno[j])))
        if j == 3:
            media = aluno[j]
    if media == 10:
        print(f'|{i}    |{nome}    |{media:.1f} |')
    else:
        print(f'|{i}    |{nome}    |{media:.2f} |')
print("+-----+-------------------+-----+\n")
while True:
    o = int(input("Digite um numero de um aluno ou -1 para sair: "))
    if o == -1:
        break
    else:
        print(f'Notas de {alunos[o][0]} são: [{alunos[o][1]}, {alunos[o][2]}]')
        