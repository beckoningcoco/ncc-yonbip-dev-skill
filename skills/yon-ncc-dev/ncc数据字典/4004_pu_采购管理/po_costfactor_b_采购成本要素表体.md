# |<<

**采购成本要素表体 (po_costfactor_b / nc.vo.pu.costfactor.entity.CostfactorItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costfactor_b | 成本要素行 | pk_costfactor_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 费用物料 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | bshow | 是否显示 | bshow | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 5 | ishoworder | 显示顺序 | ishoworder | int |  | 整数 (Integer) |
| 6 | pk_accountfactor | 对应的核算要素 | pk_accountfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |