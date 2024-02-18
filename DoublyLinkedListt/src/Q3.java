public class Q3 {

    @Override
    public  boolean equals(Object obj) {
        if (!(obj instanceof DouList)) return false;
        DoubList other = (DouList) obj;

        return Objects.equals(this.toList(), other.toList());
    }

}
