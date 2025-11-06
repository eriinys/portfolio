import java.util.*;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<Valuable>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double value = 0;
        for (Valuable valuable : assets){
            value += valuable.getValue();
        }
        return value;
    }

    public Valuable getMostValuable(){
        // Collections.sort(assets);
        // return assets.get(0);
        Collections.sort(assets);
        return assets.get(assets.size()-1);
    }

    public Valuable getLeastValuable(){
        Collections.sort(assets);
        return assets.get(0);
    }


}
