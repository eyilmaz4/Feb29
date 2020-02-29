package arrays_;

public class odd {
    public static void main(String[] args) {
            int sum=0;
            int total=0;
    int[] numbers ={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Odd numbers are:");
    for(int i=0; i<numbers.length; i++){
               if(numbers[i]%2!=0){
            System.out.print(" " + numbers[i]);
            total=total+1;
            //or istead of 11 and 12 lines put counter++(at the top int counter;
    }
}
        System.out.println("\n");
    System.out.println("Total of Odd numbers"+" "+total);
    }
}
