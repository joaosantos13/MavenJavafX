package com.projetolp;


public class User {
    private String nome = "";
    private int num = 0;

    public User(String nome, int num) {
        this.nome = nome;
        this.num = num;
    }

    public User() 
    {
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String Teste(String nome, int num)
    {
        String qntd = nome;
        if(num <= 0)
        {
            qntd = "";
        }
        for(int i = 1; i < num; i++)
        {
            qntd = qntd + nome;
        }
        return qntd;
    }
}
