import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Leao> listaLeoes = new ArrayList<Leao>();
        List<Pinguim> listaPinguins = new ArrayList<Pinguim>();
        List<Avestruz> listaAvestruzes = new ArrayList<Avestruz>();

        int opcaoSelecionada;
        do {

            menuPrincipal();
            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("Selecione o animal que deseja incluir");
                    System.out.println("1 - Leao");
                    System.out.println("2 - Pinguim");
                    System.out.println("3 - Avestruz");
                    System.out.print("Deigite aqui > ");
                    int animalSelecionado = leitor.nextInt();

                    switch (animalSelecionado) {
                        case 1:
                            Leao novoLeao = new Leao();
                            listaLeoes.add(novoLeao);
                            break;
                        case 2:
                            Pinguim novoPinguim = new Pinguim();
                            listaPinguins.add(novoPinguim);
                            break;
                        case 3:
                            Avestruz novoAvestruz = new Avestruz();
                            listaAvestruzes.add(novoAvestruz);
                            break;

                        default:
                            break;
                    }

                    break;
                case 2:

                    for (int contador = 0; contador < listaLeoes.size(); contador++) {
                        Leao elemento = listaLeoes.get(contador);
                        elemento.comer();
                    }

                    for (int contador = 0; contador < listaPinguins.size(); contador++) {
                        Pinguim elemento = listaPinguins.get(contador);
                        elemento.comer();
                    }

                    for (int contador = 0; contador < listaAvestruzes.size(); contador++) {
                        Avestruz elemento = listaAvestruzes.get(contador);
                        elemento.comer();
                    }

                    break;
                case 3:
                    System.out.println("----REALIZAR CUIDADOS MÉDICOS----");
                    System.out.println("Selecione o animal que deseja incluir");

                    int ids = 1;

                    for (int contador = 0; contador < listaLeoes.size(); contador++) {
                        Leao elemento = listaLeoes.get(contador);
                        System.out.println(ids + "- Leão ");
                        ids++;
                    }

                    for (int contador = 0; contador < listaPinguins.size(); contador++) {
                        Pinguim elemento = listaPinguins.get(contador);
                        System.out.println(ids + "- Pinguim " + elemento.getNome());
                        ids++;
                    }

                    for (int contador = 0; contador < listaAvestruzes.size(); contador++) {
                        Avestruz elemento = listaAvestruzes.get(contador);
                        System.out.println(ids + " - Avestruz ");
                        ids++;
                    }

                    System.out.print("Deigite aqui > ");
                    String animalCuidado = leitor.nextLine();

                    for (int i, n=0; i < listaAvestruzes.size() && n !=1; i++)
                    {
                        Animal animaltemp = (Animal) listaAvestruzes.get(i);
                        if(animalCuidado == ((Animal) (listaAvestruzes.get(i))).getNome())
                        {   
                            System.out.println("Animal Está sendo encaminhado para tratamento");
                            animalCuidado.cuidadoclass();
                            n++;
                        } 
                        else {
                            System.out.println("Animal nao existe");

                    }

                }
                    break;

                case 99:
                    Leao leo = new Leao();
                    listaLeoes.add(leo);

                    Pinguim pingo = new Pinguim("pingo");
                    listaPinguins.add(pingo);

                    Pinguim pongo = new Pinguim("pongo");
                    listaPinguins.add(pongo);

                    Avestruz avenildo = new Avestruz();
                    listaAvestruzes.add(avenildo);

                    break;

                default:
                    System.out.println("Opção Invalida. Digite novamente!");
                    break;
            }

        } while (opcaoSelecionada != 0);

    }

    public static void adicionarNovoAnimal() {

    }

    public static void cuidadosMedicos() {

    }

    public static void alimentar() {
    }

    public static void menuPrincipal() {
        System.out.println("---NOSSO ZOOLOGICO---");
        System.out.println("1 - Incluir novo Animal");
        System.out.println("2 - Alimentar o animal");
        System.out.println("3 - Cuidados Médicos");
        System.out.println("99 - Carregar Dados (apenas para testes)");
        System.out.println("0 - Sair");
    }

}