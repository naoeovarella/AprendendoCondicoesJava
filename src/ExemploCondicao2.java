import java.util.Scanner;

public class ExemploCondicao2 {

    //Quero adicionar um desconto gradativo
    // Valor maior q 1000 - 10%
    // Valor maior q 2000 - 20%
    // Valor maior q 3000 - 30%
    // Valor menor igual a 1000 - 0%

    public static void main(String[] args) {
        double valorBruto = 3000;
        double desconto = 0d;

        // Operadores Logicos
        // && e
        // || ou

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor Bruto :");
        valorBruto = scanner.nextDouble();

        if(valorBruto > 1000 && valorBruto <= 2000){
            desconto = valorBruto * 0.10;
        } else if(valorBruto > 2000 && valorBruto < 3000){
            desconto = valorBruto * (20 / 100);
        } else if(valorBruto >= 3000){
            desconto = valorBruto * (30 / 100);
        }

        System.out.println("Valor Bruto é : " + valorBruto);
        System.out.println("Valor do desconto é " + desconto);
        System.out.println("Valor Liquido é : " + (valorBruto - desconto));

    }

}
