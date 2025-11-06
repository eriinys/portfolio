public interface Valuable extends Comparable<Valuable> {
    //bounds Comparable generics to Valuable instead of random object

    double getValue();

    default int compareTo(Valuable that) {
        return Double.compare(this.getValue(), that.getValue());
    }
}
