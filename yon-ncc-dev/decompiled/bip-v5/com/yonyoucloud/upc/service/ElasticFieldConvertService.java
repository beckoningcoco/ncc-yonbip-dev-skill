/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.support.itf.MddCharacterSupportService
 *  com.yonyou.ucf.mdd.ext.support.model.CharacterFieldDescribeDTO
 *  com.yonyoucloud.upc.other.BillnumberEnum
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.support.itf.MddCharacterSupportService;
import com.yonyou.ucf.mdd.ext.support.model.CharacterFieldDescribeDTO;
import com.yonyoucloud.upc.other.BillnumberEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="elasticFieldConvertService")
public class ElasticFieldConvertService {
    @Autowired
    private MddCharacterSupportService mddCharacterSupportService;
    private Logger logger = LoggerFactory.getLogger(ElasticFieldConvertService.class);

    public CharacterFieldDescribeDTO elasticFieldConvert(String billnumber, String fieldName) throws Exception {
        String fullname = BillnumberEnum.find((String)billnumber).getFullname();
        CharacterFieldDescribeDTO fieldDto = this.mddCharacterSupportService.getCharacterFieldDescribe(fullname, fieldName);
        this.logger.info("\u5f39\u6027\u5b57\u6bb5\u8f6c\u6362\u7ed3\u679c\uff1a" + fieldDto);
        return fieldDto;
    }
}

