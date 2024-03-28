public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico;
    MemoriaUSB memoriaUSB;
    //exibe a configuração dos pcs:
    public void PCConfig() {
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " - " + sistemaOperacional.sist);
        for (HardwareBasico hardwareBasico : hardwareBasico) {
            System.out.println("Hardware Basico: " + hardwareBasico.nome + " - " + hardwareBasico.capacidade);
        }
        System.out.println("Memoria USB: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade);
    }


    //armazena os valores:
    public Computador(String nome, float preco, String nomeSO, int sistSO, HardwareBasico[] hardwaresBasicos) {
        this.marca = nome;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSO, sistSO);
        this.hardwareBasico = hardwaresBasicos;
    }



    //add à descrição o memoria
    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }
}
