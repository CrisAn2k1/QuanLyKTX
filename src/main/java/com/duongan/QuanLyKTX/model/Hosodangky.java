package com.duongan.QuanLyKTX.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: hosodangky
 */
@Data
public class Hosodangky {
    /**
     * Column: id_hosoDK
     * Type: VARCHAR(10)
     */
    private String idHosodk;

    /**
     * Column: mota
     * Type: VARCHAR(255)
     */
    private String mota;

    /**
     * Column: ngaynop
     * Type: TIMESTAMP
     * Default value: CURRENT_TIMESTAMP
     */
    private Date ngaynop;

    /**
     * Column: ngaybatdau
     * Type: DATE
     */
    private Date ngaybatdau;

    /**
     * Column: ngaykethuc
     * Type: DATE
     */
    private Date ngaykethuc;

    /**
     * Column: username
     * Type: VARCHAR(16)
     */
    private String username;
}