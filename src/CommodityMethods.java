import java.util.*;

public class CommodityMethods {

    List<Commodity> commoditySet = new ArrayList<>();

    public void  addProdact() {
        System.out.println("ВВедіть назву продукту");
        Scanner scanner = new Scanner(System.in);
        String nameProdact = scanner.nextLine();

        System.out.println("ВВедіть довжину продукту");
        scanner = new Scanner(System.in);
        int longProdact = scanner.nextInt();

        System.out.println("Введіть ширину продукту");
        scanner = new Scanner(System.in);
        int widthProdact = scanner.nextInt();

        System.out.println("Введіть вагу продукту");
        scanner = new Scanner(System.in);
        int weightProdact = scanner.nextInt();

        Commodity addProdacts = new Commodity(nameProdact, longProdact, widthProdact, weightProdact);

        commoditySet.add(addProdacts);
        for(Commodity c:commoditySet){
            System.out.println(c);
        }
    }

    public void removeProdact() {
        commoditySet.clear();
    }

    public void changeProdact() {
        System.out.println("ВВедіть індекс товару який ви хочете замінити");
        Scanner scanner = new Scanner(System.in);
        int productIndex = scanner.nextInt();

        System.out.println("ВВедіть назву продукту");
        scanner = new Scanner(System.in);
        String nameProdact = scanner.nextLine();

        System.out.println("ВВедіть довжину продукту");
        scanner = new Scanner(System.in);
        int longProdact = scanner.nextInt();

        System.out.println("Введіть ширину продукту");
        scanner = new Scanner(System.in);
        int widthProdact = scanner.nextInt();

        System.out.println("Введіть вагу продукту");
        scanner = new Scanner(System.in);
        int weightProdact = scanner.nextInt();

        Commodity addProdacts = new Commodity(nameProdact, longProdact, widthProdact, weightProdact);
        commoditySet.set(productIndex, addProdacts);
        System.out.println(commoditySet);

    }
    public void getProductSortName(){
        Collections.sort(commoditySet,new ProductSortName());
        for(Commodity c:commoditySet){
            System.out.println(c);
        }
    }

    public void getProductSortLong(){
        Collections.sort(commoditySet,new ProductSortLong());
        for(Commodity c:commoditySet){
            System.out.println(c);
        }
    }
    public void getProductSortWidth(){
        Collections.sort(commoditySet,new ProductSortLong());
        for(Commodity c:commoditySet){
            System.out.println(c);
        }
    }
    public void getProductSortWeight(){
        Collections.sort(commoditySet,new ProductSortLong());
        for(Commodity c:commoditySet){
            System.out.println(c);
        }
    }
    public void exitConsolle() {
        System.exit(0);
    }

}

