package Mocks.Entidades;

import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
