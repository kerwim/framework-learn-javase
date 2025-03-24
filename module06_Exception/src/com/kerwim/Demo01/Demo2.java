package com.kerwim.Demo01;

import java.io.IOException;
import java.net.Socket;

public class Demo2 {
    private String mHost;
    private int mPort;
    private Socket mSocket;
    private final Object mLock = new Object();

    public void run() {
    }

    private void initSocket() {
        while (true) {
            try {
                Socket socket = new Socket(mHost, mPort);
                synchronized (mLock) {
                    mSocket = socket;
                }
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}