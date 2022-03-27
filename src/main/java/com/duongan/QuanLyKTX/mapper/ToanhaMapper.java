package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.Toanha;
import com.duongan.QuanLyKTX.model.ToanhaExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ToanhaMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ToanhaExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ToanhaExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String idToanha);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Toanha row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Toanha row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Toanha> selectByExample(ToanhaExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Toanha selectByPrimaryKey(String idToanha);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Toanha row, @Param("example") ToanhaExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Toanha row, @Param("example") ToanhaExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Toanha row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Toanha row);
}