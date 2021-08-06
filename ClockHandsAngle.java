import java.lang.Math;
import java.util.Scanner;

class ClockHandsAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hrs: ");
        int hrs = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Mins: ");
        int mins = sc2.nextInt();
        System.out.println(MinAngle(hrs, mins));
    }

    static int MinAngle(float hrs, float mins) {
        //find the position of the hour's hand
        float hrAngle = (hrs * (360f / 12f)) + (mins * ((360f / 12f) / 60f));

        //find the position of the minute's hand
        float minAngle = mins * (360f / 60f);

        //calculate the angle difference
        int angle = Math.abs((int) hrAngle - (int) minAngle);

        //consider the shorter angle and return it
        if (angle > 180f) {
            angle = 360 - angle;
        }
        return angle;
    }
}