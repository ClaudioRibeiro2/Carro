import java.util.Scanner; // importar a classe scanner

public class Tela {
    // Atributos 
    private Scanner scan; // Instaciar o objeto scan


    // Construtor
    public Tela(){
        this.scan = new Scanner(System.in);
    }

    public double pedirAcel (){
        System.out.println("Favor digite a aceleração");
        double a = scan.nextDouble();
        return a;
    }

    public int pedirTemp (){
        System.out.println("Favor digite o tempo.");
        int t = scan.nextInt();
        return t;
    }

} // Fim da classe