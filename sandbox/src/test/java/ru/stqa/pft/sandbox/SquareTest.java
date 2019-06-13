package ru.stqa.pft.sandbox;


import org.testng.annotations.Test;

public class SquareTest {

    public void testArea(){

        @Test
        Square s=new Square(5);
        assert s.area()==25;
    }
}
