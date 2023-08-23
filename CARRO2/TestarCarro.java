public class TestarCarro {
	public static void main(String[] args){
		// Criando dois objetos (carro1 e carro2) e instaciando atributos.
		Carro carro1 = new Carro("AZUL","MITSUBISHI","LANCER",2010,4,2.0);
		Carro carro2 = new Carro("PRATA","TOYOTA","HILUX",2010,4,3.0);
		
		System.out.printf("++++++CARRRO 1++++++%s", carro1);
		System.out.printf("++++++CARRRO 2++++++%s", carro2);
		
		carro1.acelerar(10, 2);
		carro1.setCor("ROSA CHOQUE");
		carro2.acelerar(10, 3);
		carro2.setCor("AZUL MARINHO");
		
		System.out.printf("++++++CARRRO 1++++++%s", carro1);
		System.out.printf("++++++CARRRO 2++++++%s", carro2);
		
		carro1.buzinar(true, 3);
		carro2.buzinar(false, 4);
		carro1.setaDireita(true, 3);
		carro2.setaEsquerda(true, 4);
	}
}