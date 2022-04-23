package com.zang.desigin.creatation.facade;

/**
 * @author 臧臧 on 2022/4/20
 */
public class EmployeeServiceImpl {
    //相当于导入了service层
    Department department = new Department();
    Salary salary = new Salary();

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.getEmployeeInformationByID(5);
    }
    private  void getEmployeeInformationByID(Integer id){
        department.getDepartmentByEmployeeID(id);
        salary.getSalaryByEmployeeID(id);
    }
}