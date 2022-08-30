from django.urls import path
from . import views

urlpatterns = [
  path('produtos/', views.produtos_listar),
  path('produtos/<int:id>/', views.produtos_detalhes),
]
