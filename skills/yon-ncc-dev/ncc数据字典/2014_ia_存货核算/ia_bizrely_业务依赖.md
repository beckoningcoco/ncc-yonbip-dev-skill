# |<<

**业务依赖 (ia_bizrely / nc.vo.ia.rely.BizRelyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_liacenter | 利润中心 | pk_liacenter | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | coutcostregionid | 发出成本域 | coutcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | coutinventoryid | 发出物料 | coutinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | coutcalcrangeid | 发出计算维度 | coutcalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 9 | cincostregionid | 收入成本域 | cincostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 10 | cininventoryid | 收入物料 | cininventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cincalcrangeid | 收入计算维度 | cincalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |