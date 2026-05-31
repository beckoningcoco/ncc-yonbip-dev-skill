/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.MerchantDerivativeBaseQryDTO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerTradeQryDTO
extends MerchantDerivativeBaseQryDTO {
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerTradeQryDTO)) {
            return false;
        }
        CustomerTradeQryDTO other = (CustomerTradeQryDTO)o;
        return other.canEqual(this);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CustomerTradeQryDTO;
    }

    @Override
    public int hashCode() {
        boolean result = true;
        return 1;
    }

    @Override
    public String toString() {
        return "CustomerTradeQryDTO()";
    }
}

