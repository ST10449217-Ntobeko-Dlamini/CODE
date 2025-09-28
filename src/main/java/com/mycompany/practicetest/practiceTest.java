/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicetest;

/**
 *
 * @author lab_services_student
 */

public class practiceTest {
    
    public static void main(String[] args) {
        // Declaration and population of two-dimensional array
        int[][] deliveries = {
            {128, 135, 139},  
            {155, 129, 175},   
            {129, 130, 186}   
        };
        
        // Array for year labels
        String[] years = {"2018", "2020", "2030"};
        
        // Array for month labels
        String[] months = {"JAN", "FEB", "MAR"};
        
        // Display the report header
        System.out.println("THREE-MONTH DELIVERY REPORT");
        System.out.println("============================");
        System.out.println();
        
        // Display column headers
        System.out.printf("%-15s", "");
        for (String month : months) {
            System.out.printf("%-8s", month);
        }
        System.out.println();
        
        // Display the delivery data
        for (int i = 0; i < deliveries.length; i++) {
            System.out.printf("DELIVERIES %-5s", years[i]);
            for (int j = 0; j < deliveries[i].length; j++) {
                System.out.printf("%-8d", deliveries[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Calculate and display statistics
        displayStatistics(deliveries);
    }
    
    /**
     * Method to calculate and display delivery statistics
     * @param array The two-dimensional array containing delivery data
     */
    public static void displayStatistics(int[][] array) {
        int total = 0;
        int count = 0;
        int max = array[0][0];
        int min = array[0][0];
        
        // Calculate total, maximum and minimum
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                count++;
                
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        
        double average = (double) total / count;
        
        // Display statistics
        System.out.println("DELIVERY STATISTICS");
        System.out.println("===================");
        System.out.printf("Total deliveries: %d%n", total);
        System.out.printf("Average deliveries: %.2f%n", average);
        System.out.printf("Maximum deliveries: %d%n", max);
        System.out.printf("Minimum deliveries: %d%n", min);
    }
}