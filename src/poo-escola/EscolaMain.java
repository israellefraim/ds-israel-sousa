import escola.Pessoa;
import escola.Aluno;
import escola.Professor;
import escola.Funcionario;
import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Anônimo da Silva", "123.456.789-00", new Date());
        Professor professor1 = new Professor("Professor Girafales", "552.746.637-69", new Date());
        Funcionario funcionario1 = new Funcionario("Salas Limpador", "553.653.792-67", new Date());

        System.out.println("NOMES ===============================");
        System.out.println("nome: " + aluno1.nome + "\ntipo: " + aluno1.getClass().getSimpleName());
        System.out.println("nome: " + professor1.nome + "\ntipo: " + professor1.getClass().getSimpleName());
        System.out.println("nome: " + funcionario1.nome + "\ntipo: " + funcionario1.getClass().getSimpleName());

        int qtd = 100;
        System.out.println("\nValor gasto para " + qtd + " cópias: " + aluno1.tirarCopias(qtd));
    }
}
