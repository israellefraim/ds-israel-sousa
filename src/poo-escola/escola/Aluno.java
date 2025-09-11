package escola;

import escola.Pessoa;
import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }

    public String matricula;

    public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
        return 0.07 * (double) qtd;
    }
}
