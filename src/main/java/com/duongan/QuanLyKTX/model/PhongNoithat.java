package com.duongan.QuanLyKTX.model;

import lombok.Data;

/**
 * Table: phong_noithat
 */
@Data
public class PhongNoithat {
    /**
     * Column: id_phong
     * Type: VARCHAR(5)
     */
    private String idPhong;

    /**
     * Column: id_noithat
     * Type: INT
     */
    private Integer idNoithat;

    /**
     * Column: soluong
     * Type: INT
     * Default value: 15
     */
    private Integer soluong;
}