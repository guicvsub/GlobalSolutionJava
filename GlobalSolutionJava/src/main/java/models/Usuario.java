
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gui
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Base {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private List<Comodo> listaDeComodos;

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaDeComodos = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Comodo> getListaDeComodos() {
        return listaDeComodos;
    }

    // Métodos específicos
    public boolean autenticar(String email, String senha) {
        // Verifica se o email e a senha fornecidos coincidem com os do usuário
        if (this.email.equals(email) && this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionarComodo(String nomeComodo) {
        // Cria um novo cômodo e adiciona à lista
        Comodo novoComodo = new Comodo(listaDeComodos.size() + 1, nomeComodo, 0.0f);
        listaDeComodos.add(novoComodo);
        System.out.println("Cômodo " + nomeComodo + " adicionado com sucesso.");
    }

    public void listarComodos() {
        // Lista todos os cômodos do usuário
        System.out.println("=== Lista de Cômodos ===");
        for (Comodo comodo : listaDeComodos) {
            System.out.println("ID: " + comodo.getIdComodo() + ", Nome: " + comodo.getNome() + ", Área: " + comodo.getArea());
        }
    }

    // Métodos Base
    @Override
    public void salvar() {
        System.out.println("Usuário " + nome + " salvo com sucesso.");
    }

    @Override
    public void atualizar() {
        System.out.println("Usuário " + nome + " atualizado com sucesso.");
    }

    @Override
    public void deletar() {
        System.out.println("Usuário " + nome + " deletado com sucesso.");
    }
}
