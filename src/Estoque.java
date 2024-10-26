import java.util.ArrayList;
import java.util.List;

class Estoque implements InterfaceAtualizador {
    private List<InterfaceObservador> observadores = new ArrayList<>();
    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores("Estoque atualizado para " + quantidade + " unidades.");
    }

    @Override
    public void adicionarObservador(InterfaceObservador observer) {
        observadores.add(observer);
    }

    @Override
    public void removerObservador(InterfaceObservador observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (InterfaceObservador observer : observadores) {
            observer.atualizar(mensagem);
        }
    }
}