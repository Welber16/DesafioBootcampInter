import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arquivoDoPc = scanner.nextLine();

        if (arquivoDoPc.endsWith(".mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }

        scanner.close();
    }
}