/*
8) How to print all permutation of a String
 */
public class String_program8 {
    public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
       program8 permutation = new program8(); 
        permutation.permute(str, 0, n-1); 
    } 
  
    /** 
    * permutation function 
    * @param str string to calculate permutation for 
    * @param l starting index 
    * @param r end index 
    */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
    * Swap Characters at position 
    * @param a string value 
    * @param i position 1 
    * @param j position 2 
    * @return swapped string 
    */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
}
