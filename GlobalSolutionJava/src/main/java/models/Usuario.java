
package models;

/**
 *
 * @author gui
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String Senha;

    public Usuario(int id, String nome, String email, String Senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.Senha = Senha;
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

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    public void autenticar(String email, String senha) {
    // Verifica se o email e a senha fornecidos coincidem com o do usuário
     if (this.email.equals(email) && this.Senha.equals(senha)) {
        System.out.println("Usuário autenticado com sucesso!");
    } else {
        System.out.println("Falha na autenticação. E-mail ou senha incorretos.");
    }
}

    public void registrarComodo(){
        
        
    }
    public void gerarRelatorio(){
        
        
    }
}
