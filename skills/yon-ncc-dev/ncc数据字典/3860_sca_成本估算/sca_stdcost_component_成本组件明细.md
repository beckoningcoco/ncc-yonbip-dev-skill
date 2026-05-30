# |<<

**成本组件明细 (sca_stdcost_component / nc.vo.sca.stdcostcalc.StdProdCostComponentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stdcost_component | 成本组件明细主键 | pk_stdcost_component | char(20) | √ | 主键 (UFID) |
| 2 | cstdcostid | 标准产品成本表 | cstdcostid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 8 | ccostcompstrucid | 成本组件结构 | ccostcompstrucid | varchar(20) |  | 成本组件结构明细 (bd_costcompstruc_b) |
| 9 | thiscost | 本层成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | upcost | 上层成本 | upcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ncost | 总成本 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 13 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |