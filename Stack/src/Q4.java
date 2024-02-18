public class Q4 {

    @Override
    public ArrayStack<E> clone() {
        try {
            @SuppressWarnings("unchecked")
            ArrayStack<E> cloned = (ArrayStack<E>) super.clone();
            cloned.elements = elements.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
