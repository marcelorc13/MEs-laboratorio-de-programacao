from veiculo_motorizado import VeiculoMotorizado
from bicicleta import Bicicleta
from moto import Moto
from carro import Carro
from caminhao import Caminhao

veiculos = [
  Bicicleta("Bicicleta"),
  Moto("Moto", "Gasolina"),
  Carro("Carro", "Gasolina"),
  Caminhao("Caminhão", "Diesel")
]

for veiculo in veiculos:
  print(veiculo.descricao())
  print(veiculo.mover())
  print(veiculo.parar())
  if isinstance(veiculo, VeiculoMotorizado):
      print(veiculo.abastecer())
  print()
