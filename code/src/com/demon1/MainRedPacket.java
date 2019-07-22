package com.demon1;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manage manage = new Manage("群主",100);
        Member one = new Member("尘缘A",0);
        Member two = new Member("尘缘B",0);
        Member three = new Member("尘缘C",0);

        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");
        ArrayList<Integer> redList = manage.send(80,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manage.show();
        one.show();
        two.show();
        three.show();

    }
}
