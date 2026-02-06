package BonusHW;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTaskTest {

    @Test
    void getElementLength() {
        StreamTask streamTask = new StreamTask();
        List<String> input = new ArrayList<>();
        input.add("Bobik");
        List<Integer> result = new ArrayList<>( streamTask.getElementLength(input));
       assertEquals(List.of(5),result);

    }

    @Test
    void getElementLengthAndDistinct() {
        StreamTask streamTask = new StreamTask();
        List<String> input = new ArrayList<>();
        input.add("Bobik");
        input.add("Charlie");
        input.add("Bobik");
        input.add("Hans");
        List<Integer> result = new ArrayList<>(streamTask.getElementLengthAndDistinct(input));
        assertEquals(List.of(5,7,4) ,result);
    }

    @Test
    void getFirstCharacterOfString() {
        StreamTask streamTask = new StreamTask();
        List<String> input = new ArrayList<>();
        input.add("Bobik");
        input.add("Charlie");
        input.add("Hans");
        List<Character> result = new ArrayList<>(streamTask.getFirstCharacterOfString(input));
        assertEquals(List.of('B','C','H'),result);
    }

    @Test
    void addLogDuringWork() {
        StreamTask streamTask = new StreamTask();
        List<String> input = new ArrayList<>();
        input.add("Bobik");
        List<String> result = streamTask.addLogDuringWork(input);
        assertEquals(input,result);
    }

    @Test
    void rotateElements() {
        StreamTask streamTask = new StreamTask();
        List<String> input = new ArrayList<>();
        input.add("Bobik");
        input.add("Charlie");
        input.add("Hans");
        List<String> result = new ArrayList<>(streamTask.rotateElements(input));
        assertEquals(List.of("Charlie", "Hans", "Bobik"),result);
    }
}