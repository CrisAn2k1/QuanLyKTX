package com.duongan.QuanLyKTX.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: hoadon
 */
@Data
public class Hoadon {
    /**
     * Column: id_hoadon
     * Type: INT
     */
    private Integer idHoadon;

    /**
     * Column: thanhtien
     * Type: DOUBLE
     */
    private Double thanhtien;

    /**
     * Column: ngayxuatHD
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date ngayxuathd;

    /**
     * Column: id_phong
     * Type: VARCHAR(5)
     */
    private String idPhong;
}