import java.util.concurrent.Semaphore;

public class ThreadDeBusca implements Runnable {
    private String nomeArquivo, valor;
    private Semaphore semaphore;

    public ThreadDeBusca(String nomeArquivo, String valor, Semaphore s1) {
        this.nomeArquivo = nomeArquivo;
        this.valor = valor;
        this.semaphore = s1;
    }

    @Override
    public void run() {
        BuscaNome buscador = new BuscaNome();
        try {
            buscador.lerArquivo(nomeArquivo, valor, semaphore);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
