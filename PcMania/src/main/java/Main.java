//biblioteca para saída de dados:
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static Computador[] pc = new Computador[3];
    public static Cliente cliente;

    //entrada de dados e exibição das opções:
    public static void main(String[] args) {
        int opc;                                  //var auxiliar

        HardwareBasico[] hardwaresBasicos = new HardwareBasico[3];
        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i3", 1200.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 4.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 500.0f);
        pc[0] = new Computador("Positivo", 1300.0f, "Linux Ubuntu", 32, hardwaresBasicos);
        pc[0].addMemoriaUSB(new MemoriaUSB("Pendrive", 16));

        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i5", 2260.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 8.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 1000.0f);
        pc[1] = new Computador("Acer", 1800.0f, "Windows 8", 64, hardwaresBasicos);
        pc[1].addMemoriaUSB(new MemoriaUSB("Pendrive", 32));

        hardwaresBasicos[0] = new HardwareBasico("Pentium Core i7", 3500.0f);
        hardwaresBasicos[1] = new HardwareBasico("Memoria RAM", 16.0f);
        hardwaresBasicos[2] = new HardwareBasico("HD", 2000.0f);
        pc[2] = new Computador("Vaio", 2800.0f, "Windows 10", 64, hardwaresBasicos);
        pc[2].addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        //interface para os clientes:
        System.out.println("Seja bem vindo(a) a PCMania, a loja cm mania de vender barato! Primeiro, gostaríamos de saber o seu nome:");
        String nome = reader.nextLine();



        cliente = new Cliente(nome);

        //switch para escolha do cliente:
        do {
            //menu de opções:
            System.out.println("Prazer, " + nome);
            System.out.println("! Sinta-se a vontade para escolher um de nossos produtos:\n");
            System.out.println("Opcao -1 - Exibir promocao do dia de cada computador(1-3):\n");
            System.out.println("Opcao 1 -  Comprar computador <1>:\n");
            System.out.println("Opcao 2 - Comprar computador <3>:\n");
            System.out.println("Opcao 3 - Comprar computador <4>:\n");
            System.out.println("Opcao 0 - Sair\n");
            //exibição dos prod que o cliente selecionou:
            System.out.println("\nMeu carrinho: R$ ");
            System.out.println("R$: " + cliente.TotalCompra());
            opc = reader.nextInt();           //lê a entrada
            reader.nextLine();

            switch (opc) {
                case -1:
                    System.out.println("Escolha qual computador deseja ver a promocao: 1,2 ou 3? ");
                    opc  = reader.nextInt();
                    reader.nextLine();
                    pc[opc-1].PCConfig();
                    System.out.println("\n");

                case 1:
                    cliente.carrinho(pc[0]);
                    break;

                case 2:
                    cliente.carrinho(pc[1]);
                    break;

                case 3:
                    cliente.carrinho(pc[2]);
                    break;

                case 0:
                default:
                    System.out.println("Volte sempre!\n");
                    break;


            }
        } while (opc != 5);

        System.out.println("Total da compra: R$ " + cliente.TotalCompra());
        System.out.println("\nComputadores escolhidos: \n" + cliente.Computadores());
        System.out.println("\nNosso cliente em primeiro lugar!");

    }
}


