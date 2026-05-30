# |<<

**卷积作业价格方案 (sca_convscheme_activity / nc.vo.sca.costsimulation.entity.ConvSchemeActVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccativitypriceid | 卷积作业价格方案 | ccativitypriceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_convscheme | 卷积方案 | pk_convscheme | char(20) | √ | 主键 (UFID) |
| 3 | seqnum | 优先顺序 | seqnum | int |  | 整数 (Integer) |
| 4 | priceaddcoefficient | 价格加成系数 | priceaddcoefficient | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | ipriceresource | 价格来源 | ipriceresource | int |  | 作业价格来源 (iActPriceSourceEnum) | 1 | 1=计划价; |