package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * 1) Клиент при обращении к серверу получает случайно выбранное стихотворение Максима Богдановича из файла.
 */
@WebServlet("/client")
public class ClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<String> lines = Collections.emptyList();
        try {
            lines =
                    Files.readAllLines(Paths.get("C:\\Users\\Вадим\\IdeaProjects\\C18-onl2022\\Lesson28dop\\src\\main\\java\\poem.txt"), StandardCharsets.UTF_8);
//                lines = lines.stream().map(s -> )
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

