

public class Main2 {

    public static void main(String[] args) {



        String [] mojNiz = {"Pera", "Zika", "Laza"};
        mojNiz[0] = "Marko";
        mojNiz[1] = "John";
        mojNiz[2] = "Djordje";

        for (String s:mojNiz) {//has next
            System.out.println(s);
        }

        int a[] = new int[3];
        a[0] = 10;
        a[1] = 15;
        a[2] = 20;

        for(int p : a){
            System.out.println(p);
        }

        int [] niz1d = {1, 5, 4};

        int [][] niz2d = new int[][]{
                {1,2,8},
                {3,4,10},
                {5,6,15}
        };

        for (int[]e: niz2d){
            for (int r:e) {
                System.out.print(r + " ");
            }
            System.out.println();
        }

    }


}
