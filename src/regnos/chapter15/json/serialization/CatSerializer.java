package regnos.chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import regnos.chapter15.json.Cat;

import java.text.SimpleDateFormat;

public class CatSerializer {
    public static String convertCatToJson(Cat cat){
        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss"));
        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
