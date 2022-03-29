package com.duongan.QuanLyKTX.model;

import lombok.Data;

/**
 * Table: noithat
 */
@Data
public class Noithat {
    /**
     * Column: id_noithat
     * Type: INT
     */
    private Integer idNoithat;

    /**
     * Column: ten
     * Type: VARCHAR(50)
     */
    private String ten;

    /**
     * Column: soluongton
     * Type: INT
     */
    private Integer soluongton;
}