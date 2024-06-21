public class Controle_Da_TV {
    public static void main(String[] args) throws Exception {
       

       //Instanciando, criando uma nova Tv 
       Tv smartTv = new Tv();
       
       //Chamando, execultando um metódo para exibir o status
       smartTv.status();

       //Chamando o metodo para ligar a tv
       smartTv.ligarTv();

       //Chamando, execultando um metódo para exibir o status
       smartTv.status();
    }
}
