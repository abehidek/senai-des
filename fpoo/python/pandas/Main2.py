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
data.drop('Idade', axis=1, inplace=True)
print(data)

# data.to_json(os.path.join(dirname, './dados.json'), index=True)



# Plot graph in matplotlib
# planilha = pd.read_excel(os.path.join(dirname, './dados.xlsx'))
# plt.plot(planilha['Idade'])
# plt.show()