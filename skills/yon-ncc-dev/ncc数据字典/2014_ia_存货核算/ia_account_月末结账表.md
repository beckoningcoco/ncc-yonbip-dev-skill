# |<<

**月末结账表 (ia_account / nc.vo.ia.monthaccount.entity.MonthAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2788.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | caccountid | 月末结账表主键 | caccountid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_book | 账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | caccountperiod | 最新结账会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | cdumpperiod | 最新转储会计期间 | cdumpperiod | char(7) |  | 字符串 (String) |