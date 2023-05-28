package com.uece.app.pessoas;

import com.uece.app.pessoas.*;

public class App {
    public static void main(String[] args) {
        try {


        Aluno vetor[] = new Aluno[2];

        vetor[0] = new Aluno();
        vetor[1] = new Aluno();

        vetor[0].setIdade(34);
        vetor[0].setNome("Maria");
        vetor[0].setMatricula("01");
        vetor[0].setNota(3.0);

        vetor[1].setIdade(16);
        vetor[1].setNome("carlos");
        vetor[1].setMatricula("02");
        vetor[1].setNota(10.0);


       Gerenciador gerenciador = new Gerenciador();

       gerenciador.executar(vetor);
            
        } catch (Exception e) {
            e.printStackTrace();
        }   

    }
}
