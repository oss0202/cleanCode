package chapter03;

import chapter09.DuplicateCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgsTestTest {
    @Test
    void addAll_Test(){
        //given
        int parameter1 = 10;
        int parameter2 = 20;
        int parameter3 = 30;

        int returnInt = 0;
        int resultInt = 60;

        //when
        DuplicateCode.addAll(parameter1, parameter2, parameter3);
        returnInt = DuplicateCode.getDuplicateCodeResult();

        //then
        Assertions.assertEquals(returnInt, resultInt);
    }
}