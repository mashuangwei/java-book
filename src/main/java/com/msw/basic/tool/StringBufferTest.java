package com.msw.basic.tool;

import org.junit.jupiter.api.Test;

public class StringBufferTest {

    @Test
    public void test(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("core").append(1).append("hangzhou").append('c').append(false);
        System.err.println(stringBuffer.toString());
    }
}
