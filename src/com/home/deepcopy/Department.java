package com.home.deepcopy;

public class Department implements Cloneable{

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
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
