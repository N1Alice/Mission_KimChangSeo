package com.ll;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("등록")){
                System.out.print("명언 : ");
                String WS = scanner.nextLine();
                System.out.print("작가 : ");
                String A = scanner.nextLine();

                continue;
            }

            if (cmd.equals("종료")){
                break;
            }

        }
    }
}
