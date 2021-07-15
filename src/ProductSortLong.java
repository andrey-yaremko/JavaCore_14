import java.util.Comparator;

public class ProductSortLong implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        int long1 = o1.getLongProdact();
        int long2 = o2.getLongProdact();

        if (long1 > long2) {
            return 1;
        } else if (long1 < long2) {
            return -1;
        } else {
            return 0;
        }    }
}
