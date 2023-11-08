package com.ll;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int Count = 0;
    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("등록")){

                Register register = new Register(Count, scanner);
                Count++;

                continue;
            }

            if (cmd.equals("종료")){
                break;
            }

        }
    }
}
