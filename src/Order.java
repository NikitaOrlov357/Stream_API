import java.util.ArrayList;
import java.util.Date;
public class Order {
    private int id;
    private Date registrationDate;
    private Date paymentDate;
    private int sale = 0;
    private final ArrayList<Product> products = new ArrayList<>();

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) throws PaymentDateException {
        int i = paymentDate.compareTo(registrationDate);
        if(paymentDate.before(registrationDate)){
            throw new PaymentDateException();
        }
        this.paymentDate = paymentDate;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void setSale(int sale){
        this.sale = sale;
    }

    public int getSale() {
        return sale;
    }

    public double getTotalPrice(){
           return products.stream()
                   .mapToDouble(i -> i.getPrice() * (100 - sale)/100.0)
                   .sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", registrationDate=" + registrationDate +
                ", paymentDate=" + paymentDate +
                ", sale=" + sale +
                ", products=" + products +
                '}';
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
