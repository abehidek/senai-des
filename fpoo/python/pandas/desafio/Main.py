import pandas as pd
import matplotlib.pyplot as plt
import os
dirname = os.path.dirname(__file__)

def addRowOld(df):
    while True:
        rowdf = pd.DataFrame({
            'Pais': [input("Digite o nome do pais: ")],
            'Capital': [input("Digite a capital do pais: ")]
        })
        df = pd.concat([df, rowdf], ignore_index=True, axis=0)
        o = input('Deseja adicionar mais um pais? [S/N]: ').upper()
        if o == 'N': break;
    return df

def addRow(df):
    while True:
        df.loc[df['Pais'].count()] = [input("Digite o nome do pais: "), input("Digite a capital do pais: ")]
        o = input('Deseja adicionar mais um pais? [S/N]: ').upper()
        if o == 'N': break;
    return df

df = pd.DataFrame(columns=['Pais', 'Capital'])
# print(addRow(df))
print(addRowOld(df))

# data = {
#     'Pais': [''],
#     'Capital': [''],
#     'População': ['']
# }

# print(df['Pais'].count())

# qde = df['Pais'].count()
# # # for i in range (qde):
# #     # df['Populacao'][i]=int(input(f'População {df["Pais"][i]}: '))
# populacao = list()
# for i in range (qde):
#     populacao.append(input(f'Digite a população de {df["Pais"][i]}: '))

# df['Populacao'] = populacao
