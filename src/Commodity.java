public class Commodity {

    private String nameProdact;
    private int longProdact;
    private int widthProdact;
    private int weightProdact;

    public Commodity(String nameProdact, int longProdact, int widthProdact, int weightProdact) {
        this.nameProdact = nameProdact;
        this.longProdact = longProdact;
        this.widthProdact = widthProdact;
        this.weightProdact = weightProdact;
    }

    public String getNameProdact() {
        return nameProdact;
    }

    public void setNameProdact(String nameProdact) {
        this.nameProdact = nameProdact;
    }

    public int getLongProdact() {
        return longProdact;
    }

    public void setLongProdact(int longProdact) {
        this.longProdact = longProdact;
    }

    public int getWidthProdact() {
        return widthProdact;
    }

    public void setWidthProdact(int widthProdact) {
        this.widthProdact = widthProdact;
    }

    public int getWeightProdact() {
        return weightProdact;
    }

    public void setWeightProdact(int weightProdact) {
        this.weightProdact = weightProdact;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "nameProdact='" + nameProdact + '\'' +
                ", longProdact='" + longProdact + '\'' +
                ", widthProdact='" + widthProdact + '\'' +
                ", weightProdact='" + weightProdact + '\'' +
                '}';
    }


}
