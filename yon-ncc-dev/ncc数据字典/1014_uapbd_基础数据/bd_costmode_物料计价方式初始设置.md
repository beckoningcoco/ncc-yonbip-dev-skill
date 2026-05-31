# |<<

**物料计价方式初始设置 (bd_costmode / nc.vo.bd.materialcostmode.CostModeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costmode | 物料计价方式主键 | pk_costmode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_cost | 成本域 | pk_cost | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | pk_setofbook | 核算帐簿 | pk_setofbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | costmode | 计价方式 | costmode | int |  | 成本计价方式 (marcostmode) | 3 | 1=先进先出; |