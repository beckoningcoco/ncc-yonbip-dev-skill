# |<<

**替换件 (bd_materialrepl / nc.vo.bd.material.stock.MaterialReplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialrepl | 替换件主键 | pk_materialrepl | char(20) | √ | 主键 (UFID) |
| 2 | pk_materialplan | 物料计划信息主键 | pk_materialplan | char(20) | √ | 物料计划信息 (materialplan) |
| 3 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | pk_replace | 替换件 | pk_replace | char(20) | √ | 物料基本信息（多版本） (material) |
| 6 | substituterate | 替代系数 | substituterate | varchar(50) | √ | 字符串 (String) | 1/1 |
| 7 | replaceorder | 替换顺序 | replaceorder | int |  | 整数 (Integer) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |