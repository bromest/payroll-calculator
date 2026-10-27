package com.pluralsight;
import java.io.*;
public class Pay {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                // Split the line using the pipe delimiter
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                // Create the Employee object
                Employee employee = new Employee(id, name, hoursWorked, payRate);

                // Display the output using printf
                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

