# |<<

**期间结存标志记录 (ia_period / nc.vo.ia.monthaccount.entity.PeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 所属集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 2 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 4 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 主键 (UFID) |