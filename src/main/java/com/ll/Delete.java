package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public Delete (ArrayList<String> WS, ArrayList<String> A, Scanner scanner){
        System.out.print("번호 : ");
        int Dnum = scanner.nextInt();
        scanner.nextLine();

        WS.set(Dnum-1, null);
        A.set(Dnum-1, null);

        System.out.println(Dnum +"번 명언이 삭제되었습니다.");
    }
}
