public class Test2 {


        public static void main(String[] args) {

            int[] myArray = { 15, 16, 17 };
            int[] copy = new int[myArray.length * 3];

            for (int i = 0; i < copy.length; i++)
            {
                copy[i] = myArray[i % myArray.length];
            }


            for(int i =0 ;i < copy.length;i++) {
                System.out.print(copy[i]+"  ");
            }

        }

    }
