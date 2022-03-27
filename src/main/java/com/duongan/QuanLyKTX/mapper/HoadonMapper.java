package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.Hoadon;
import com.duongan.QuanLyKTX.model.HoadonExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HoadonMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(HoadonExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(HoadonExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer idHoadon);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Hoadon row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Hoadon row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Hoadon> selectByExample(HoadonExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Hoadon selectByPrimaryKey(Integer idHoadon);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Hoadon row, @Param("example") HoadonExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Hoadon row, @Param("example") HoadonExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Hoadon row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Hoadon row);
}