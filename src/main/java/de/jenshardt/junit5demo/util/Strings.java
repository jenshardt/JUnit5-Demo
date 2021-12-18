package de.jenshardt.junit5demo.util;

public class Strings {
	public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
