package com.hsp.mhl.service;

import com.hsp.mhl.dao.DiningTableDAO;
import com.hsp.mhl.domain.DiningTable;

import java.util.List;

public class DiningTableService {
    //定义一个 DiningTableDAO属性
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> tableList() {
        return diningTableDAO.queryMulti("select id,state from diningTable ", DiningTable.class);
    }

    //返回预定餐桌信息
    public DiningTable getDiningTableById(int id) {
        //根据id , 查询对应的餐桌DiningTable 对象
        //,如果返回null , 表示id编号对应的餐桌不存在
        return diningTableDAO.querySingle("SELECT * FROM diningTable WHERE id = ? ", DiningTable.class, id);
    }

    //如果餐桌可以预定，调用方法，对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int orderId, String orderName, String orderTel) {
        int update =
                diningTableDAO.update("UPDATE diningTable SET state='已经预定', orderName=?, orderTel=? WHERE id=?",
                        orderName, orderTel, orderId);
        return update > 0;
    }
    //更新餐桌状态
    public boolean updateDiningTableState(int id, String state) {
        int update = diningTableDAO.update("UPDATE diningTable SET state= ? WHERE id=?", state, id);
        return update > 0;
    }
    //提供方法，将指定的餐桌设置为空闲状态
    public boolean updateDiningTableToFree(int id) {
        int update = diningTableDAO.update("update diningTable set state = '空',orderName = '',orderTel = '' where id = ?",id);
        return update > 0;
    }


}
