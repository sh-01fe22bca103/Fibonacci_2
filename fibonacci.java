public class fibonacci {
    
        public static void main(String[] args) {
        int n1,n2,n3,i,count;
        n1=0;
        n2=1;
        count=10;
        for(i=2;i<=count;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
        
    }
    }
    
    
