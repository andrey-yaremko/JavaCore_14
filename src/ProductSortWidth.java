import java.util.Comparator;

public class ProductSortWidth implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        int width1 = o1.getWidthProdact();
        int width2 = o2.getWidthProdact();

        if (width1 > width2) {
            return 1;
        } else if (width1 < width2) {
            return -1;
        } else {
            return 0;
        }
    }
}
