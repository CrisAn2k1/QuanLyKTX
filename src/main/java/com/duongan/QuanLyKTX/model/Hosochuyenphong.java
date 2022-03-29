package com.duongan.QuanLyKTX.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: hosochuyenphong
 */
@Data
public class Hosochuyenphong {
    /**
     * Column: id_hosoCP
     * Type: INT
     */
    private Integer idHosocp;

    /**
     * Column: mota
     * Type: VARCHAR(255)
     */
    private String mota;

    /**
     * Column: ngaynop
     * Type: DATETIME
     * Default value: CURRENT_TIMESTAMP
     */
    private Date ngaynop;

    /**
     * Column: username
     * Type: VARCHAR(16)
     */
    private String username;
}