import java.util.Scanner;
 
public class bancocompleto {
 
    public static void main(final String[] args) {

        final Scanner leitor = new Scanner(System.in);
        int n = 0;
        double valor;
        double saldobob=0;
        double saldoalice=0;
        String contanome01="";
        String contanome02="";
        int deposito;
        int conta; 
        int opcaobanco;

        do 
        {    
        System.out.println("\nBEM VINDO AO ITAU \n1-Criar Usuario Alice\n2-Criar Usuario BOB\n3-Transferir Alice para BOB\n4-Transferir BOB para Alice\n5-Exibir Saldo\n6-Deposito\n7-Sair do programa\n");
        opcaobanco = leitor.nextInt();
        switch (opcaobanco) {
            case 1:
                if (contanome01 != "001 - Alice"){
                saldoalice = 0;
                contanome01= "001 - Alice";
                System.out.println("Usuario Alice Criado, Conta Corrente: '001'- saldo: " + saldoalice +"\nDeseja realizar o primeiro deposito? 1-Sim/2-Nao");
                deposito = leitor.nextInt();
                    switch (deposito) {
                        case 1:
                        System.out.println ("Digite o valor a ser depositado: ");
                        valor = leitor.nextDouble();
                        saldoalice = saldoalice + valor;
                        System.out.print ("Deposito efetuado com sucesso! Saldo: R$" + saldoalice +"\n\n");
                        break;    
                        case 2: 
                             System.out.print ("Ok, voltando ao Menu");
                             break;
                        default:
                        System.out.print ("Opcao invalida, voltando ao Menu");
                        break;}} else {
                            System.out.println("Conta da Alice já existe");
                        }
                break;
            case 2:
            if (contanome02 != "002 - Bob"){
                saldobob = 0;
                contanome02= "002 - Bob";
                System.out.println("Usuario Bob Criado, Conta Corrente: '002'- saldo: " + saldobob +"\nDeseja realizar o primeiro deposito? 1-Sim/2-Nao");
                deposito = leitor.nextInt();
                    switch (deposito) {
                        case 1:
                            System.out.print ("Digite o valor a ser depositado: ");
                            valor = leitor.nextDouble();
                            saldobob = saldobob + valor;
                            System.out.print ("Deposito efetuado com sucesso! Saldo: R$" + saldobob +"\n\n");
                            break;    
                        case 2: 
                             System.out.print ("Ok, voltando ao Menu");
                             break;
                        default:
                        System.out.print ("Opcao invalida, voltando ao Menu");
                        break;}} else {
                            System.out.println("Conta do Bob já existe");
                        }
                break;
            case 3:
                valor = 0;
                System.out.print("Digite o Valor de Transferencia - Alice -> Bob : R$");
                valor = leitor.nextDouble();
                        if (saldoalice >= valor && contanome02 == "002 - Bob" && contanome01 == "001 - Alice") {
                        saldoalice = saldoalice - valor;
                        saldobob = saldobob + valor;
                        System.out.print("Transefencia realizada com sucesso\n");
                    }
                    else {
                         System.out.print("Transefencia nao autorizada, saldo insuficiente ou conta nao criada");
                    }
                break;
            case 4:
            valor = 0;
            System.out.print("Digite o Valor de Transferencia - Bob -> Alice : R$");
            valor = leitor.nextDouble();
                if (saldobob >= valor && contanome02 == "002 - Bob" && contanome01 == "001 - Alice") {
                    saldoalice = saldoalice + valor;
                    saldobob = saldobob - valor;
                    System.out.print("Transefencia realizada com sucesso\n");
                }
                else {
                     System.out.print("\nTransefencia nao autorizada, saldo insuficiente ou conta nao criada");
                }
            break;
            case 5:
                System.out.print("Contas Criadas atualmente:" +"\n" +contanome01 +"\n" +contanome02);
                System.out.print("\n\nDigite a conta que gostaria de verificar o saldo\n");
                conta = leitor.nextInt();
                    switch (conta){
                        case 001:
                        System.out.print("\nSaldo da conta" + contanome01 +" :" + saldoalice +"\n\n");
                        break;
                        case 002:
                        System.out.print("\nSaldo da conta" + contanome02 +" :" + saldobob +"\n\n");
                        break;
                        default:
                        System.out.println("\nConta Nao Encontrada");
                        break;
                    }                
                break;
            case 6:
            System.out.print("Contas Criadas atualmente:" +"\n" +contanome01 +"\n" +contanome02);
            System.out.print("\n\nDigite a conta que gostaria de realizar o Deposito\n");
            conta = leitor.nextInt();
                switch (conta){
                    case 001:
                        if (contanome01 == "001 - Alice") {
                            valor = 0;
                            System.out.print("Digite o Valor do Deposito : R$");
                            valor = leitor.nextDouble();
                            saldoalice = saldoalice + valor;
                            System.out.print("Deposito realizado com sucesso\n");
                            System.out.print("\nSaldo da conta" + contanome01 +" :" + saldoalice +"\n\n");
                    }else
                        System.out.print("Deposito nao realizado, conta inexistente\n");
                    break;
                    case 002:
                    if (contanome02 == "002 - Bob") {
                        valor = 0;
                        System.out.print("Digite o Valor do Deposito : R$");
                        valor = leitor.nextDouble();
                        saldobob = saldobob + valor;
                        System.out.print("Transefencia realizada com sucesso\n");
                        System.out.print("\nSaldo da conta" + contanome02 +" :" + saldobob +"\n\n");
                     }else
                        System.out.print("Deposito nao realizado, conta inexistente\n");
                    break;
                    default:
                        System.out.println("\nConta Nao Encontrada");
                    break;
                }
                break;
            case 7:
                n++;
                break;

            default:
                break;
            
            }
        } while (n <=0 );
        }
}