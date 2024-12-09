package Sistema.Financeiro.api.pessoa;


import Sistema.Financeiro.api.endereco.Endereco;

public record DadosListagemPessoa(Long id, String nome, Endereco endereco) {
    public DadosListagemPessoa(Pessoa pessoa) {
        this(pessoa.getId(),
                pessoa.getNome(),
                pessoa.getEndereco());
    }

}
