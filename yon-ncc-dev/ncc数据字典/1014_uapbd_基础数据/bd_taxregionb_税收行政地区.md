# |<<

**税收行政地区 (bd_taxregionb / nc.vo.bd.taxregion.TaxregionBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxregion_b | 税收行政地区主键 | pk_taxregion_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_taxregion | 税收地区主键 | pk_taxregion | char(20) | √ | 主键 (UFID) |
| 3 | pk_region | 行政区划 | pk_region | varchar(20) | √ | 行政区划 (region) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int | √ | 数据来源 (dataorigin) | 0 | 0=本级产生; |