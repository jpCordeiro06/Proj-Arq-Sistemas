public class BancoDados implements PersistenciaDB{

    public void save(){
        System.out.println("Salvando dados");
    }

    public void insert(){
        System.out.println("Inserindo dados");
    }

    public void delete(){
        System.out.println("Deletando dados");
    }
}
