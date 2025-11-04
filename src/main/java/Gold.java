public class Gold extends FixedAsset{
    private double weight;

    public Gold(double weight, String name, double marketValue){
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
