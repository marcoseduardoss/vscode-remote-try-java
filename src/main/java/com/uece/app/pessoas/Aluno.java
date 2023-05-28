package com.uece.app.pessoas;

public class Aluno {
    
    private String nome;
    private Integer idade;
    private String matricula;
    private double nota;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {

        if(nome==null)
            throw new RuntimeException("informe o nome!!!!");

        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }   
    
    
    

}
