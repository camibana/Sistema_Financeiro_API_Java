package Sistema.Financeiro.api.lancamento;

import Sistema.Financeiro.api.pessoa.Pessoa;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosListagemLancamento(Long id, String descricao,
                                      LocalDate dataPagamento,
                                      BigDecimal valor,
                                      TipoDeLancamento tipo) {

    public DadosListagemLancamento(Lancamento lancamento) {
        this(lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getDataPagamento(),
                lancamento.getValor(),
                lancamento.getTipo());
    }
}
