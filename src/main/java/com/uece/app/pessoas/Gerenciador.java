package com.uece.app.pessoas;

public class Gerenciador {
    
    public void executar(Aluno vetor[]){

        for (Aluno aluno : vetor) {
            System.out.println("Nome:" + aluno.getNome());
            System.out.println("Idade:" + aluno.getIdade());
            System.out.println("Matricula:" + aluno.getMatricula());
            if (aluno.getNota()>= 7.0){
                System.out.println("status:Aprovado");
            } else{
                System.out.println("status:Reprovado");
            }
            System.out.println("-----------------------");
        }
    }
}
