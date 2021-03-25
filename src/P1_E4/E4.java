package P1_E4;

import java.util.Scanner;
import java.util.Stack;

public class E4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        scan.close();
        if (tamaño <= 9) {
            int x =1;
            int y =2;
            int z =3;
            Hanoi(x,y,z,tamaño);
        }
    }

    public static void Hanoi(int p1, int p2, int p3,int x) {
        if (x == 1){
            System.out.println("Mueve disco 1 desde torre "+ p1 +" a torre "+ p2 );
            System.out.println("Mueve disco 1 desde torre "+ p2 +" a torre "+ p3 );
        }
        else {
            Hanoi(p1, p2, p3, x-1);
            System.out.println("Mueve disco "+ x +" desde torre "+ p1 + " a torre "+ p2 );
            Hanoi(p3 , p2, p1,x-1);
            System.out.println("Mueve disco "+ x +" desde torre "+ p2 + " a torre "+ p3 );
            Hanoi(p1, p2, p3,x-1);
        }
    }
}