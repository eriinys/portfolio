public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(double karat,  String name, double marketValue){
        super(name, marketValue);
        this.karat = karat;
    }

    public double getValue(){
        return marketValue;
    }

    @Override
    public String toString(){
        String v = String.format("%s, %.2f", name, getValue());
        return v;
    }

}
