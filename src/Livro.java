public class Livro {

    private String autor;
    private String titulo;
    private Boolean disponivel;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor ) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestimo(Usuario u) {
        if (!disponivel) {
            System.out.println("Desculpe " + u.getNome() + ", mas este livro já foi emprestado!");
        } else {
            System.out.println("Você pode pegar emprestado, " + u.getNome() + "!");
            this.disponivel = false;
        }
    }

}
