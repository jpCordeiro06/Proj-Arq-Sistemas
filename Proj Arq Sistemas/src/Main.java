public class Main {
    public static void main(String[] args) {
        Turma t252 = new Turma();
        //System.out.println(t252.getTotalALunos());
        Aluno a2 = new Aluno("Jp", "2");
        t252.add(a2);
        t252.imprimeListaChamada();
    }
}
