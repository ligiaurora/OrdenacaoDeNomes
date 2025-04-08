import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
public class BuscaNome {
    public void lerArquivo(String nomeArquivo, String valor, Semaphore s1) throws InterruptedException {
        s1.acquire();
        File arquivo = new File(nomeArquivo);
        int i = 1;

        try {
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                if(linha.toUpperCase().contains(valor.toUpperCase()))
                    System.out.println(nomeArquivo + " - linha: " + i + " - " + linha);
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        s1.release();
    }
}
