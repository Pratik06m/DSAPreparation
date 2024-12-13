public class largestNum {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango","banana"};

        String largest = fruits[0]; // default value apple

        for(int i=1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){ // compare the fruits string by lexicographically
                largest =fruits[i];         // add the value in largest which is large from fruits array
                
            }
        }
        System.out.println(largest);

    }
}
