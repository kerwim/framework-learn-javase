package com.kerwim.try_with_resources;

class MyfinallyReadLineThrow {
    public void close() throws Exception {
        throw new Exception("close");
    }

    public void readLine() throws Exception {
        throw new Exception("readLine");
    }

    public static void main(String[] args) throws Exception {
        MyfinallyReadLineThrow myThrow = null;
        try {
            myThrow = new MyfinallyReadLineThrow();
            myThrow.readLine();
        } finally {
            myThrow.close();
        }
    }
}