public class SumNatural 
{
    
    public static void main(String[] args) {

        int num = 10000, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
