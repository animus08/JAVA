// Write a java program to fetch multiple pages in
// parallel by using multiple thread.

import java.io.*;
import java.net.*;

class FetchPagesParallel extends Thread {
    private String url;

    public FetchPagesParallel(String url) {
        this.url = url;
    }

    public void run() {
        System.out.println("Fetching page: " + url);
        try {
            URL website = new URL(url); // Create URL object
            BufferedReader br = new BufferedReader(new InputStreamReader(website.openStream()));    // Open stream to read data
            String line;
            int length = 0;

            while ((line = br.readLine()) != null) {
                length += line.length() + 1;
            }

            br.close();
            System.out.println("Fetched page: " + url + ", length: " + length);

        } 
        catch (IOException e) {
            System.out.println("Error fetching page: " + url);
        }
    }

    public static void main(String[] args) {
        FetchPagesParallel pf1 = new FetchPagesParallel("https://www.programiz.com/java-programming/online-compiler/");
        FetchPagesParallel pf2 = new FetchPagesParallel("https://www.youtube.com/watch?v=Pd4SC8fkYio&list=PLv3aWeJk4dcCIf-sLe8MMAvdMOqws_4-a&index=165");
        FetchPagesParallel pf3 = new FetchPagesParallel("https://campusx1040.graphy.com/s/preview/courses/CampusX-Data-Science-Mentorship-Program");

        pf1.start();
        pf2.start();
        pf3.start();
    }
}