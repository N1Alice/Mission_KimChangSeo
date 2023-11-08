package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public Register (int Count, Scanner scanner, ArrayList<String> WS, ArrayList<String> A){
        System.out.print("명언 : ");
        String ws = scanner.nextLine();
        WS.add(ws);

        System.out.print("작가 : ");
        String a = scanner.nextLine();
        A.add(a);

        System.out.println(Count+1 + "번 명언이 등록되었습니다.");
    }
}
