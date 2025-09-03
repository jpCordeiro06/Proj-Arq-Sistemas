import java.util.*;

public class Turma {

    private List<Aluno> listaAluno;
    private TurmaDao tDao;
    private TurmaView tView;

    public Turma(){
        tView = new TurmaView();
        tDao = new TurmaDao();
        listaAluno = tDao.load();
    }

    public float calcMedia(){
        return 0.0f;
    }

    public List<Aluno> getAlunos(){
        return null;
    }

    public void imprimeListaChamada(){
        tView.imprimeDados(listaAluno);
    }

    public int getTotalALunos(){
        int totalAlunos = this.listaAluno.size();
        return totalAlunos;
    }

    public Aluno add(Aluno aluno){
        this.listaAluno.add(aluno);
        tDao.save(aluno);
        return null;
    }

    public void delete(Aluno aluno){

    }
}
