package com.example.project_wb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Telegram {

    public static void sentSms(String text){
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = "5238492230:AAFCH5xWwO7d4-4yyR2ropWl7cnczJxkFn4";
        String chatId = "@telegawbproduct";

        urlString = String.format(urlString, apiToken, chatId, text);

        try {
            URL url = new URL(urlString.replace(" ", "%20"));

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Thread.sleep(1000*10);
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
