from veiculo_duas_rodas import VeiculoDuasRodas
from veiculo_sem_motor import VeiculoSemMotor

class Bicicleta(VeiculoDuasRodas, VeiculoSemMotor):
  def __init__(self, nome):
      super().__init__(nome)

  def descricao(self):
      return f"{self.nome} é uma bicicleta."