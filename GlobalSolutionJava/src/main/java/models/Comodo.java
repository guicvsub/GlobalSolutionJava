package models;

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
    public void adicionarDispositivo(){
    
    }
    public void listarDispositivos(){
    
    }
    
}
