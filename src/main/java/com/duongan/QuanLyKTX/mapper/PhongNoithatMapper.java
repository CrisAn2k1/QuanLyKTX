package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.PhongNoithat;
import com.duongan.QuanLyKTX.model.PhongNoithatExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PhongNoithatMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PhongNoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PhongNoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("idPhong") String idPhong, @Param("idNoithat") Integer idNoithat);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PhongNoithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PhongNoithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PhongNoithat> selectByExample(PhongNoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    PhongNoithat selectByPrimaryKey(@Param("idPhong") String idPhong, @Param("idNoithat") Integer idNoithat);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") PhongNoithat row, @Param("example") PhongNoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") PhongNoithat row, @Param("example") PhongNoithatExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(PhongNoithat row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(PhongNoithat row);
}