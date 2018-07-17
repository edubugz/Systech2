public class Main {

    public static void main(int n) {

        int space = (n - 1) / 2;// to give space
        int c; // counter variable for giving space
        int k; // counter variable for changing line
        int droppingLines = n;

        for (k = 1; k <= n; k++)// to change the line
        {


            space = 1;// update value of space variable to 1

            for (k = 1; k <= n - 1; k++)// to change line
            {
                System.out.println("");
                for (c = 1; c <= space; c++)// to give space
                    System.out.print(" ");//gives blank space
                //space counter variable increased by 1
                for (c =1; c <= droppingLines; c++)// to print
                    System.out.print("*");// prints *

                space++;
                droppingLines-=2;
            }
        }
    }

        public static void main (String[]args){
            Main.main(9);
        }

}
