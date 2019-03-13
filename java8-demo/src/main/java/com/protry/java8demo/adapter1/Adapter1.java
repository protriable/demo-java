package com.protry.java8demo.adapter1;

import java.io.File;
import java.io.FileFilter;

public class Adapter1 {



    private void isFileHidden() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);

    }
}
