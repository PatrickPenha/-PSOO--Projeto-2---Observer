class ResponsavelLoja implements InterfaceObservador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Responsável pela Loja: " + mensagem);
    }
}