package by.tms.servlet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoemServlet {
    public static void main(String[] args) {
        Socket s = null;
        File file = new File("C:\\Users\\Вадим\\IdeaProjects\\C18-onl2022\\Lesson28dop\\src\\main\\java\\poem.txt");
        if (!file.exists()) {
            System.out.println("Файла не существует");
        } else {
            System.out.println("Файл найден");
        }
        try {
            Random random = new Random();
            ServerSocket server = new ServerSocket(8080);
            s = server.accept();
            PrintStream ks = new PrintStream(s.getOutputStream());
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> list = new ArrayList<>();
            while (bufferedReader.ready()) {
                list.add(bufferedReader.readLine());
            }
            String m = list.get(random.nextInt(50));
            ks.print(m);
            ks.flush();
            s.close();
        } catch (IOException e) {
            System.out.println("Error:" + e);
        }
    }
}
