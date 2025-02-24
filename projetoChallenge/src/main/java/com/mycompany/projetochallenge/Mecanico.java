package com.mycompany.projetochallenge;

public class Mecanico extends Usuario {
    private String especialidade;
    private int experiencia;
    private SistemaRanqueamento sistemaRanqueamento;

    public Mecanico(int id, String nome, String email, String senha, int experiencia, 
                    String especialidade, SistemaRanqueamento sistemaRanqueamento) {
        super(id, nome, email, senha);  
        if (experiencia < 0) {
            throw new IllegalArgumentException("A experiência não pode ser negativa.");
        }
        this.experiencia = experiencia;
        this.especialidade = especialidade;
        this.sistemaRanqueamento = sistemaRanqueamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isEmpty()) {
            throw new IllegalArgumentException("A especialidade não pode ser nula ou vazia.");
        }
        this.especialidade = especialidade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0) {
            throw new IllegalArgumentException("A experiência não pode ser negativa.");
        }
        this.experiencia = experiencia;
    }

    public SistemaRanqueamento getSistemaRanqueamento() {
        return sistemaRanqueamento;
    }

    public void setSistemaRanqueamento(SistemaRanqueamento sistemaRanqueamento) {
        if (sistemaRanqueamento == null) {
            throw new IllegalArgumentException("O sistema de ranqueamento não pode ser nulo.");
        }
        this.sistemaRanqueamento = sistemaRanqueamento;
    }

    @Override
    public String toString() {
        return "Mecânico{" +
                
                ", Nome='" + getNome() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Experiência=" + experiencia +
                ", Especialidade='" + especialidade + '\'' +
                ", Nota Média=" + (sistemaRanqueamento != null ? sistemaRanqueamento.getNotaMedia() : "N/A") +
                '}';
    }

    // Métodos específicos para a classe Mecanico
    public void consultarPedidos() {
        System.out.println("Consultando pedidos do mecânico: " + getNome());
    }

    public void responderConsulta() {
        System.out.println("Respondendo consulta do mecânico: " + getNome());
    }
}
