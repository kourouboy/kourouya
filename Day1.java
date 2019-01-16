public class Day1{
    public static void  main(String[] args) throws Exception{
        // // double a  = 1;
        // System.out.println(10 / 4.0);
        //正三角形：
        // int line = 10 ;
        // for(int x = 0 ;x < line ;x++){//控制行数
        //     for (int y = 0 ;y < line - x ;y++){//控制空格
        //         System.out.print(" ");
        //     }
        //     for (int z = 0; z < x ;z++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //switch 循环
        char x = (char) System.in.read();
        switch(x){
            case 'a':{
                System.out.println("你是猪");
                continue;
            }
            case 'b':{
                System.out.println("你不是猪");
                break;
            }
            default :{
                System.out.println("你真的是猪");
            }
        }

        //do while 循环：
        // int x = 10;
        // do{
        //     System.out.print("nizaiganma");
        //     x++;
        // }while(x<10);
        
               
        
    }
}
