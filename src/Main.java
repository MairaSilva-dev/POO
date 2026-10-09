import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Pessoa1 p = new Pessoa1();

        System.out.println("Digite seu nome:");
        p.nome = ler.nextLine();

        System.out.println("Digite sua idade:");
        p.idade= ler.nextInt();

        System.out.println("Nome:" +p.nome);
        System.out.println("Idade:" + p.idade);

        p.verificarIdade();



    }
}