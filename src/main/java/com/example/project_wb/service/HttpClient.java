package com.example.project_wb.service;

import com.example.project_wb.model.product.ProductModel;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {

    public String getResponse(String url){
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = null;
        try {
            request = HttpRequest.newBuilder().uri(new URI(url))
                    .GET()
                    .build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        HttpResponse<?> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String qwe = response.body().toString();
        return qwe;
    }

    public ProductModel getProductModel(String response){
        Gson gson = new Gson();
        ProductModel productModel = gson.fromJson(response, ProductModel.class);
        return productModel;
    }

    public String urlImg(int product) {

        for (int i = 0; i < 16; i++) {
            String pridId = String.valueOf(product);
            String urlToCheck = "";
            if (pridId.length()==9) {
                urlToCheck = "https://basket-" + i + ".wb.ru/vol" + pridId.substring(0, 4) + "/part" + pridId.substring(0, 6) + "/" + product + "/images/c246x328/1.webp";
            } else {
                urlToCheck = "https://basket-" + i + ".wb.ru/vol" + pridId.substring(0, 4) + "/part" + pridId.substring(0, 5) + "/" + product + "/images/c246x328/1.webp";
            }
            try {
                URL url = new URL(urlToCheck);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("HEAD");

                connection.setConnectTimeout(5000);

                int responseCode = connection.getResponseCode();

                if (responseCode == 200) {
                    return urlToCheck;
                }
            } catch (IOException e) {
            }

        }
        return "LLLLLLOOOOOOLLLLL";
    }
}
