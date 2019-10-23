public class Loops {
    public static void main(String[] args){

    /*    for(int i = 1 ; i <=10; i++){
            System.out.println(i);
        }
        for(int i = 10 ; i >=1; i--){
            System.out.println(i);
        }
        for(int i = 1; i <= 20; i++){
            int x =  i % 2;
            if(x!=0){
                System.out.println(i + " is an odd number!");
            }
        }
        for(int i = 1; i <= 20; i++){
            int x =  i % 2;
            if(x==0){
                System.out.println(i + " is an even number!");
            }
        }
    for(int i = 0 ; i <4; i ++) {
        System.out.println("***********");
    }
        for(int i = 1 ; i <=5; i ++){
            String str = "*";
            String repeated = str.repeat(i);
            System.out.println(repeated);
        }
        for(int i = 1 ; i <=5; i ++) {
            String str = "*";
            String repeated = str.repeat(i);
            System.out.printf("%15s %n",repeated);
        }*/
        for(int i =1;i<11;i++) {
            for (int x = 1; x < 11; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1;i<6;i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4;i>=0;i--){
            for (int x = 0; x<i;x++){
                System.out.print(" ");
            }
            for (int j = 5; j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
