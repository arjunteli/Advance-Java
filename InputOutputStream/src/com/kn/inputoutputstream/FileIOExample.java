package com.kn.inputoutputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOExample {
	private static final String filePath = "C:\\Users\\Lenovo\\OneDrive\\Documents\\io\\output.txt";

	public static void main(String[] args) {
		writeToTextFile();
		readFromTextFile();
	}

	private static void writeToTextFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
				BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.print("Enter data to write to the file: ");
			String inputData = consoleReader.readLine();

			writer.write(inputData);
			writer.newLine(); // Add a newline for clarity or as needed
			System.out.println("Data has been written to the file successfully.");

		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
	}

	private static void readFromTextFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			System.out.println("Data read from the file:");

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}
	}
}
