# |<<

**物料税类信息 (bd_materialtaxtype / nc.vo.bd.material.MaterialTaxTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialtaxtype | 物料税类主键 | pk_materialtaxtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_countryzone | 国家 | pk_countryzone | char(20) | √ | 国家地区 (countryzone) |
| 4 | pk_mattaxes | 税类 | pk_mattaxes | char(20) | √ | 物料税类 (mattaxes) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int | √ | 数据来源 (dataorigin) | 0 | 0=本级产生; |