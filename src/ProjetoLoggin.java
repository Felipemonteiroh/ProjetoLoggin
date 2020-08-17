import java.util.Scanner;

public class ProjetoLoggin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senha = "null";

        System.out.println("Digite seu nome completo");
        String nome = scanner.nextLine();

        StringBuilder ultimo = new StringBuilder("_");

                for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){
            if (i < nome.length()) {
                ultimo.append(nome.charAt(i));
            }
        }

        String login = nome.charAt(0)+ultimo.toString();


        System.out.println("Seu login é: " + login);


        System.out.println("Crie uma senha com no minimo 8 digitos " );
        System.out.println( "sua senha deve conter:");
        System.out.println( "letras maiuscula");
        System.out.println("letras miniscula");
        System.out.println("numeros");
        System.out.println( "caracteres especiais");



        boolean validaSenhaPadrao = false;

        while (validaSenhaPadrao == false){

            senha = scanner.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){
                System.out.println("Senha está dentro do padrão... direcionando para login...");
                validaSenhaPadrao = true;
            } else{
                System.out.println("Senha está fora do padrão... digite uma nova senha");
            }
        }


        boolean doLogin = false;

        while (doLogin == false){

            System.out.println("digite seu login");
                String login1 = scanner.nextLine();


            System.out.println("digite dua senha");
            String passaword = scanner.nextLine();

            if (login.equals(login) && passaword.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                doLogin = true;
            }else{
                System.out.println("Login ou senha invalido... tente novamente!");
            }
        }

 }
}






