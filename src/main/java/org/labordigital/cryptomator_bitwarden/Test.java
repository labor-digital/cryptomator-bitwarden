package org.labordigital.cryptomator_bitwarden;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("TEST123456");
        var process = Runtime.getRuntime()
                .exec(String.format("cmd.exe bw unlock"));
    }

}
