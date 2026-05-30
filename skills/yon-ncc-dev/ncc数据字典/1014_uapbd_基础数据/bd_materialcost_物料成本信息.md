# |<<

**物料成本信息 (bd_materialcost / nc.vo.bd.material.cost.MaterialCostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialcost | 物料成本信息主键 | pk_materialcost | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属成本域 | pk_org | char(20) | √ | 组织_成本域 (costregion) |
| 5 | costprice | 参考成本 | costprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |