package Sistema.Financeiro.api.pessoa;

import Sistema.Financeiro.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(@NotNull Long id, String nome, DadosEndereco endereco) {
}
