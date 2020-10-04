import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        
        for(int i = 1; i<= t;i++)
        {
            int n = scn.nextInt();
            
            int ctr=0;
            for(int c = 2; c*c <= n; c ++)
            {
                if(n%c==0)
                {
                    ctr++;
                    break;
                }


            }
            if(ctr == 0){
                System.out.println("Prime");

            }
            else
            {
                System.out.println("Not Prime");
            }
            
        }
        scn.close();
    }

}
