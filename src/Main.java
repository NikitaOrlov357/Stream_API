import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        product1.setName("moloko");
        product1.setPrice(2000);
        product1.setType("product");
        product2.setName("shokolad");
        product2.setPrice(1500);
        product2.setType("product");
        product3.setName("cheese");
        product3.setPrice(90);
        product3.setType("product");
        product3.setName("cheese");
        product3.setPrice(1000);
        product3.setType("product");
        product4.setName("television");
        product4.setPrice(30000);
        product4.setType("electronics");
        product5.setName("gum");
        product5.setPrice(40);
        product5.setType("product");
        product6.setName("phone");
        product6.setPrice(20000);
        product6.setType("electronics");
        product7.setName("playStation");
        product7.setPrice(40000);
        product7.setType("electronics");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        Order order1 = new Order();
        order1.setId(111);
        order1.setRegistrationDate(new Date(1600592122));
        order1.setSale(0);
        order1.setPaymentDate(new Date(1600602122));

        order1.addProduct(product1);

        Order order2 = new Order();
        order2.setId(222);
        order2.setRegistrationDate(new Date(1610010022));
        order2.setSale(15);
        order2.setPaymentDate(new Date(1615000022));

        order2.addProduct(product2);
        order2.addProduct(product6);
        order2.addProduct(product7);

        Order order3 = new Order();
        order3.setId(333);
        order3.setRegistrationDate(new Date(1600020022));
        order3.setSale(0);
        order3.setPaymentDate(new Date(1600700022));

        order3.addProduct(product3);

        Order order4 = new Order();
        order4.setId(444);
        order4.setRegistrationDate(new Date(1600300022));
        order4.setSale(10);

        order4.addProduct(product4);

        Order order5 = new Order();
        order5.setId(555);
        order5.setRegistrationDate(new Date(1600500022));
        order5.setSale(20);

        order5.addProduct(product5);

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        HashMap<Product, Integer> countProducts = new HashMap<>();
        for (Order order: orders) {
            for (Product product: order.getProducts()) {
                countProducts.put(product, countProducts.getOrDefault(product, 0) + 1);
            }
        }
//достать топ 3
//                List<Order> result = orders.stream()
//                                .
//        System.out.println(result);


//                orders.stream()
//                .filter(i -> i.getTotalPrice() > 1000)
//                .forEach(i -> i.setSale(i.getSale() + 5));
//        System.out.println(orders);


//        Date date1 = new Date(1600400022);
//        Date date2 = new Date(1600600000);
//
//        List<Order> result = orders.stream()
//                .filter(i -> i.getRegistrationDate().after(date1) && i.getRegistrationDate().before(date2))
//                .collect(Collectors.toList());
//        System.out.println(result);
//
//
//        List<Order> result = orders.stream()
//                .filter(i -> i.getPaymentDate() == null)
//                .collect(Collectors.toList());
//        System.out.println(result);
//
//        List<Product> result = products.stream()
//                .filter(i -> i.getPrice() > 100)
//                .filter(i -> i.getType().equals("product"))
//                .collect(Collectors.toList())
//                ;
//
//        System.out.println(result);
//
//        List<Product> result = products.stream()
//                .peek(i -> {
//                    if(i.getType().equals("electronics")){
//                        i.setPrice((int) (i.getPrice() * 0.9));
//                    }
//                })
//                .collect(Collectors.toList())
//        ;
//        System.out.println(result);
//
//        List<Product> result = products.stream()
//                .filter(i -> i.getType().equals("electronics"))
//                .sorted(Comparator.comparing(Product::getName))
//                .collect(Collectors.toList())
//                ;
//        System.out.println(result);



    }
}
