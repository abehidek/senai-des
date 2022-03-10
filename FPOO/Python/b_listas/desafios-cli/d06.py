import pypeg2
import re

number = re.compile(r'\d+')
binop = re.compile(r'\+|\*') # Exercise: Extend to other binary operators

class BinOp(pypeg2.Namespace):
    grammar = binop

class Number(pypeg2.Namespace):
    grammar = number, pypeg2.optional("."), pypeg2.optional(number)

class Expression(pypeg2.Namespace):
    grammar = Number, pypeg2.optional(BinOp, Number)

class Equation(pypeg2.List):
    grammar = Expression, pypeg2.optional("="), pypeg2.optional(Expression)

exp = input("Digite uma expressão: ")
try:
    f = pypeg2.parse(exp, Equation)
    print("Expressao valida!")
except:
    print("Expressao invalida!")

# try:
#     eval(exp)
#     if (exp.count('(') == exp.count(')')):
#         print("Expressao valida!")
#     else:
#         print("Expressao invalida!")
# except:
#     print("Expressao invalida!")