package Sistema.Financeiro.api.lancamento;

import jakarta.validation.constraints.*;


import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosCadastroLancamento(@NotBlank String descricao,
                                      @NotNull @FutureOrPresent LocalDate dataVencimento,
                                      @NotNull @FutureOrPresent LocalDate dataPagamento,
                                      @NotNull @Positive BigDecimal valor,
                                      @Size(max = 250, message = "Limite máximo de 250 caracteres.")String observacao,
                                      @NotNull TipoDeLancamento tipo,
                                      @NotNull Long idCategoria,
                                      @NotNull Long idPessoa) {

}
