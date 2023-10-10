import java.util.Scanner;

public class Solution{
    boolean checkPrime(int num) {
        if (num == 0 || num == 1)
        return false;

        for(int i=2; i<num; ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    boolean sieve(int num) {
        boolean prime[]= new boolean[10001];
        for(int i = 0; i<10001; ++i){
            prime[i]=true;
        }

        prime[0] = false;
        prime[1] = false;

        for(int i=2; i<=Math.sqrt(10001); i++) {
            if(prime[i] == true) {
                for(int j=i*i; j<10001; j=j+i)
                {
                    prime[j] = false;
                }
            }
        }

        return prime[num] == true ? true : false;
    }
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int test = console.nextInt();
        for(int t = 0; t<test; ++t) {
            int num = console.nextInt();
        Solution p = new Solution();
        if(p.checkPrime(num))
        System.out.println(true);
        else
        System.out.println(false);
        }
        
        
    }
}