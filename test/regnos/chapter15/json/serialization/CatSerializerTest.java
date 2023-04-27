package regnos.chapter15.json.serialization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import regnos.chapter15.json.Cat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    Cat cat;
    private DateTimeFormatter formatter;
    private LocalDateTime dateOfBirth =LocalDateTime.now().minusYears(20);

    @BeforeEach
    void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat= new Cat("Tom", 20);
        cat.setDateOfBirth(dateOfBirth);
    }
    @Test
    public void testConvertCatToJson(){
       String catJson= CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
       assertNotNull(catJson);
       assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}", catJson);
    }
    @Test
    public void testThatJsonIgnoreNullValues(){
        cat.setName(null);

    }

}