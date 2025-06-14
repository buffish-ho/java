package com.buffish.client;

import java.text.MessageFormat;

public class PatternClient {
    public static void ready(String type) {
        System.out.println(MessageFormat.format("**************{0}**************", type));
    }
}