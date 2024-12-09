package Sistema.Financeiro.api.pessoa;

import Sistema.Financeiro.api.endereco.Endereco;

public record DadosDetalhamentoPessoa(Long id, String nome, Endereco endereco) {
    public DadosDetalhamentoPessoa(Pessoa pessoa) {
        this(pessoa.getId(),
                pessoa.getNome(),
                pessoa.getEndereco());
    }

}
