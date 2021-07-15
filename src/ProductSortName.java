import java.util.Comparator;

public class ProductSortName implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        String name1 = o1.getNameProdact();
        String name2 = o2.getNameProdact();

        return name1.compareTo(name2);
    }
}
