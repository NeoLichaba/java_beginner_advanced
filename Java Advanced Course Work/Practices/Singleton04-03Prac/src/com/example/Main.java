package com.example;

public class Main {

    public static void main(String[] args) {

        PeerSingleton peerList01 = PeerSingleton.getInstance();

        PeerSingleton peerList02 = PeerSingleton.getInstance();

        //host names displayed using a for loop
        for (String hostName : peerList01.getHostNames()) {
            System.out.println("Host name: " + hostName);
        }
        
        //host names displayed using a for loop
        System.out.println();
        for (String hostName : peerList02.getHostNames()) {
            System.out.println("Host name: " + hostName);
        }
    }

}

