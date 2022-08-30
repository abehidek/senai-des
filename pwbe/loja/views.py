from email import message
from django.shortcuts import render, get_object_or_404
from django.http import HttpResponse, HttpRequest
from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework.request import Request
from .models import Produto
from .serializer import ProdutoSerializer
# Create your views here.

@api_view(['GET', 'POST'])
def produtos_listar(req: HttpRequest):
  if req.method == 'GET':
    queryset = Produto.objects.all()
    serializer = ProdutoSerializer(queryset, many=True)
    return Response(serializer.data)
  if req.method == 'POST':
    serializer = ProdutoSerializer(data=req.data)
    if serializer.is_valid():
      serializer.save()
    return Response('ok')


@api_view(['GET'])
def produtos_detalhes(req: HttpRequest, id):
  produto = get_object_or_404(Produto, pk=id)
  serializer = ProdutoSerializer(produto)
  return Response(serializer.data)
  # try:
  #   produto = Produto.objects.get(pk=id)
  #   serializer = ProdutoSerializer(produto)
  #   return Response(serializer.data)
  # except Produto.DoesNotExist:
  #   return Response(status=404, message='Não existe')