package com.kanti.attendancemanagementsystem.exception;

public class ResourceNotFoundException extends RuntimeException{
    
    // student not found with id: 10
    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private int fieldValue;
    
    public ResourceNotFoundException(String resourceName, String fieldName, int id) {
        super(String.format("%s not found with %s: %s", resourceName, fieldName, id));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = id;
    }
}
