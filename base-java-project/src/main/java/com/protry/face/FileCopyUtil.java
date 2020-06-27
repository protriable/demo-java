package com.protry.face;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author shaobin
 * @version : FilyCopyUtil.java, v 0.1 2020年06月26日 8:04 下午 shaobin Exp $
 */
public class FileCopyUtil {

    private FileCopyUtil(){
        throw new AssertionError();
    }

    public static void fileCopy(String source, String target) throws IOException {
        try (InputStream inputStream = new FileInputStream(source)){
            try (OutputStream outputStream = new FileOutputStream(target)){
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while ((bytesToRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesToRead);
                }
            }
        }
    }

    public static void fileCopyNIO(String resource, String target) throws IOException {
        try (FileInputStream in = new FileInputStream(resource)){
            try (FileOutputStream out = new FileOutputStream(target)){
                FileChannel inChannel = in.getChannel();
                FileChannel outChannel = out.getChannel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
                while (inChannel.read(byteBuffer) != -1) {
                    outChannel.write(byteBuffer);
                    byteBuffer.clear();
                }
            }
        }
    }

    public static int countWordInFile(String fileName, String word) throws IOException {
        int counter = 0;
        try (final FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int index;
                while ((line.length() >= word.length()) &&
                        (index = line.indexOf(word)) >=0) {
                    counter++;
                    line = line.substring(index + word.length());
                }
            }
        }
        return counter;
    }

    public static void listFilesNIO(String fileName) throws IOException {
        final Path path = Paths.get(fileName);

        Files.walkFileTree(path, new SimpleFileVisitor<Path>(){

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public static void listFiles(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            final File[] files = file.listFiles();
            for (File innerFile : files) {
                System.out.println(innerFile.getName());
            }
        }
    }

    public static void listAllFiles(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            final File[] files = file.listFiles();
            if (files!= null) {
                for (File innerFile : files) {
                    listFile(innerFile);
                }
            }
        }
    }

    private static void listFile(File file) {
        if (file.isDirectory()) {
            final File[] files = file.listFiles();
            if (files!= null) {
                for (File listFile : files) {
                    listFile(listFile);
                }
            }
        } else {
            System.out.println(file.getName());
        }
    }

}