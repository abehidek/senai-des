from csv import excel
import enum
from numpy import place
import pandas as pd
import matplotlib.pyplot as plt
import os
dirname = os.path.dirname(__file__)

dict = {
    'Nome': ['Ícaro', 'Nathã', 'Naiury'],
    'Idade': [19, 18, 17]
}
data = pd.DataFrame(data = dict)
print(data)

data.to_excel(os.path.join(dirname, './dados.xlsx'), index=True)



planilha = pd.read_excel(os.path.join(dirname, './dados.xlsx'))
plt.plot(planilha['Idade'])
plt.show()

# print(excelfile['Nome'][indice])  
# print(excelfile['Idade'][indice])
# print(excelfile['Peso'][indice])
# file = open('texto.txt', 'w', encoding='utf8')
# file.write('café1\n')
# file.write('café2\n')
# file.write('café3\n')
# file.write('café4\n')


# file = open('texto.txt', 'r', encoding='utf8')
# file.seek(0)
# for linha in file.readlines():
#     print(linha)

# print(file.read())
# file.close()

# ---

# exceldir = os.path.join(dirname, './pessoas.xlsx')
# excelfile = pd.read_excel(exceldir)
# excelqtd = excelfile['Nome'].count()

# print(excelqtd)
# indice = 0
# id = int(input('Digite o ID: '))
# for i, v in enumerate(excelfile['ID']):
#     if id == v:
#         indice = i

# for dado in excelfile:
#     print(excelfile[dado][indice], end= ' ')