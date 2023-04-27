package regnos.chapter15.json.deserialization;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import regnos.chapter15.json.Cat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {
    String catJson;
    private DateTimeFormatter formatter;
    private LocalDateTime dateOfBirth= LocalDateTime.now().minusYears(20);

    @BeforeEach
    void setUp() {
        formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         catJson ="{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}";
    }

    @Test
    void deserializeJsonToCat(){
       Cat ologbo=  CatDeserializer.deserializeJsnToCat(catJson);
       assertNotNull(ologbo);
       assertEquals("Morenike", ologbo.getName());
       assertEquals(formatter.format(dateOfBirth), ologbo.getDateOfBirth());


    }
}