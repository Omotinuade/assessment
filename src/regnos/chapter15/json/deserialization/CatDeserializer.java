package regnos.chapter15.json.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import regnos.chapter15.json.Cat;

import java.io.IOException;

public class CatDeserializer {
    public static Cat deserializeJsnToCat(String json){
        ObjectMapper objectMapper= new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
