from veiculo_motorizado import VeiculoMotorizado
from veiculo_quatro_rodas import VeiculoQuatroRodas

class Carro(VeiculoMotorizado, VeiculoQuatroRodas):
  def __init__(self, nome, combustivel):
      super().__init__(nome, combustivel)

  def descricao(self):
      return f"{self.nome} é um carro."