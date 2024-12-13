public class String_Compression {

    public static String compress(String str){
        String newStr = "";             // take this string empty to stored new string
        
        for(int i=0; i<str.length();i++){
            Integer count = 1;          // take this counter for counting duplicates

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) { // check first and second value should be same
                count++;            
                i++;
            }
            newStr += str.charAt(i);        //add character of index into new string 
            if(count > 1){                  // if counter is heated more than 1 times then
                newStr += count.toString();     // add that number of counter in the string
            }
        }
        return newStr;
    }

    public static String compressSB(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer counter = 1;

            while(str.charAt(i) == str.charAt(i+1) && i<str.length()-1){
                counter++;
                i++;
            }
            sb.append(str.charAt(i));
            if(counter > 1){
                sb.append(counter.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "mmmaaaaaddddddaaaarrrccccchhoooooodddddd";
        System.out.println(compress(str));
    }    
}
