package KiwiAlgo.Arrays.KiwiBeginnerArray;

/**
 * This is a generic class, used to create the arrays and perform different
 * operations on it.
 * 
 * @author mdFazil
 * 
 */
class KiwiBeginnerArray<T> {
    private static final int maxLength = 10;
    private int size;
    private Object array[];

    /**
     * Constructor to create an Array Object.
     */
    public KiwiBeginnerArray() {
        this.array = new Object[maxLength];
        this.size = 0;
    }

    /**
     * Checks whether the array is empty or not, if empty it return true else false.
     * 
     * @return
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Helps to add an element into an Array.
     * 
     * @param val
     */
    public void add(T val) {
        ensureCapacity(size + 1);
        array[size] = val;
        size++;
    }

    /**
     * Initially array will be created in the fixed size, so always ensure that
     * array is capable to store the sepcific value in the specific index else it
     * will create an new array and make the current array object to refer the
     * newely created array, which also consist of the elements of the old arrays
     * 
     * @param capacity - Current index where the elements needs to be added
     */
    private void ensureCapacity(int capacity) {
        if (capacity > array.length) {
            int len = Math.max(array.length * 2, capacity);
            Object newArray[] = new Object[len];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    /**
     * delete at specific index
     * @param index - index of the element where the element needs to be removed
     */
    public void removeAt(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index :" + index + " of size " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
    }
    /**
     * It remove the specific element from the array
     * @param val
     */
    public void remove(T val) {
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(val)) {
                removeAt(i);
                flag =1;
            }
        }
        if(flag == 0){
            //Create a custom exception to throw "Pending"
        }
    }

    /**
     * Returns the length of the array instance.
     * @return - Size or length of the array, total number of elements present inside the array.
     */
    public int length() {
        return size;
    }

    /**
     * It will return the element from the specified index from the array.
     * @param index - Index of the required elements
     * @return - Value present inside the array at that particular index.
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index :" + index + " of size " + size);
        }
        return (T) array[index];
    }

}