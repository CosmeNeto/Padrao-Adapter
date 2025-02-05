# *Padrão Adapter*

## 🔗 *Definição*
Converte a interface de uma classe para outra interface que os clientes esperam.

## 🎯 *Objetivo*
Permitir que classes com interfaces incompatíveis trabalhem juntas.

## 🧩 *Estrutura*
- Interface Alvo
- Interface Adapted (Adaptada)
- Classe Adapter

## 💡 *Caso de Uso*
Integração de sistemas de pagamento com interfaces diferentes.

## 📝 *Exemplo em Java*
```java
interface PagamentoAntigo {
    void processarPagamentoLegado(double valor);
}

interface PagamentoNovo {
    boolean processarPagamento(double valor);
}

class AdapterPagamento implements PagamentoNovo {
    private PagamentoAntigo pagamentoAntigo;

    public boolean processarPagamento(double valor) {
        pagamentoAntigo.processarPagamentoLegado(valor);
        return true;
    }
}
```
## ✅ Benefícios

- Reutilização de código legado
- Baixo acoplamento
- Flexibilidade de integração

