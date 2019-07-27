import java.util.ArrayList;

public class TestInvoiceItem{
    public static void main(String[] args) {
        InvoiceItem item1 = new InvoiceItem("1", "Toothpaste", 1, 3.29);
        InvoiceItem item2 = new InvoiceItem("2", "Apples", 5, 0.4);
        InvoiceItem item3 = new InvoiceItem("3", "Bananas", 12, 0.28);

        ArrayList <InvoiceItem> invoice = new ArrayList<InvoiceItem>();
        invoice.add(item1);
        invoice.add(item2);
        invoice.add(0, item3);

        double total = 0.0;

        for (InvoiceItem i : invoice){
            System.out.println(i.toString());
            total += i.getTotal();
        }

        System.out.println("Invoice total: " + total);
    }
}