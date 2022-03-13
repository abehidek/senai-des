arr = [[0,0,0],[0,0,0],[0,0,0]]
par = list()
col = list()
sec = list()
for i in range(3):
    for j in range(3):
        arr[i][j] = int(input(f'Digite um numero na matrix [{i}][{j}]: '))
        if arr[i][j] % 2 == 0:
            par.append(arr[i][j])
        if j == 2:
            col.append(arr[i][j])
        if i == 1:
            sec.append(arr[i][j])
    
for i in arr:
    print(i)

print('Soma dos valores pares:',sum(par))
print('Soma da terceira coluna:',sum(col))
print('Maior valor da segunda linha:',max(sec))