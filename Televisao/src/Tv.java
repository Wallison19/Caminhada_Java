//Objeto Tv
public class Tv {

    //Criando as caracteristicas, atributos do objeto Tv.
    boolean ligada = false;
    int volume = 0;
    int canal =1;


    //Criando um metodo para exibir o status atual da Tv.
    public void status (){
        System.out.println("------Status atual da Televisão------");
        System.out.println("A Tv esta ligada: "+ ligada);
        System.out.println("Esta com volume no: "+ volume);
        System.out.println("Esta no canal: "+ canal);
    }

    //Criando um metódo para ligar a Tv.
    public void ligarTv(){
        ligada = true;
    }
}
