pessoas = [] # DATA INPUT
while True:
    pessoa = []
    pessoa.append(input("Digite o nome: "))
    pessoa.append(int(input("Digite o peso: ")))
    pessoas.append(pessoa)
    o = input("Deseja continuar? [S/N]: ")
    if o.upper() == 'N':
        break
pessoas.sort(key=lambda x: x[1])
print('Dados cadastrados: ', pessoas)
print('Numero de pessoas cadastradas: ', len(pessoas))
print('Maior peso: ', max(pessoas))
print('Menor peso: ', min(pessoas))