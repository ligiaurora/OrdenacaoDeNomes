import java.util.concurrent.Semaphore;

public class ThreadDeBusca implements Runnable {
    private String nomeArquivo, valor;
    private Semaphore s1;

    // Construtor corrigido
    public ThreadDeBusca(String nomeArquivo, String valor, Semaphore s1) {
        this.nomeArquivo = nomeArquivo;
        this.valor = valor;
        this.s1 = s1;
    }

    @Override
    public void run() {
        BuscaNome buscador = new BuscaNome();
        try {
            buscador.lerArquivo(nomeArquivo, valor, s1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
