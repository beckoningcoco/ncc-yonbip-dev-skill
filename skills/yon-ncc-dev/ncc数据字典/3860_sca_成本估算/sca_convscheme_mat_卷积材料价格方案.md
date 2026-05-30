# |<<

**卷积材料价格方案 (sca_convscheme_mat / nc.vo.sca.costsimulation.entity.ConvSchemeMatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmatpriceid | 卷积材料价格方案 | cmatpriceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_convscheme | 卷积方案 | pk_convscheme | char(20) |  | 主键 (UFID) |
| 3 | ipriceresource | 价格来源 | ipriceresource | int |  | 价格来源 (iPriceSourceEnum) | 1 | 1=计划价; |