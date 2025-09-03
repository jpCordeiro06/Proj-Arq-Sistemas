import java.util.ArrayList;
import java.util.List;

public class TurmaDao{

    public List<Aluno> load(){
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(new Aluno("Ronnison", "1"));
        return lista;
    }

    public void save(Aluno aluno){
        System.out.println("Aluno, " + aluno.getNome() + "salvo com sucesso");
    }

    public void update(){

    }

    public void delete(){

    }
}