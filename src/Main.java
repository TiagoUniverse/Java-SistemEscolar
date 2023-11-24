import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//       double x ,a , y , b ;
//
//
//       System.out.println("Digite o valor de x: ");
//       x = scanner.nextDouble();
//
//        System.out.println("Digite o valor de y: ");
//        y = scanner.nextDouble();
//
//        System.out.println("Digite o valor de b: ");
//        b = scanner.nextDouble();
//
//       //Soma
//        a  = x + y;
//        System.out.println("Soma " + a);
//
//        //Subtração
//
//        a = x - y;
//        System.out.println("Subtração " + a);
//
//
//        //Divisão
//        a = x /y;
//        System.out.println("Divisão " + a);
//
//        // Multiplicação
//        a = x * y;
//        System.out.println("Multiplicação " + a);
//
//        //Resto %
//        a = y % b;
//        System.out.println("Resto da divisão: " + a);
//
////       System.out.println(a);
//
//
//        if (x <= 6){
//            System.out.println("\n x é menor ou igual a 6");
//        } else if (x  != 10 && x > 7 ){
//            System.out.println("X é maior que 7 e não é igual a 10");
//        } else{
//            System.out.println("\n x é menor que 6 ");
//        }



//        Média
//        double media = 0;
//
//        media = (x + y + b ) / 3;
//
//        if (media >= 7){
//            System.out.println("O aluno passou com a média de: " + media);
//        } else {
//            System.out.println("O aluno não passou, com a média de: " + media);
//        }


//        Nome do aluno
        String nome, email, resultado;
        double nota1, nota2, nota3, media;

        System.out.println("Qual o nome do aluno: ");
        nome = scanner.next();

        System.out.println("Qual o email do aluno? ");
        email = scanner.next();

        System.out.println("Por favor, informe a 1ª nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Por favor, informe a 2ª nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Por favor, informe a 3ª nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3)/3;


        if (media >= 7){
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("-------------------------");
        System.out.println("Seja bem vindo, aluno " + nome);
        System.out.println("O email do aluno é: " + email);
        System.out.println("------------------");

        String mediaFinal = String.format("%.1f", media);
        System.out.println("O resultado foi: " + resultado + ",media: " +  mediaFinal);


       scanner.close();
    }
}