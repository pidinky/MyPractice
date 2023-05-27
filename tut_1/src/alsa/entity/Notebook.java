package alsa.entity;

public class Notebook {

    private String name;
    private NotebookCategory category;
    private int price;

    // constructor

    public Notebook(String name, NotebookCategory category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public NotebookCategory getCategory() {
        return category;
    }

    public void setCategory(NotebookCategory category) {
        this.category = category;
    }
}
