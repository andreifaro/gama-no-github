public class Animal {

    private double tamanho; // em centimetros
    private double peso; // em kgs
    private String cor;
    private String raca;
    private String especie;
    private boolean agressivo;
    private String nome;

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String novoNome) {
        String nome = novoNome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }

    public void cuidadoclass() {
        System.out.println("Entrou no Hospital");
        System.out.println("Tratado com sucesso");
    }

    public String getRaca() {
        return raca;
    }

    public Animal() {

    }

    public void emitirSom() {
    }

    public void comer() {
        System.out.println("Animal");
    }

    public void xixi() {
    }

    public void coco() {
    }

    public void beber() {
    }

}