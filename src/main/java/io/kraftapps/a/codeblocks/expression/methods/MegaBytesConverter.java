package io.kraftapps.a.codeblocks.expression.methods;

public class MegaBytesConverter {

    private static final String KB_EQUALS_SPACE = " KB = ";
    private static final String MB_AND = " MB and ";
    private static final String KB_WITH_PRE_SPACE = " KB";
    private static final String INVALID_VALUE = "Invalid Value";

    public void printMegaBytesAndKiloBytes(int kiloBytes){
        System.out.print(getMegaBytesAndKiloBytesBreakdown(kiloBytes));
    }

    public String getMegaBytesAndKiloBytesBreakdown(int kiloBytes){
        if(kiloBytes < 0){
            return INVALID_VALUE;
        }else
            return kiloBytes + KB_EQUALS_SPACE + kiloBytes/1024 + MB_AND + kiloBytes%1024 + KB_WITH_PRE_SPACE;
    }
}
