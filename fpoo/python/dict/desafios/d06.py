dicionario = {}
lista_jogadores = []

while True:
    dicionario['nome'] = str(input('Nome do jogador: '))
    partidas = int(input('Quantas partidas ele jogou? '))
    gols = []
    total_gols = 0
    for partida in range(1, partidas + 1):
        gol = int(input(f'Quantos gols ele fez na {partida}ª partida? '))
        gols.append(gol)
        total_gols += gol
    dicionario['gols'] = gols
    dicionario['total_gols'] = total_gols
    lista_jogadores.append(dicionario.copy())
    opcao = str(input('Quer continuar [S/N]? '))
    if opcao in 'Nn':
        break
print('*' * 40)
print(lista_jogadores)
print('*' * 40)
codigo = 0
print(f'{"cod":<4} {"nome":<10} {"gols":<10} {"total":<10}')
print('-' * 40)

for jogador in lista_jogadores:
    print(f'{codigo:<4}', end=' ')
    for chave, valor in jogador.items():
        print(f'{valor}{"":<5}', end=' ')
    codigo += 1
    print()
print('-' * 40)
print('*' * 40)
# print(lista_jogadores)

while True:
    opcao = int(input('Mostrar dados de quem? '))
    if opcao == 999:
        break
    contador = 1
    if opcao > len(lista_jogadores) or opcao < 0:
        print('Tente novamente')
    if opcao <= len(lista_jogadores):
        for estatistica in gols:
            print(f'Na {contador}ª partida, ele fez {estatistica} gols.')
            contador += 1
