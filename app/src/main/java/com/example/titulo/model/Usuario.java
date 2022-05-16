package com.example.titulo.model;

public class Usuario {
    private int idade;
    private boolean votar;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVotar() {
        return votar;
    }

    public void setVotar(boolean votar) {
        this.votar = votar;
    }

    public void calcIdade(int nascimento, int anoAtual){
        this.idade = anoAtual - nascimento;
        this.votar = this.idade >= 16;
    }
}
