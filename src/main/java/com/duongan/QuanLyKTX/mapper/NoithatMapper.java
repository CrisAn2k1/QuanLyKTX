package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.Noithat;
import com.duongan.QuanLyKTX.model.NoithatExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface NoithatMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(NoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(NoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer idNoithat);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Noithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Noithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Noithat> selectByExample(NoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Noithat selectByPrimaryKey(Integer idNoithat);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Noithat row, @Param("example") NoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Noithat row, @Param("example") NoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Noithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Noithat row);
}