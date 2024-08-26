#include <iostream>
#include <ctime>
#include <random>
#include <array>
using namespace std;

class Campeonato
{
public:
    string nomeCampeonato;
    int nDeTimes;
    string pais;
    string esporte;
    string patrocinadorSenior;

    void exibirInfosCampeonato()
    {
        cout << " O " << nomeCampeonato << " patrocinado por " << patrocinadorSenior << " tem sua sede no(a) " << pais << " no qual conta com " << nDeTimes << " de " << esporte;
    }

    void exibirTimes(string times[])
    {
        times[nDeTimes];
        for (int i = 0; i < nDeTimes; i++)
        {
            cout << i + 1 << "- " << times[i];
        }
    }

    string sortearConfronto(string times[])
    {
        times[nDeTimes];
        random_device aleatorio;
        uniform_int_distribution<int> format(1, nDeTimes);
        string time1, time2, confronto;

        time1 = times[format(aleatorio)];
        time2 = times[format(aleatorio)];

        while (time1 == time2)
        {
            time2 = times[format(aleatorio)];
        }

        confronto = time1 + " x " + time2;

        return confronto;
    }

    int calcularDuracao(int nDeRodadas)
    {
        return nDeRodadas * 7;
    }

    void gerarTabelaPontuacao(string times[], int pontos[])
    {
        for (int i = 0; i < nDeTimes; i++)
        {
            cout << times[i] << ": " << pontos[i] << " pontos\n";
        }
    }
};

class Time : public Campeonato
{
public:
    string nomeTime;
    int nDeJogadores;
    string estado;
    int pontos;
    string corPrincipal;

    void exibirInfosTime()
    {
        cout << "Nome: " << nomeTime << endl;
        cout << "Numero de Jogadores: " << nDeJogadores;
        cout << "Estado: " << estado << endl;
        cout << "Pontos: " << pontos << endl;
        cout << "Cor do Time: " << corPrincipal << endl;
    }

    void somarPontos(const char *resultado)
    {
        if (resultado == "v")
        {
            pontos += 3;
        }
        if (resultado == "e")
        {
            pontos += 1;
        }
        if (resultado = "d")
        {
            pontos += 0;
        }
    }

    void exibirElenco(string jogadores[])
    {
        jogadores[nDeJogadores];

        for (int i = 0; i < nDeJogadores; i++)
        {
            cout << jogadores[i] << "\n";
        }
    }

    void exibirComissao(string comissao[], int nDeComissao)
    {
        for (int i = 0; i < nDeComissao; i++)
        {
            cout << comissao[i] << "\n";
        }
    }

    void verificarQualidadeDefesa(int golsSofridos)
    {
        if (golsSofridos < 10)
        {
            cout << "A defesa esta bem!";
        }
        else
        {
            cout << "A defesa esta mal!";
        }
    }
};

class Estadio : public Campeonato
{
public:
    string nomeEstadio;
    int nDeSetores;
    int capacidadeMaxima;
    string estado;
    double precoIngresso;

    void exibirInfosEstadio()
    {
        cout << "Nome: " << nomeEstadio << endl;
        cout << "Numero de Setores: " << nDeSetores;
        cout << "Capacidade Maxima: " << capacidadeMaxima << endl;
        cout << "Estado: " << estado << endl;
        cout << "Preco do Ingresso: " << "R$" << precoIngresso << endl;
    }

    double calcularReceita(int publico)
    {
        return publico * precoIngresso;
    }

    double porcentagemDeLotacao(int publico)
    {
        return (publico * 100) / capacidadeMaxima;
    }

    int faltandoParaLotacao(int publico)
    {
        return capacidadeMaxima - publico;
    }
    double mediaDePublicoPorSetor(int publico)
    {
        return publico / nDeSetores;
    }
};

class Jogador : public Time
{
public:
    string nomeJogador;
    time_t dataDeNascimento;
    string nacionalidade;
    double altura;
    double peso;
    double salario;

    void exibirInfosJogador()
    {
        cout << "Nome: " << nomeJogador << endl;
        cout << "Data de Nascimento: " << dataDeNascimento;
        cout << "Nacionalidade: " << nacionalidade << endl;
        cout << "Altura: " << altura << " m" << endl;
        cout << "Peso: " << peso << " kg" << endl;
        cout << "Salário: " << salario << endl;
    }

    double medirIMC()
    {
        return peso / (altura * altura);
    }

    double calcularSalarioAnual()
    {
        return salario * 12;
    }

    void renovarContrato(double novoSalario)
    {
        salario = novoSalario;
        cout << "Contrato renovado! Novo salário: " << salario << endl;
    }

    int calcularIdade()
    {
        return difftime(time(0), dataDeNascimento) / (365.25 * 24 * 60 * 60);
    }
};

class ComissaoTecnica : public Time
{
public:
    string nomeComissao;
    time_t dataDeNascimento;
    string nacionalidade;
    string cargo;
    double salario;

    void exibirInfosComissao()
    {
        cout << "Nome: " << nomeComissao << endl;
        cout << "Data de Nascimento: " << dataDeNascimento;
        cout << "Nacionalidade: " << nacionalidade << endl;
        cout << "Cargo: " << cargo << endl;
        cout << "Salário: " << salario << endl;
    }

    double calcularSalarioAnual()
    {
        return salario * 12;
    }

    void planejarTreinamento(string tipoDeTreino)
    {
        cout << "Treinamento planejado: " << tipoDeTreino << endl;
    }

    void avaliarDesempenho(int vitorias, int empates, int derrotas)
    {
        cout << "Desempenho do Time: " << vitorias << " vitórias, " << empates << " empates, " << derrotas << " derrotas.\n";
    }

    void realizarAvaliacaoJogadores(string jogadores[], double notas[], int nDeJogadores)
    {
        for (int i = 0; i < nDeJogadores; i++)
        {
            cout << "Jogador: " << jogadores[i] << " - Nota: " << notas[i] << "\n";
        }
    }
};