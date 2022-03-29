package com.duongan.QuanLyKTX.mapper;

import java.util.List;
import com.duongan.QuanLyKTX.model.Hosochuyenphong;
import com.duongan.QuanLyKTX.model.HosochuyenphongExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HosochuyenphongMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(HosochuyenphongExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(HosochuyenphongExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer idHosocp);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Hosochuyenphong row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Hosochuyenphong row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Hosochuyenphong> selectByExample(HosochuyenphongExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Hosochuyenphong selectByPrimaryKey(Integer idHosocp);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Hosochuyenphong row, @Param("example") HosochuyenphongExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Hosochuyenphong row, @Param("example") HosochuyenphongExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Hosochuyenphong row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Hosochuyenphong row);
}