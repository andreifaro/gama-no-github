public class Pinguim extends Ave {

    private String nome;

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void comer() {
        System.out.println("Pinguim Comendo");
    }

    public Pinguim(String nomePinguim) {
        nome = nomePinguim;
    }

    public Pinguim() {
        nome = "";
    }

}