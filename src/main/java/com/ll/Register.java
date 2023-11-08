package com.ll;

import java.util.Scanner;

public class Register {
    public Register (int Count, Scanner scanner){
        System.out.print("명언 : ");
        String WS = scanner.nextLine();
        System.out.print("작가 : ");
        String A = scanner.nextLine();
        System.out.println(Count+1 + "번 명언이 등록되었습니다.");
    }
}
