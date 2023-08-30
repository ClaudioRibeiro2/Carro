// Teste carro serve para passar valores para o construtor de carro.
public class TestarCarro {
    public static void main (String[] args){
        Carro carro1 = new Carro("Roxo","Subawu", 2023);
        Carro carro2 = new Carro("Preto","Mitsubishi", 2019);

        Tela tela = new Tela();

        System.out.printf("--_Carro 1_--%s%n", carro1);
        System.out.printf("--_Carro 2_--%s%n", carro2);

        carro1.acelerar(tela.pedirAcel(), tela.pedirTemp());
        carro2.acelerar(tela.pedirAcel(), tela.pedirTemp());

        System.out.printf("--_Carro 1_--%s%n", carro1);
        System.out.printf("--_Carro 2_--%s%n", carro2);        
    }
}