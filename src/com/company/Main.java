package com.company;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;



public class Main {


    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./cars.json");


    public static void main(String[] args) {

        Car[] cars = {
                Car.makeCar("Honda Accord",6000,Type.SEDAN),
                Car.makeCar("Honda Civic",4000,Type.HATCHBACK),
                Car.makeCar("Honda TruckWagon",12000,Type.TRUCK)
        };

        String json = GSON.toJson(cars);
        System.out.println(json);
    }

    private static void write(String object) {
        Path write = Paths.get(String.valueOf(WRITE_PATH));
        try {
            Files.writeString(write, object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static String readFile() {
        String json = "";
        try {
            FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while ((a = reader.read()) != -1) {
                json += (char)a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

}


