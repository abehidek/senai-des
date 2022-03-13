arr = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(3):
    for j in range(3):
        arr[i][j] = input(f'Digite um numero na matrix [{i}][{j}]: ')

for i in arr:
    print(i)