// Classe Carro,

public class Carro {
	// 1° ATRIBUTOS - DECLARAR modificador de acesso, tipo da variavel e nome dela
	private String cor;
	private String marca;
	private String modelo;
	private int ano;
	private int portas;
	private double vel;
	private double cilindradas;
	
	// 2° CONTRUTOR - ONDE INICIALIZA/RECEBE O VALOR DOS ATRIBUTOS DA CLASSE
	//				  Carro(Atributos que são required) 
	public Carro(String cor, String marca, String modelo, int ano, int portas, double cilindradas){
		this.vel = 0.0; // this que dizer o objeto instaciado
		setCor(cor);
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		setPortas(portas);
		setCilindradas(cilindradas);
	}
	
	// 3° MÉTODOS
	// Setter's & Getter's
	
	public void setCor(String cor){ // Recebe o valor que o construtor passa para ele. void não tem return 		
		this.cor = cor; // this é o instaciamento do objeto
	}
	public String getCor(){ // Método get retorna o valor instaciado no set
		return this.cor; 
	}
	// 					  PARAMETRO
	public void setMarca(String marca){		
		this.marca = marca;
	}
	public String getMarca(){
		return this.marca; 
	}	
	
	public void setModelo(String modelo){		
		this.modelo = modelo;
	}
	public String getModelo(){
		return this.modelo; 
	}	
	
	public void setAno(int ano){		
		this.ano = ano;
	}
	public int getAno(){
		return this.ano; 
	}
	
	public void setPortas(int portas){		
		this.portas = portas;
	}
	public int getPortas(){
		return this.portas; 
	}

	public void setCilindradas(double cilindradas){		
		this.cilindradas = cilindradas;
	}
	public double getCilindradas(){
		return this.cilindradas; 
	}	

	public double getVel(){ // vel não set()
		return this.vel;
	}
	
	// acelerar, buzinar, setaEsquerda, setaDireita
	
	public void acelerar(double a, int t){
		this.vel = getVel() + (a * t); // 'set' do vel
	}
	
	public void buzinar(boolean b, int qtde) {
		if (b == true){
			String a = "BI-BI";
			for (int i = 0; i < qtde; i ++){
			System.out.println(a);	
			}
		}
	}
	public void setaEsquerda(boolean e, int t){
		if (e == true){
			String a = "<<<<<<<";
			for (int i = 0; i < t; i ++){
			System.out.println(a);	
			}
		}		
	}
	
	public void setaDireita(boolean d, int t){
		if (d == true){
			String a = ">>>>>>>";
			for (int i = 0; i < t; i ++){
			System.out.println(a);	
			}
		}				
	}
	
	// Método toString() para enviar os resultados
	public String toString(){
		return String.format("%nCOR: %s%nMARCA: %s%nMODELO: %s%nANO: %d%nPORTAS: %s%nVELOCIDADE: %f%nCILINDRADAS: %.1f%n++++++++++++++++++++%n",
							 getCor(),
							 getMarca(),
							 getModelo(),
							 getAno(),
							 getPortas(),
							 getVel(),
							 getCilindradas());
							
	}
} // Fim da classe carro