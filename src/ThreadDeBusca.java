import java.util.concurrent.Semaphore;

public class ThreadDeBusca implements Runnable {
    private String nomeArquivo, valor;
    private Semaphore semafaro;

    public ThreadDeBusca(String nomeArquivo, String valor, Semaphore semafaro) {
        this.nomeArquivo = nomeArquivo;
        this.valor = valor;
        this.semafaro = semafaro;
    }

    @Override
    public void run() {
        BuscaNome buscador = new BuscaNome();
        try {
            buscador.lerArquivo(nomeArquivo, valor, semafaro);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
