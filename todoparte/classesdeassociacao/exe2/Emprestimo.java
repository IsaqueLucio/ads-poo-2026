import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    
    private LocalDate dataEmprestimo;
    private LocalDate dataDevoPrev;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {

    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevoPrev, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevoPrev = dataDevoPrev;
        this.leitor = leitor;
        this.livro = livro;
    }

    DateTimeFormatter formatadoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString() {
        return "\nInformações do Emprestimo \nData do emprestimo:" + dataEmprestimo.format(formatadoBr) + " \nData prevista para devolução:"
         + dataDevoPrev.format(formatadoBr)+ " \nInformações do leitor: \n" + leitor
                + " \nInformações do livro: \n" + livro + "\n";
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevoPrev() {
        return dataDevoPrev;
    }

    public void setDataDevoPrev(LocalDate dataDevoPrev) {
        this.dataDevoPrev = dataDevoPrev;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    
    
}
