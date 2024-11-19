package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gui
 */
public class Comodo {
    private int id; 
    private String nomeComodo;
    private Float area;

    public Comodo(int id, String nomeComodo, Float area) {
        this.id = id;
        this.nomeComodo = nomeComodo;
        this.area = area;
    }
   List<Dispositivo> listaDeDispositivos = new ArrayList<>();
    
   public Comodo(int id, String nomeComodo) {
        this.id = id;
        this.nomeComodo = nomeComodo;
    }

    public String getNomeComodo() {
        return nomeComodo;
    }

    public Float getArea() {
        return area;
    }

    public void setNomeComodo(String nomeComodo) {
        this.nomeComodo = nomeComodo;
    }

    public void setArea(Float area) {
        this.area = area;
    }
    public void adicionarDispositivo(Dispositivo dispositivo) {
        listaDeDispositivos.add(dispositivo);
    }
    public void listarDispositivos() {
        if (listaDeDispositivos.isEmpty()) {
            System.out.println("Nenhum dispositivo encontrado no cômodo.");
        } else {
            System.out.println("Dispositivos no cômodo " + nomeComodo + ":");
            for (Dispositivo dispositivo : listaDeDispositivos) {
                System.out.println(dispositivo);
            }
        }
    
    }
}
