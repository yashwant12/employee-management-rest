package com.rapidken.employee_management_rest.rest;

public class FilterRequest {

    private String fetch_key;
    private String fetch_value;

    public String getFetch_key() {
        return fetch_key;
    }

    public void setFetch_key(String fetch_key) {
        this.fetch_key = fetch_key;
    }

    public String getFetch_value() {
        return fetch_value;
    }

    public void setFetch_value(String fetch_value) {
        this.fetch_value = fetch_value;
    }
}
