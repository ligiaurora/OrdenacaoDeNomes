import java.util.concurrent.Semaphore;


public class Main {
    public static void main(String[] args) {
        Semaphore s1 = new Semaphore(2);

        for (int i = 0; i < 10; i++) {
            Thread busca = new Thread(new ThreadDeBusca("arquivosNomes/nomescompletos-0" + i + ".txt", "Laerte", s1));
            busca.start();
        }
    }
}
