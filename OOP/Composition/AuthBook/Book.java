class Book{
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){ return this.name; }
    public Author[] getAuthors() { 
        // int size = this.author.length;
        // String[] names = {};
        // for (int i = 0; i < size; i++){
        //     names[i] = this.author[i].getName();
        // }
        return this.author; 
    }
    public double getPrice() {return this.price; }
    public void setPrice(double price){ this.price = price; }
    public int getQty(){ return this.qty; }
    public void setQty(int qty){ this.qty = qty; }
    public String toString(){
        return "Book[name=" + this.name + ",authors={" + this.author.toString() + "},price="  + this.price + ",qty= " + this.qty + "]";
    }
    // public String getAuthornames(){
    //     this.author.getN
    // }
}