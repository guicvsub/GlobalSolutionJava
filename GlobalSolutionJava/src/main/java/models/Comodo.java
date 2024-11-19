
package models;

import java.util.ArrayList;
import java.util.List;

public class Comodo extends Base {
    private int idComodo;
    private String nome;
    private float area;
    private List<Dispositivo> dispositivos;

    // Construtor
    public Comodo(int idComodo, String nome, float area) {
        this.idComodo = idComodo;
        this.nome = nome;
        this.area = area;
        this.dispositivos = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdComodo() {
        return idComodo;
    }

    public void setIdComodo(int idComodo) {
        this.idComodo = idComodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    // Métodos específicos
    public void adicionarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println("Dispositivo adicionado ao cômodo " + nome + ": " + dispositivo.getModelo());
    }

    public void listarDispositivos() {
        if (dispositivos.isEmpty()) {
            System.out.println("Nenhum dispositivo registrado no cômodo " + nome + ".");
        } else {
            System.out.println("Dispositivos no cômodo " + nome + ":");
            for (Dispositivo dispositivo : dispositivos) {
                System.out.println("- " + dispositivo);
            }
        }
    }

    // Métodos herdados da classe Base
    @Override
    public void salvar() {
        System.out.println("Cômodo \"" + nome + "\" salvo com sucesso!");
    }

    @Override
    public void atualizar() {
        System.out.println("Cômodo \"" + nome + "\" atualizado com sucesso!");
    }

    @Override
    public void deletar() {
        System.out.println("Cômodo \"" + nome + "\" deletado com sucesso!");
    }

    // Método toString para exibir informações do cômodo
    @Override
    public String toString() {
        return "Comodo{" +
                "idComodo=" + idComodo +
                ", nome='" + nome + '\'' +
                ", area=" + area +
                ", dispositivos=" + dispositivos.size() + " dispositivos" +
                '}';
    }
}
