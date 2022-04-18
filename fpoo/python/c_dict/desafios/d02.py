from operator import itemgetter
from random import randint
from time import sleep

dicionario = {'jogador1': randint(1, 6),
              'jogador2': randint(1, 6),
              'jogador3': randint(1, 6),
              'jogador4': randint(1, 6), }
print('Valores sorteados:')
for key, value in dicionario.items():
    print(f'{key} tirou {value} no dado.')
    sleep(1)
ranking = {}
print(f'Ranking dos jogadores: ')
ranking = sorted(dicionario.items(), key=itemgetter(1), reverse=True) for indice, valor in enumerate(ranking):
    print(f'{indice+1}º lugar: {valor[0]} com {valor[1]}.')
    sleep(1)
