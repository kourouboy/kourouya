
    public class Work1
//1. 使用for循环打印乘法口诀表 
/*{
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
}*/
//2. 递归实现20! 
{
    public static void main (String[] args){
        System.out.println(sum(20));
    }
        public static long sum (int num){
            if (num == 1){
                return 1L;
            }
            else{
                return num*sum(num-1);
            }
        }
    }
//3. 完成ArrayUtils.java
