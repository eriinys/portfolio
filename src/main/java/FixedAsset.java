public abstract class FixedAsset implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double value){
        this.name = name;
        this.marketValue = value;
    }

    public abstract double getValue();
}
