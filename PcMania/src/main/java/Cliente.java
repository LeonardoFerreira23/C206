public class Cliente {
    String nome;
    Computador[] pc = new Computador[10];

    public Cliente(String nome) {
        this.nome = nome;
    }

    //calcular o total da compra:
    public float TotalCompra() {
        float total = 0;
        for (Computador computador : pc) {
            if (computador != null) {
                total += computador.preco;
            }
        }
        return total;
    }

    //exibir o carrinho:
    public void carrinho(Computador computador) {
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] == null) {
                pc[i] = computador;
                break;
            }
        }
    }

    //exibir os computadores adquiridos:
    public String Computadores() {
        String result = " ";
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                result += "" + pc[i].marca + "\n";
            }
        }
        return result;
    }

}
