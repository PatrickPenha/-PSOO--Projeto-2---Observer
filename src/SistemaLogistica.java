class SistemaLogistica implements InterfaceObservador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Sistema de Logística: " + mensagem);
    }
}