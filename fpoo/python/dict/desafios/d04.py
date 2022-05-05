jogador = dict()
gols = list()
jogador["nome"] = input("Digite o nome do jogador: ")
jogador["partidas"] = int(input("Digite o numero de partidas: "))

for i in range(jogador["partidas"]):
    gols.append(int(input(f'Digite o numero de gols no jogo {i+1}: ')))

jogador["gols"] = gols
print("-*" * 9)

for key, value in jogador.items():
    print(f'{key} -> {value}')
print(f'o jogador {jogador["nome"]} jogou {jogador["partidas"]} partidas')
print(f'o jogador {jogador["nome"]} tem valor {sum(jogador["gols"])}')
