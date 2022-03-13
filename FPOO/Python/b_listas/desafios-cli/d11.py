from random import randint
games = list()
n = int(input("Digite o número de jogos que você deseja gerar: "))
for i in range(n):
    arr = list()
    for i in range(6):
        while (True):
            ran = randint(0,60)
            if ran in arr:
                continue
            else:
                arr.append(ran)
                break
    arr.sort()
    games.append(arr)

for i, v in enumerate(games):
    print(f'Jogo {i+1}: {v}')
    