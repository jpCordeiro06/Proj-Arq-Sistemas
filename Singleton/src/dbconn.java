public class dbconn {
    private dbconn(){}
    private static dbconn instance;
    public static dbconn getInstance(){
        if(instance == null){
            instance = new dbconn();
        }
        return instance;
    }
    public void conectar(String msg){
        System.out.println(msg);
    }
}
