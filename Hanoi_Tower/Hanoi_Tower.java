public class Hanoi_Tower {
    public static void print(int n,char x,char y, char z){
        if(n==1){
            System.out.println(x+"-->"+z);
        }
        else{
            print(n-1, x, y, z);
            System.out.println(x+"-->"+y);
            print(n-1, y, z, x);
        }
    }
    public static void main(String[] args) {
        int numTower=2;
        if(args.length>0){
            numTower=Integer.parseInt(args[0]);
            print(numTower,'A','B','C');
        }
    }   
}
