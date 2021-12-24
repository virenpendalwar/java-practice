package io.kraftapps.a.codeblocks.expression.methods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MegaBytesConverterTest {

    private MegaBytesConverter megaBytesConverter;

    private static final String INVALID_VALUE = "Invalid Value";

    @Before
    public void setup(){
        megaBytesConverter = new MegaBytesConverter();
    }

    @Test
    public void shouldReturnInvalidValueWhenNegativeInputProvided(){
        Assert.assertEquals(INVALID_VALUE , megaBytesConverter.getMegaBytesAndKiloBytesBreakdown(-4555));
    }

    @Test
    public void shouldReturnZeroWhenZeroInputProvided(){
        Assert.assertEquals("0 KB = 0 MB and 0 KB" , megaBytesConverter.getMegaBytesAndKiloBytesBreakdown(0));
    }

    @Test
    public void shouldReturnMBKBBreakdownValueWhenValidValueProvided(){
        Assert.assertEquals("2500 KB = 2 MB and 452 KB", megaBytesConverter.getMegaBytesAndKiloBytesBreakdown(2500));
        Assert.assertEquals("5000 KB = 4 MB and 904 KB", megaBytesConverter.getMegaBytesAndKiloBytesBreakdown(5000));
    }

}