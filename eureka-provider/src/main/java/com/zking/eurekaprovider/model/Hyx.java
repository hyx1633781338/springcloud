package com.zking.eurekaprovider.model;

public class Hyx {
    private Integer id;

    private String name;

    public Hyx(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hyx() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}