package Sistema.Financeiro.api.pessoa;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


    Page<Pessoa> findByAtivoTrue(Pageable paginacao);

    Pessoa findByIdAndAtivoTrue(Long id);
}
