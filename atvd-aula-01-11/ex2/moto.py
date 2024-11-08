from veiculo_duas_rodas import VeiculoDuasRodas
from veiculo_motorizado import VeiculoMotorizado
class Moto(VeiculoMotorizado, VeiculoDuasRodas):
  def __init__(self, nome, combustivel):
      super().__init__(nome, combustivel)

  def descricao(self):
      return f"{self.nome} é uma moto de duas rodas."