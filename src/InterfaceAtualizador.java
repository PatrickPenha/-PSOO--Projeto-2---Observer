interface InterfaceAtualizador {
    void adicionarObservador(InterfaceObservador observer);

    void removerObservador(InterfaceObservador observer);

    void notificarObservadores(String mensagem);
}