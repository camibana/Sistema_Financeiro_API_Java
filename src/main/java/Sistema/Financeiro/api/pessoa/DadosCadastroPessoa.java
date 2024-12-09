package Sistema.Financeiro.api.pessoa;

import Sistema.Financeiro.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(@NotBlank String nome, Boolean ativo,@NotNull @Valid DadosEndereco endereco) {
}
