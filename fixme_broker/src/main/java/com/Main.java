package com;

import com.controllers.*;
public class Main {
    public static void main(String[] args) throws Exception
    {
        brokerController brokerController = new brokerController(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        try {
            brokerController.establishConnection();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

