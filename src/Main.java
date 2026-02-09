public class Main {
    public static void main(String[] args) {
        Usuario cliente = new Usuario();
        Livro primeiroLivro = new Livro();
        Livro segundoLivro = new Livro();

        primeiroLivro.setTitulo("Crime e Castigo");
        primeiroLivro.setAutor("Dostoiveski");
        primeiroLivro.setDisponivel(true);

        segundoLivro.setTitulo("Metamorfose");
        segundoLivro.setAutor("Kafka");
        segundoLivro.setDisponivel(false);

        cliente.setNome("Lucas");

        primeiroLivro.emprestimo(cliente);
        segundoLivro.emprestimo(cliente);
    }
}
