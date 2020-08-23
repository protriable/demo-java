package com.protry.face;

public class SwitchTest {

    public static void main(String[] args) {
        SwitchEnum switchEnum = SwitchEnum.ONE;
        byte a = 1;
        int b = 1;
        short c = 1;
        char d = 'd';
        String e = "e";
        switch (a) {}
        switch (b) {}
        switch (c) {}
        switch (d) {}
        switch (e) {}
        switch (switchEnum) {}


    }

    enum SwitchEnum {
        ONE,TWO;
    }
}

