galera = []
pessoa = {}
soma = media = 0

while True:
    pessoa.clear()
    pessoa['nome'] = str(input('Nome: '))
    while True:
        pessoa['sexo'] = str(input('Sexo [F/M]: ')).upper()
        if pessoa['sexo'] in 'MF':
            break
        print('Erro, o sexo deve ser F ou M.')
    pessoa['idade'] = int(input('Idade: '))
    soma += pessoa['idade']
    galera.append(pessoa.copy())
    while True:
        resp = str(input('Quer continuar[S/N]? ')).upper()
        if resp in 'SN':
            break
        print('Erro, responda S ou N.')
    if resp == 'N':
        break
print('*' * 40)
print(f'Em geral possuimos {len(galera)} pessoas cadastradas.')
media = soma / len(galera)
print(f'Média de idade é de {media:5.2f} anos.')
print(f'As mulheres cadastradas foram ', end='')

for p in galera:
    if p['sexo'] in 'Ff':
        print(f'{p["nome"]} ', end='')
print()

print(f'A lista de pessoas que estão acima da média: ')
for p in galera:
    if p['idade'] >= media:
        print(f' ', end='')
        for k, v in p.items():
            print(f'{k} = {v} ', end='')
        print()
print('Fim!')
