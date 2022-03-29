package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.Hosodangky;
import com.duongan.QuanLyKTX.model.HosodangkyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HosodangkyMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(HosodangkyExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(HosodangkyExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String idHosodk);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Hosodangky row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Hosodangky row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Hosodangky> selectByExample(HosodangkyExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Hosodangky selectByPrimaryKey(String idHosodk);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Hosodangky row, @Param("example") HosodangkyExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Hosodangky row, @Param("example") HosodangkyExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Hosodangky row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Hosodangky row);
}