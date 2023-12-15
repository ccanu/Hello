package com.hsp.mhl.service;

import com.hsp.mhl.dao.MenuDAO;
import com.hsp.mhl.domain.Menu;

import java.util.List;

public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();
    public List<Menu> list() {
        return menuDAO. queryMulti("select * from menu", Menu. class);
    }
}
