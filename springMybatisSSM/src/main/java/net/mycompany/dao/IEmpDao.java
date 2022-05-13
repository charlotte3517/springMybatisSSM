package net.mycompany.dao;

import net.mycompany.pojo.Emp;

public interface IEmpDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp row);

    int insertSelective(Emp row);

    Emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emp row);

    int updateByPrimaryKey(Emp row);
}