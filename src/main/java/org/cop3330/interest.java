/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class interest {
    public static double calculate(double p, double r, int t, int c) {
        return p * Math.pow((1 + (r / 100) / c),(c * t));
    }
}
