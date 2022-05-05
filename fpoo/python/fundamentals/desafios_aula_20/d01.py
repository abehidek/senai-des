tab= int(input('Digite um numero: '))
print('-' * 30)
for i in range(10):
        print(f'{tab} x {i+1} =\033[1;32m {tab*(i+1)}\33[m')
print('-' * 30)