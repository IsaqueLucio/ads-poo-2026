import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        
        Leitor lei1 = new Leitor("Isaque",101);
        Livro liv1 = new Livro("O Conde de Monte Cristo", "Alexandre Dumas", 123);

        LocalDate dataEmp = LocalDate.now();
        LocalDate dataDev = LocalDate.of(2026, 4, 20);

        Emprestimo empre1 = new Emprestimo(dataEmp, dataDev, lei1, liv1);
        System.out.println(empre1);
    }
}
