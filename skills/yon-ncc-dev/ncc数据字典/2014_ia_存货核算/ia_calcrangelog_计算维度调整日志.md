# |<<

**计算维度调整日志 (ia_calcrangelog / nc.vo.ia.invalmethod.entity.CalcRangeLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2796.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccalcrangelodid | 计算维度调整日志主键 | ccalcrangelodid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 7 | coldrangefields | 原计算维度字段 | coldrangefields | varchar(500) |  | 字符串 (String) |
| 8 | cnewrangefields | 新计算维度字段 | cnewrangefields | varchar(500) |  | 字符串 (String) |
| 9 | cmodifier | 调整人 | cmodifier | varchar(20) |  | 人员基本信息 (psndoc) |