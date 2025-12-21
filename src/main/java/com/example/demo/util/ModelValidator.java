package com.example.demo.util;

public final class ModelValidator {

    private ModelValidator() {
    }

    public static void validateModelNumber(String modelNumber) {
        if (modelNumber == null || modelNumber.trim().isEmpty()) {
            throw new RuntimeException("Model number required");
        }
    }

    public static void validateCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new RuntimeException("Category required");
        }
    }

    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
