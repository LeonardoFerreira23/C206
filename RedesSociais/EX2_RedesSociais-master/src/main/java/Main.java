import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ENTRADA DE DADOS:
        Scanner entrada = new Scanner(System.in);

        //CRIA ARRAYS:
        RedeSocial redes[] = new RedeSocial[4];

        //CRIA USUÁRIO:
        Usuario user = new Usuario("Fernanda","ellensouza105@gmail.com");

        //INSTÂNCIA OBJETOS:
        GooglePlus google = new GooglePlus("1234", 500);
        Twitter twit = new Twitter("5421", 35);
        Instagram insta = new Instagram("7135", 489);
        Facebook face = new Facebook("5112", 1256);

        redes[0] = google;
        redes[1] = twit;
        redes[2] = insta;
        redes[3] = face;

        user.Usuario(redes);


    }
}



