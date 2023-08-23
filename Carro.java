public class Carro { // Declarar classe Carro
    // Declarando os atributos da classe
    private String cor;
    private String marca;
    private double velocidade;
    private int ano; 

    // Construtor da classe
    public Carro (String cor, String marca, int ano) {
        this.velocidade = 0.0;
        setCor(cor); // setCor() vai receber o valor da cor que o construtor recebe.
        setMarca(marca);
        setAno(ano);
    }
    // Getter's & Setter's da classe

    public void setCor(String cor){ // Recebe o valor que o constutor passa para ele. void não tem return
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public double getVelocidade(){ // Velocidade não tem set()
        return this.velocidade;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public void acelerar(double a, int t){ // 10 m/s
        this.velocidade = getVelocidade() + (a * t);
    }

    public String toString(){
        return String.format("%nCOR: %s%nMARCA: %s%nVELOCIDADE: %f m/s%nANO: %d%n------------%n",
                              getCor(),
                              getMarca(),
                              getVelocidade(),
                              getAno());
    }
} // Fim da classe Carro