class InterfaceUsuario implements InterfaceObservador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Interface do Usuário: " + mensagem);
    }
}