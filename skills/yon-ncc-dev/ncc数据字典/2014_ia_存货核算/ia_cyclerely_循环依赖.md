# |<<

**循环依赖 (ia_cyclerely / nc.vo.ia.rely.CycleRelyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2799.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccyclerelyid | 循环依赖标识 | ccyclerelyid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_liacenter | 利润中心 | pk_liacenter | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | caccountperiod | 会计期间 | caccountperiod | varchar(7) |  | 字符串 (String) |
| 7 | igroupcode | 组号 | igroupcode | int |  | 整数 (Integer) |
| 8 | coutcostregionid | 发出成本域 | coutcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 9 | coutinventoryid | 发出物料 | coutinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | coutcalcrangeid | 发出计算维度 | coutcalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 11 | cincostregionid | 收入成本域 | cincostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 12 | cininventoryid | 收入物料 | cininventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 13 | cincalcrangeid | 收入计算维度 | cincalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 14 | noutprice | 转出单价 | noutprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | iinnerorder | 组内顺序 | iinnerorder | int |  | 整数 (Integer) |