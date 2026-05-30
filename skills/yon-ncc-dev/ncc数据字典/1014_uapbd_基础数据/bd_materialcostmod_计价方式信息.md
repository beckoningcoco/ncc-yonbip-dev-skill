# |<<

**计价方式信息 (bd_materialcostmod / nc.vo.bd.material.cost.MaterialCostmodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialcostmod | 计价方式信息主键 | pk_materialcostmod | char(20) | √ | 主键 (UFID) |
| 2 | pk_materialcost | 物料成本信息主键 | pk_materialcost | char(20) | √ | 物料成本信息 (materialcost) |
| 3 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 4 | pk_costregion | 所属成本域 | pk_costregion | char(20) | √ | 组织_成本域 (costregion) |
| 5 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) | √ | 账簿_核算账簿 (accbook) |
| 6 | costmode | 计价方式 | costmode | smallint | √ | 成本计价方式 (marcostmode) |  | 1=先进先出; |