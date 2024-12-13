public class FirstCharUpper {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));     // make upper case of charater which is on index 0
        sb.append(ch);                                          // append that char into sb

        for(int i=1; i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){       //check the spaces between to char and check space is not on last 
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));    // add that character to sb which is next to space with uppercasing
            }else{
                sb.append(str.charAt(i));               //add remaining elements same
            }
        }
        return sb.toString();               //convert sb to string
    }
    public static void main(String[] args) {
        String str = "hello, my name is pratik patil";
        System.out.println(toUpperCase(str));
    }    
}
