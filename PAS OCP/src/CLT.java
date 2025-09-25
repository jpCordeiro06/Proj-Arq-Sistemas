public class CLT implements Pagamento{

    private float salario;

    public CLT(float sal){
        this.salario = sal;
    }

    public float getSaldo(){
        return this.salario;
    }
}
