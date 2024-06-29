package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exception.ConvertionErrorException;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TitleOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        System.out.println("Type a movie and search: ");
        var search = read.nextLine();

        String adress = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=d42172e3";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(adress))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TitleOMDB myTitleOmdb = gson.fromJson(json, TitleOMDB.class);
        System.out.println(myTitleOmdb);
        try {
            Title myTitle = new Title(myTitleOmdb);
            System.out.println("Tittle convertion: ");
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Type error, please verify number values");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Type error, please don't use spaces");
        } catch (ConvertionErrorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Execution Finished");

    }
}
