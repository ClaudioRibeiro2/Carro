// Teste carro serve para passar valores para o construtor de carro.
public class TestarCarro {
    public static void main (String[] args){
        Carro carro1 = new Carro("Roxo","Subawu", 2023);
        Carro carro2 = new Carro("Preto","Mitsubishi", 2019);

        System.out.printf("--_Carro 1_--%s%n", carro1);
        System.out.printf("--_Carro 2_--%s%n", carro2);

        carro1.acelerar(-5.0, 2);
        carro2.acelerar(10.0, 2);

        System.out.printf("--_Carro 1_--%s%n", carro1);
        System.out.printf("--_Carro 2_--%s%n", carro2);        
    }
}