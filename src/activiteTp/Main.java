package activiteTp;

public class Main {

    public static void main(String[] args) {
        int espace;
        String etoile="";
        for (int i=0;i<10;i++)
        {
            espace=9-i;

            for (int j=0;j<espace;j++)
            {
                System.out.print(" ");

            }
            etoile=etoile+"* ";
            System.out.println(etoile);
        }

    }
}
//
