import java.util.Comparator;

public class ProductSortWeight implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        int weight1 = o1.getWeightProdact();
        int weight2 = o2.getWeightProdact();

        if (weight1 > weight2) {
            return 1;
        } else if (weight1 < weight2) {
            return -1;
        } else {
            return 0;
        }    }
}
