package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"9876543210", "John", "Smith"},
            {"8765432109", "Ivone", "Novak"},
            {"7654321098", "Jessie", "Pinkman"},
            {"6543210987", "Walter", "White"}};
    private double[] salariees = {
            4500.00,
            3700.00,
            4350.00,
            9000.00};

    public String getWorkers(int n) {
        if (n> salariees.length) {
            return "";
        }
    return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salariees[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalariees() {
        return salariees;
    }
}
