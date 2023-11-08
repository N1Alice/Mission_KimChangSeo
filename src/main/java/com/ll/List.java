package com.ll;

import java.util.ArrayList;

public class List {
    public List (int Count, ArrayList<String> WS, ArrayList<String> A){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("---------------------------");

        for(int length = Count; length > 0; length--) {
            System.out.printf("%d / %s / %s\n", length, A.get(length-1), WS.get(length-1));
        }
    }
}
