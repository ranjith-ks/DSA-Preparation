/*
Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.
Implement the ProductOfNumbers class:
ProductOfNumbers() Initializes the object with an empty stream.
void add(int num) Appends the integer num to the stream.
int getProduct(int k) Returns the product of the last k numbers in the current list. You can assume that always the current list has at least k numbers.
The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.
*/

class ProductOfNumbers {
    private List<Integer> prefProd;
    int size;

    public ProductOfNumbers() {
        prefProd = new ArrayList<>();
        prefProd.add(1);
        size = 1;
    }

    public void add(int num) {
        if(num==0)
        {
            prefProd = new ArrayList<>();
            prefProd.add(1);
            size = 0;
        }
        else
            prefProd.add(prefProd.get(size-1)*num);
        size++;
    }

    public int getProduct(int k) {
        return k<size? prefProd.get(size-1)/prefProd.get(size-k-1):0;
    }
}