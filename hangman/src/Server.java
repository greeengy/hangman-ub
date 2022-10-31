import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server {

    public static void serverConnection() {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("___Server started___");

            while (true) {
                // Ожидание подключения пользователя...
                Socket socket = serverSocket.accept();
                // Подключение пользователя
                System.out.println("___New client connected___");

                // Подключение клиентов в новом потоке (многопоточность для обработки запросов);
                new Thread(() -> handleRequest(socket)).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void handleRequest(Socket socket) {
    /* Обработчик запросов. InputStreamReader будет обрабатывать поток
            байтов в поток символов.
            */
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(),
                StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(socket.getOutputStream());
        ) {

            while (!input.ready());

            String firstLine = input.readLine();
            String[] parts = firstLine.split(" ");
            System.out.println(firstLine);

            while (input.ready()) {
                System.out.println(input.readLine());
            }

            Path path = Paths.get("/home/zatannal/IdeaProjects/hangman/www", parts[1]);

            if (!Files.exists(path)) {
                output.println("HTTP/1.1 404 NOT_FOUND");
                output.println("HTTP/1.1 200 OK");
                output.println("Content-Type: text/html; charset=utf-8");
                output.println();
                output.println("<p>File not found</p>");
                output.flush();
                return;
            }

            output.println("HTTP/1.1 200 OK");
            output.println("Content-Type: text/html; charset=utf-8");
            output.println();  // Пустая строка обязательно, иначе браузер не поймет, что мы от него хотим
            Files.newBufferedReader(path).transferTo(output);
            output.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
