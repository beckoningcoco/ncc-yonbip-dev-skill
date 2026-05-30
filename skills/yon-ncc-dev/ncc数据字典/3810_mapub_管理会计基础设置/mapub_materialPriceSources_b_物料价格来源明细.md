# |<<

**物料价格来源明细 (mapub_materialPriceSources_b / nc.vo.mapub.materialpricebase.entity.MaterialPriceSourcesBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpricesources_bid | 物料价格来源明细 | cpricesources_bid | char(20) | √ | 主键 (UFID) |
| 2 | cpricesourcesid | 物料价格来源 | cpricesourcesid | char(20) |  | 主键 (UFID) |
| 3 | vpricesource | 价格来源 | vpricesource | int |  | 价格来源 (priceSourceEnun) |  | 1=手工录入; |