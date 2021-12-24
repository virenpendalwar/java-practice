package io.kraftapps.a.codeblocks.expression.methods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpeedConverterTest {

    private SpeedConverter speedConverter;

    @Before
    public void setup(){
        speedConverter = new SpeedConverter();
    }

    @Test
    public void shouldReturnMinusOneForNegativeInput(){
        Assert.assertEquals(-1, speedConverter.toMilesPerHour(-5.6));
    }

    @Test
    public void shouldReturnZeroForZeroInput(){
        Assert.assertEquals(0, speedConverter.toMilesPerHour(0));
    }

    @Test
    public void shouldReturnCorrectConvertedValueForValidInput(){
        Assert.assertEquals(1, speedConverter.toMilesPerHour(1.5));
        Assert.assertEquals(6, speedConverter.toMilesPerHour(10.25), 0);
        Assert.assertEquals(16, speedConverter.toMilesPerHour(25.42), 0);
        Assert.assertEquals(47, speedConverter.toMilesPerHour(75.114), 0);

    }

}