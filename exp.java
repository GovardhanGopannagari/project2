import java.util.Scanner;
class exp{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        String m=s.nextLine();
        for(int i=m.length()-1;i>=0;i--)
        {
           System.out.print(m.charAt(i));
        }
    }
}