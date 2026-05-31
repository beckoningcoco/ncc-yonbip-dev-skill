/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.IProductDetailService
 *  com.yonyoucloud.iuap.upc.vo.ProductAlbumVO
 *  com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.IProductDetailService;
import com.yonyoucloud.iuap.upc.vo.ProductAlbumVO;
import com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class ProductDetailServiceImpl
implements IProductDetailService {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailServiceImpl.class);

    public List<ProductAlbumVO> listProductAlbum(Long productId) throws Exception {
        return null;
    }

    public List<ProductAttachmentVO> listProductAttachment(Long productId) throws Exception {
        return null;
    }

    public Product getProductByIdAndOrgId(Long productId, String orgId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        schema.addCompositionSchema(QuerySchema.create().name("productAssistClasses").fullname("pc.product.ProductAssistClass").addSelect("*"));
        schema.addCompositionSchema(QuerySchema.create().name("productAssistUnitExchanges").fullname("pc.product.ProductAssistUnitExchange").addSelect("*"));
        List products = this.query("pc.product.Product", schema);
        Product product = (Product)products.get(0);
        schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId").eq((Object)orgId)});
        List ranges = this.query("pc.product.ProductApplyRange", schema);
        product.setProductApplyRange(ranges);
        ProductApplyRange range = (ProductApplyRange)ranges.get(0);
        schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)range.getProductDetailId())});
        List productDetails = this.query("pc.product.ProductDetail", schema);
        product.setProductDetail(productDetails);
        schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productDetailId").eq((Object)range.getProductDetailId())});
        List productTagNews = this.query("pc.product.ProductTagNew", schema);
        range.setProductTagNew(productTagNews);
        return product;
    }

    private List query(String fullname, QuerySchema schema) throws Exception {
        List datas = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        ArrayList<BizObject> resultDatas = new ArrayList<BizObject>();
        if (!CollectionUtils.isEmpty((Collection)datas)) {
            for (Map data : datas) {
                resultDatas.add(Objectlizer.convert((Map)data, (String)fullname));
            }
        }
        return resultDatas;
    }
}

