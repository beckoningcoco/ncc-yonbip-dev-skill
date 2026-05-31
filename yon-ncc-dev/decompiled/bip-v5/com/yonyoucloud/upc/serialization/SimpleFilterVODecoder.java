/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonParser
 *  com.fasterxml.jackson.core.ObjectCodec
 *  com.fasterxml.jackson.databind.DeserializationContext
 *  com.fasterxml.jackson.databind.JsonNode
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.boot.jackson.JsonComponent
 */
package com.yonyoucloud.upc.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyoucloud.upc.serialization.UPCObjectDecoder;
import java.io.IOException;
import org.imeta.core.base.ConditionOperator;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class SimpleFilterVODecoder
extends UPCObjectDecoder<SimpleFilterVO> {
    protected SimpleFilterVO deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        return this.decodeSimpleFilterVO(tree);
    }

    private SimpleFilterVO decodeSimpleFilterVO(JsonNode tree) throws IOException {
        if (tree.has("logicOp") || tree.has("conditions")) {
            String logicOp = "and";
            if (tree.has("logicOp")) {
                logicOp = tree.get("logicOp").asText("and");
            }
            SimpleFilterVO groupVO = new SimpleFilterVO(ConditionOperator.valueOf((String)logicOp));
            if (tree.has("conditions")) {
                JsonNode children = tree.get("conditions");
                for (JsonNode child : children) {
                    groupVO.getConditions().add(this.decodeSimpleFilterVO(child));
                }
            }
            return groupVO;
        }
        return (SimpleFilterVO)UpcJacksonUtils.OBJECT_MAPPER.readValue(tree.toString(), SimpleFilterVO.class);
    }
}

