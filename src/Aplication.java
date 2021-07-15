import java.util.*;

public class Aplication {

    public static void menu(){
        System.out.println("1 - Додати товар");
        System.out.println("2 - Видалити товар");
        System.out.println("3 - Замінити товар");
        System.out.println("4 - Сортувати за назвоню");
        System.out.println("5 - Сортувати за довжиною");
        System.out.println("6 - Сортувати за шириною");
        System.out.println("7 - Сортувати за вагою");
        System.out.println("8 - Вийти з програми");


    }

    public static void main(String[] args) {
        Set<Person> hashSet = new TreeSet<>();
        Person person1 = new Person(0,"Slavko");
        Person person2 = new Person(1,"Misko");
        Person person3 = new Person(2,"Bodko");
        Person person4 = new Person(3,"Petka");
        Person person5 = new Person(4,"Pociluyko");

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        hashSet.add(person5);

        for (Person person : hashSet){
            System.out.println(person);
        }

        CommodityMethods commodityMethods = new CommodityMethods();

        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()) {
                case "1": {
                    commodityMethods.addProdact();
                    break;
                }

                case "2": {
                    commodityMethods.removeProdact();
                    break;
                }
                case "3": {
                    commodityMethods.changeProdact();
                    break;
                }
                case "4": {
                    commodityMethods.getProductSortName();
                    break;
                }
                case "5": {
                    commodityMethods.getProductSortLong();
                    break;
                }
                case "6": {
                    commodityMethods.getProductSortWidth();
                    break;
                } case "7": {
                    commodityMethods.getProductSortWeight();
                    break;
                }
                case "8": {
                    commodityMethods.exitConsolle();
                }

            }
        }

    }
}
