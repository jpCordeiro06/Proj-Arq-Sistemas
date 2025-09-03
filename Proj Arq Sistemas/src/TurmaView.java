import java.util.List;

public class TurmaView {
    public void imprimeDados(Aluno aluno) {
        System.out.println("Lista de Presença");
        System.out.println(
                "Nome:" + aluno.getNome() + " ,Matricula:" + aluno.getMatricula() + " \t[ ]"
        );
    }

    public void imprimeDados(List<Aluno> aluno) {
        for (Aluno a1 : aluno) {
            System.out.println("Lista de Presença");
            System.out.println(
                    "Nome:" + a1.getNome() + " ,Matricula:" + a1.getMatricula() + "[ ]"
            );
        }

    }

    public void mostraDados() {
        System.out.println(
                "Mostra na tela dados dos alunos"
        );
    }
}
