package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> WS = new ArrayList<>();
    static ArrayList<String> A = new ArrayList<>();
    static int Count = 0;
    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("등록")){
                Register register = new Register(Count, scanner, WS, A);
                Count++;
                continue;
            }

            if (cmd.equals("삭제")){
                Delete delete = new Delete(WS, A, scanner);
                continue;
            }

            if (cmd.equals("수정")){
                Modify modify = new Modify(WS, A, scanner);
                continue;
            }

            if (cmd.equals("목록")){
                List list = new List(Count, WS, A);
                continue;
            }

            if (cmd.equals("종료")){
                break;
            }

            else {
                System.out.println("지정되지 않은 명령 입니다.");
                System.out.println("올바른 명령을 입력하여 주십시오");
            }

        }
    }
}
