# |<<

**物料财务信息 (bd_materialfi / nc.vo.bd.material.fi.MaterialFiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialfi | 物料财务信息主键 | pk_materialfi | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 5 | expaybacktax | 出口退税率 | expaybacktax | decimal(15, 8) |  | 数值 (UFDouble) |  | [0 , 1] |
| 6 | planprice | 计划价 | planprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | costprice | 参考成本 | costprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | materialvaluemgt | 实物物料价值管理模式 | materialvaluemgt | smallint | √ | 实物物料价值管理模式 (materialvaluemgt) |  | 1=存货核算; |