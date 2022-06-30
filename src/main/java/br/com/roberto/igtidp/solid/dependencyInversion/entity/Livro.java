package br.com.roberto.igtidp.solid.dependencyInversion.entity;


public class Livro {
    private Long id;
    private String ispb;
    private String nome;


    public Livro(Long id, String ispb, String nome) {
        this.id = id;
        this.ispb = ispb;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIspb() {
        return ispb;
    }

    public void setIspb(String ispb) {
        this.ispb = ispb;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
