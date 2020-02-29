package arrays_;

public class newArray {
    public static void main(String[] args) {
        String [] newArray={ "abc", "ab", "defgh", "fhtyuu", "h"};
       int counter=0;
        for(int i=0; i<newArray.length; i++){

            if(newArray[i].length()<4){
               counter++;
            }
        }
        System.out.println(counter);
    }
}
