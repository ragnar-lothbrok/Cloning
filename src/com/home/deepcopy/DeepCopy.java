package com.home.deepcopy;

public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        
        Manager manager = new Manager();
        manager.setName("Raj");
        manager.setAge(45);
        manager.setSalary(10000000d);
        
        Department department = new Department();
        department.setId(1234);
        department.setName("SW");
        
        manager.setDepartment(department);
        
        System.out.println("Original Object : "+manager.toString());
        
        Manager clonedManager = (Manager) manager.clone();
        
        clonedManager.setAge(50);
        clonedManager.getDepartment().setId(4321);
        //Here Non Primitive types got separated memory.Deep copy
        System.out.println("Manager After Changing cloned Object : "+manager.toString());
        System.out.println("Cloned Object : "+clonedManager.toString());
    }
    
}
