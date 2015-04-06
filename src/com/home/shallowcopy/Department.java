package com.home.shallowcopy;

public class Department {

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

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }

}
