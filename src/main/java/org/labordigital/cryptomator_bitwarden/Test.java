package org.labordigital.cryptomator_bitwarden;

import java.io.IOException;
import java.io.OutputStream;

public class Test {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("TEST123456");
        //Process p = Runtime.getRuntime().exec("cmd /c start /wait bw.exe login --sso");
        Process p = Runtime.getRuntime().exec("cmd /c start /wait bw.exe unlock");
        OutputStream oStream = p.getOutputStream();
        int exitCode = p.waitFor();
        System.exit(exitCode);
    }

}
