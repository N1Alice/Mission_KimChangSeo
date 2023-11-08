package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Modify {
    public Modify (ArrayList<String> WS, ArrayList<String> A, Scanner scanner){
        System.out.print("번호 : ");
        int Cnum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("명언(기존) :"+ WS.get(Cnum-1));
        System.out.print("명언 : ");
        String Rews = scanner.nextLine();
        WS.set(Cnum-1, Rews);

        System.out.println("작가(기존) :"+ A.get(Cnum-1));
        System.out.print("작가 : ");
        String Rea = scanner.nextLine();
        WS.set(Cnum-1, Rea);

    }
}
