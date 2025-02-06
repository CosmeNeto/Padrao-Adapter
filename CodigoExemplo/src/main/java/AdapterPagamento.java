class AdapterPagamento implements PagamentoNovo {
    private PagamentoAntigo pagamentoAntigo;

    public boolean processarPagamento(double valor) {
        pagamentoAntigo.processarPagamentoLegado(valor);
        return true;
    }
}