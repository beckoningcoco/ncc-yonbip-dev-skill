# |<<

**依赖顺序 (ia_relyorder / nc.vo.ia.rely.RelyOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crelyorderid | 依赖顺序标识 | crelyorderid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_liacenter | 利润中心 | pk_liacenter | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 7 | ccostregionid | 成本域 | ccostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 8 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | ccalcrangeid | 计算维度 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 10 | icalcorder | 计算顺序 | icalcorder | int |  | 整数 (Integer) |