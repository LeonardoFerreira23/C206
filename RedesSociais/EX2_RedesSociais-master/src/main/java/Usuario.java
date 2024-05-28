public class Usuario {
    private String nome;
    private String email;

    //CONSTRUTOR:
    public Usuario(String nome, String email) {
        this.nome = nome;
        setNome(nome);
        this.email = email;
        setEmail(email);
    }

    //GETTER/SETTER:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Usuario(RedeSocial[] redesSociais){
        for (int i = 0; i < redesSociais.length; i++) {
            if (redesSociais[i] != null) {
                if (redesSociais[i] instanceof Facebook) {
                    System.out.println(getNome() + " esta usando o Facebook:");
                    Facebook f = (Facebook) redesSociais[i];
                    f.fazStreaming(getNome());
                    f.curtirPublicacao(getNome());
                    f.compartilhar(getNome());
                    System.out.println("--------------------------------------");
                }
                if (redesSociais[i] instanceof Instagram) {
                    Instagram in = (Instagram) redesSociais[i];
                    System.out.println(getNome() + " esta usando o Instagram:");
                    in.postarFoto(getNome());
                    in.postarVideo(getNome());
                    in.postarComentario(getNome());
                    System.out.println("--------------------------------------");

                }


            }
        }
    }

}
