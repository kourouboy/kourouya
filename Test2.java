public class Test2
//  三角形；
/*{
    public static void main(String[] args)
    {
        int line = 10;
        for (int x = 0;x < line ; x++)
        {
            for (int y = 0 ;y < line -x ;y++)
            {
                System.out.print(" ");
            }
            for (int z = 0;z < x;z++)
            {
                System.out.print("* ");
            }
            System.out.println();        
            }
    }
}*/
//9*9乘法表：
{
    public static void main (String[] args)
    {
       // int ret = 0;
        for (int i = 1;i < 10;i++)
        {
            for (int j = 1;j < i+1;j++)
            {
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
    }
}