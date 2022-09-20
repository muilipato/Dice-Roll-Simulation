
public class DiceRoll{
   public static int counter1,counter2,counter3,counter4,counter5,counter6=0;

    public static void main(String[] args){


        for (int dice_roll = 1; dice_roll<= 1000; dice_roll++){

            double dice_face  = Math.random();
           

            if (dice_face>= 0.0 && dice_face<1.0/6 )
                counter1++;
            else if(dice_face>=1.0/6 && dice_face<2.0/6)
                counter2++;
            else if (dice_face>=2.0/6 && dice_face<3.0/6)
                counter3++;
            else if (dice_face>=3.0/6 && dice_face<4.0/6)
                counter4++;
            else if (dice_face>= 4.0/6 && dice_face<5.0/6)
                counter5++;
            else if (dice_face>=5.0/6 && dice_face<1.0)
                counter6++;
        }

        //calculating percentage frequency
        double perc_face1 = (double)counter1/1000 * 100;
        double perc_face2 = (double)counter2/1000 * 100;
        double perc_face3 = (double)counter3/1000 * 100;
        double perc_face4 = (double)counter4/1000 * 100;
        double perc_face5 = (double)counter5/1000 * 100;
        double perc_face6 = (double)counter6/1000 * 100;

        System.out.println("Face\tFrequency\tPercentage(to 1 dp)");
        System.out.printf("1\t%8d\t%10.1f\n2\t%8d\t%10.1f\n3\t%8d\t%10.1f\n4\t%8d\t%10.1f\n5\t%8d\t%10.1f\n6\t%8d\t%10.1f",counter1,perc_face1,counter2,perc_face2,counter3,perc_face3,counter4,perc_face4,counter5,perc_face5,counter6,perc_face6);
    }
}