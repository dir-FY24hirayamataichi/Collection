package sample;

public class ArraySample {

    public static void main(String[] args) {
        int numbers[] = new int[5];
        
        for(int i=0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
