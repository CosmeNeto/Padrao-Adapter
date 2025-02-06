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

## ✅ Benefícios

- Reutilização de código legado
- Baixo acoplamento
- Flexibilidade de integração


## 📝 *Exemplo em Java*
### Interfaces: PagamentoAntigo e PagamentoNovo
- PagamentoAntigo: Define o método processarPagamentoLegado(double valor). Esse método não retorna nada, ou seja, é do tipo void. Ele provavelmente representa uma implementação antiga do processamento de pagamento.

- PagamentoNovo: Define o método processarPagamento(double valor). Este método retorna um valor booleano (true ou false) e é a versão nova do processamento de pagamentos.
```java
interface PagamentoAntigo {
    void processarPagamentoLegado(double valor);
}

interface PagamentoNovo {
    boolean processarPagamento(double valor);
}
```
### Classe AdapterPagamento:
Essa classe implementa a interface PagamentoNovo. Ou seja, ela é responsável por adaptar a interface nova para o uso da antiga.

Dentro da classe, há uma variável privada pagamentoAntigo do tipo PagamentoAntigo, que representa a implementação antiga do processamento de pagamentos.

O método processarPagamento(double valor) é implementado de acordo com a interface PagamentoNovo. Dentro desse método, ele chama o método processarPagamentoLegado(valor) da interface PagamentoAntigo, utilizando o valor recebido. Isso significa que a classe AdapterPagamento está adaptando o método da interface antiga para que ele se encaixe na interface nova.

```java
class AdapterPagamento implements PagamentoNovo {
    private PagamentoAntigo pagamentoAntigo;

    public boolean processarPagamento(double valor) {
        pagamentoAntigo.processarPagamentoLegado(valor);
        return true;
    }
}
```
