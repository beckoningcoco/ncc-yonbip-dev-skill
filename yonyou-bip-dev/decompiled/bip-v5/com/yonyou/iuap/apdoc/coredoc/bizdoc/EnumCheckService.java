/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyou.iuap.apdoc.coredoc.bizdoc;

import com.yonyou.iuap.apdoc.coredoc.bizdoc.EnumCheckDTO;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnumCheckService {
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public void check(EnumCheckDTO ... enumCheckDTOArr) {
        if (ArrayUtils.isEmpty((Object[])enumCheckDTOArr)) {
            return;
        }
        List enumTypes = Stream.of(enumCheckDTOArr).filter(enumCheckDTO -> !StringUtils.isBlank((CharSequence)enumCheckDTO.getEnumType())).map(EnumCheckDTO::getEnumType).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(enumTypes)) {
            return;
        }
        StringBuilder sqlBuilder = new StringBuilder(" select enumcode,enumType from aa_enum where ideleted = 0 and enumType in ");
        SQLParameter sqlParameter = new SQLParameter(true);
        sqlBuilder.append(" ( ");
        String separator1 = " , ";
        for (int index = 0; index < enumTypes.size(); ++index) {
            String item = (String)enumTypes.get(index);
            sqlBuilder.append(" ? ");
            sqlParameter.addParam(item);
            if (index >= enumTypes.size() - 1) continue;
            sqlBuilder.append(separator1);
        }
        sqlBuilder.append(" ) ");
        List list = this.ymsJdbcApi.queryForList(sqlBuilder.toString(), sqlParameter, (ResultSetProcessor)new MapListProcessor());
        if (CollectionUtils.isEmpty((Collection)list)) {
            return;
        }
        for (EnumCheckDTO enumCheckDTO2 : enumCheckDTOArr) {
            String enumType = enumCheckDTO2.getEnumType();
            Object enumValue = enumCheckDTO2.getEnumValue();
            if (StringUtils.isBlank((CharSequence)enumType) || enumValue == null || !list.stream().noneMatch(m -> enumType.equals(m.get("enumType")) && enumValue.toString().equals(m.get("enumcode")))) continue;
            throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1F0A2F7405200008", (String)"\u53c2\u6570\u503c\u8d85\u51fa\u8303\u56f4") + " " + enumCheckDTO2.getFieldName() + ":" + enumValue);
        }
    }
}

