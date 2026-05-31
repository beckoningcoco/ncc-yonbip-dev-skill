# |<<

**物料采购信息 (bd_materialpu / nc.vo.bd.material.pu.MaterialPuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialpu | 物料采购信息主键 | pk_materialpu | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属采购组织 | pk_org | char(20) | √ | 组织_业务单元_采购组织 (purchaseorg) |
| 5 | isnoconallowed | 允许无采购合同 | isnoconallowed | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isselfapprsupplier | 采购自核准供应商 | isselfapprsupplier | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_cumandoc | 主供应商 | pk_cumandoc | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | maxprice | 最高限价 | maxprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | purchasestge | 采购策略 | purchasestge | smallint |  | 采购策略 (pustrategy) |  | 0=根据供货配额采购; |