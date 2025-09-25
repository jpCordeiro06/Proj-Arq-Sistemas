import java.util.*;

public class Folha {
    private float saldo;
    private List<Pagamento> listaFuncionarios;

    public Folha(){
        this.saldo = 0;
        this.listaFuncionarios = new ArrayList<Pagamento>();
    }

    public void add(Pagamento p){
        this.listaFuncionarios.add(p);
    }

    public float getSaldo(){
        return this.saldo;
    }

    public float calcular(){
        float resultado = 0;

        for (Pagamento p : this.listaFuncionarios){
            this.saldo += p.getSaldo();
        }
        return resultado;
    }
}
