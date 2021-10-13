package com.viksan;
/* читаем данные из файла, который находится на компьютере по адресу «/Users/amelkin/Desktop/впечатление блок на главной.txt».
 Создаем 2 объекта — FileInputStream и BufferedInputStream в качестве его «обертки».
 После этого мы считываем байты из файла и преобразуем их в символы. И так до тех пор, пока файл не закончится.
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputExample {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("/Users/amelkin/Desktop/впечатление блок на главной.txt");

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print(c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }
    }
}