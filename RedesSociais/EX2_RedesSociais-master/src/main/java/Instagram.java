public class Instagram extends RedeSocial {
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto(String nome) {
        System.out.println(nome + " postou uma foto!");
    }

    @Override
    public void postarVideo(String nome) {
        System.out.println(nome + " postou um video!");
    }

    @Override
    public void postarComentario(String nome) {
        System.out.println(nome + " postou um comentario!");
    }

    @Override
    public void curtirPublicacao(String nome) {
        System.out.println(nome + " curtiu uma publicacao!");
    }


}