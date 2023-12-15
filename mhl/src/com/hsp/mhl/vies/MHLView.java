package com.hsp.mhl.vies;

import com.hsp.mhl.dao.DiningTableDAO;
import com.hsp.mhl.domain.DiningTable;
import com.hsp.mhl.domain.Employee;
import com.hsp.mhl.service.BillService;
import com.hsp.mhl.service.DiningTableService;
import com.hsp.mhl.service.EmployeeService;
import com.hsp.mhl.service.MenuService;
import com.hsp.mhl.utils.Utility;

import java.awt.*;

public class MHLView {
    //控制是否退出菜单
    private boolean loop = true;
    private String key = "";

    //定义EmployeeService 属性
    private EmployeeService employeeService = new EmployeeService();
    //定义 DiningTableService属性
    private DiningTableService diningTableService = new DiningTableService();
    //定义 MenuService
    private MenuService menuService = new MenuService();
    private BillService billService = new BillService();
    //定义 BillService属性



    public static void main(String[] args) {
        MHLView mhlView = new MHLView();
        mhlView.mainView();
    }

    //完成预定餐桌
    public void orderDiningTable() {
        System.out.println("==============预定餐桌============");
        System.out.print("请选择要预定的餐桌编号(-1退出): ");
        int orderId = Utility.readInt();
        //判断orderId是否为-1 是就退出
        if (orderId == -1) {
            return;
        }
        char key = Utility.readConfirmSelection();
        if (key == 'Y') { // 确认预定

            DiningTable diningTableById = diningTableService.getDiningtableById(orderId);

            //根据orderId 返回 对应DiningTable对象, 如果为null, 说明该对象不存在
            if (diningTableById == null) { //如果为null, 说明该对象不存在, 就是没有查出来
                System.out.println("==============预订餐桌不存在============");
                return;
            }
            //判断该餐桌的状态是否 "空"
            if (!(diningTableById.getState().equals("空"))) {//说明当前这个餐桌不是 "空" 状态
                System.out.println("==============该餐桌已经预定或者就餐中============");
                return;
            }
            System.out.print("预定人的名字: ");
            String orderName = Utility.readString(50);
            System.out.print("预定人的电话: ");
            String orderTel = Utility.readString(50);

            //修改餐桌状态
            if (diningTableService.orderDiningTable(orderId,orderName,orderTel)){
                System.out.println("==============预订餐桌成功============");
            }else {
                System.out.println("==============预订餐桌失败============");
            }

        }else {
            System.out.println("==============取消预订餐桌============");
        }
    }

    //显示所有餐桌状态
    public void listDiningTable() {
        List<DiningTable> diningTables = diningTableService.tableList();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable diningTable : diningTables) {
            System.out.println(diningTable);
        }
        System.out.println("==============显示完毕============");
    }
    //listMenu 显示菜单
    public void listMenu(){
       List<Menu> list = menuService.list();
        System.out.println("\n菜品编号\t\t");
       for (Menu menu:list){
           System.out.println(menu);
       }
        System.out.println("==============显示完毕============");
    }
    //完成点餐

    //显示主菜单
    public void mainView() {
        while (loop) {
            System.out.println("\n===============满汉楼================");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.println("请输入员工号");
                    String id = Utility.readString(50);
                    System.out.println("请输入密码");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeByIdAndPwd(id, pwd);
                    if (employee != null) {
                        System.out.println("===============登录成功[" + employee.getName() + "]================\n");
                        //显示二级菜单，这里二级菜单是循环操作，所以做成while
                        while (loop) {
                            System.out.println("\n===============满汉楼(二级菜单)================");
                            System.out.println("\t\t 1 显示餐桌状态");
                            System.out.println("\t\t 2 预定餐桌");
                            System.out.println("\t\t 3 显示所有菜品");
                            System.out.println("\t\t 4 点餐服务");
                            System.out.println("\t\t 5 查看账单");
                            System.out.println("\t\t 6 结账");
                            System.out.println("\t\t 9 退出满汉楼");
                            System.out.print("请输入你的选择: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    listDiningTable();//显示餐桌状态
                                    break;
                                case "2":
                                    orderDiningTable();//预定餐桌
                                    System.out.println("预定餐桌");
                                    break;
                                case "3":
                                    listMenu(); //显示菜单
                                    System.out.println("显示所有菜品");
                                    break;
                                case "4":
                                    orderMenu();
                                    System.out.println("点餐服务");
                                    break;
                                case "5":
                                    showBillList2();//显示账单
                                    System.out.println("查看账单");
                                    break;
                                case "6":
                                    payBill();
                                    System.out.println("结账");
                                    break;
                                case "9":
                                    System.out.println("退出满汉楼");
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("输入有误，重新输入");
                            }
                        }
                    } else {
                        System.out.println("==============登陆失败===============");
                    }
                    break;
                case "2":
                    System.out.println("退出满汉楼");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，重新输入");
            }
        }
        System.out.println("已退出满汉楼");
    }
}
