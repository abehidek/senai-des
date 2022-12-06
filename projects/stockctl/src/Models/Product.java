package src.Models;

public class Product {
    private int id;
    private String name;
    private String type;
    private int qtd;

    public Product(int id, String name, String type, int qtd) { this.setId(id); this.setName(name); this.type = type; this.qtd = qtd; }

    public int getQtd() { return qtd; }

    public void setQtd(int qtd) { this.qtd = qtd; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
