from decimal import Decimal
from .models import Produto
from rest_framework import serializers

class ProdutoSerializer(serializers.ModelSerializer):
  class Meta:
    model = Produto
    fields = ['id', 'titulo', 'preco', 'preco_taxado']

  # id = serializers.IntegerField()
  # titulo = serializers.CharField(max_length=255)
  # preco = serializers.DecimalField(max_digits=6, decimal_places=2)

  # 10% de acrescimo
  preco_taxado = serializers.SerializerMethodField(method_name='calcular_taxa')

  def calcular_taxa(self, produto: Produto):
    tax = produto.preco * Decimal(1.1)
    return tax
