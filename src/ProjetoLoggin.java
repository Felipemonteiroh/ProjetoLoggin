import java.util.Scanner;

public class ProjetoLoggin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie um login");

        String login1 = scanner.nextLine();


        System.out.println("Crie uma senha com no minimo 8 digitos " );
        System.out.println( "sua senha deve conter:");
        System.out.println( "letras maiuscula");
        System.out.println("letras miniscula");
        System.out.println("numeros");
        System.out.println( "caracteres especiais");


        String senha = scanner.nextLine();


        if (senha.length() >=8){
        System.out.println("senha valida");

        }else {
            System.out.println("senha nao possui requisitos minimos");

        }

        System.out.println("digite seu login");
        String login2 = scanner.nextLine();

        if(login1.equals(login2)){
            System.out.println("login correto");
        }else{
            System.out.println("login incorreto");
        }


            System.out.println("digite dua senha");

            String passaword = scanner.nextLine();


            if (passaword.equals(senha)){
                System.out.println("senha valida");
            }
            else {
                System.out.println("senha invalida");
            }




 }
}





