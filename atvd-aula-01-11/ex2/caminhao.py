from veiculo import Veiculo
from veiculo_motorizado import VeiculoMotorizado
from veiculo_mais_de_quatro_rodas import VeiculoMaisDeQuatroRodas

class Caminhao(VeiculoMotorizado, VeiculoMaisDeQuatroRodas):
  def __init__(self, nome, combustivel):
      super().__init__(nome, combustivel)

  def descricao(self):
      return f"{self.nome} é um caminhão."