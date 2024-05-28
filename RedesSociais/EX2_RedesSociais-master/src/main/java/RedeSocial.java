public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    //CONSTRUTOR:
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        setSenha(senha);
        this.numAmigos = numAmigos;
        setNumAmigos(numAmigos);
    }


    //MÉTODOS:
    public abstract void postarFoto(String nome);

    public abstract void postarVideo(String nome);

    public abstract void postarComentario(String nome);

    public abstract void curtirPublicacao(String nome);

    //SETTER/GETTER:
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}


