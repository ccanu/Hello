package com.hsp.mhl.service;

import com.hsp.mhl.dao.EmployeeDAO;
import com.hsp.mhl.domain.Employee;

public class EmployeeService {
    //定义一个EmployeeDAO
    private EmployeeDAO employeeDAO
             = new EmployeeDAO();
    //方法，根据empId 和 pwd 返回一个Employee对象
    // 如果查询不到，就返回null
    public Employee getEmployeeByIdAndPwd(String empId, String pwd){

              return   employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);


    }
}
