import java.util.*;

public class DataAnalysis{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the number of data you want to add: ");
        int number_of_data= in.nextInt();
        
        int[] my_list= new int[number_of_data];
        int sum=0;
        System.out.println(String.format("Enter %d numbers one by one: ",number_of_data));

        for(int i=0;i<number_of_data;i++){
            int next_num= in.nextInt();
            my_list[i]= next_num;
            sum+=next_num;
        }

        System.out.println("Sum of the numbers is: " + sum);
        double avg=sum/number_of_data;
        System.out.println(String.format("Average of %d numbers is: "+ avg,number_of_data));
        

        for(int i=0;i<number_of_data;i++){
            if(my_list[i]>avg){
                System.out.println(my_list[i]+"*");
            }
            else{
                System.out.println(my_list[i]);
            }
        }
    }
}