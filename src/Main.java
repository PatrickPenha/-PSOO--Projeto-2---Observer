public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        InterfaceUsuario ui = new InterfaceUsuario();
        SistemaLogistica logistica = new SistemaLogistica();
        ResponsavelLoja loja = new ResponsavelLoja();

        estoque.adicionarObservador(ui);
        estoque.adicionarObservador(logistica);
        estoque.adicionarObservador(loja);

        estoque.setQuantidade(100);
        estoque.setQuantidade(50);

        estoque.removerObservador(logistica);

        estoque.setQuantidade(20);
    }
}
