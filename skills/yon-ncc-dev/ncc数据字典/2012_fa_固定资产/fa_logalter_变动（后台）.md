# |<<

**变动（后台） (fa_logalter / nc.vo.fa.assetcard.LogalterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logalter | 主键 | pk_logalter | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | bill_code | 变动单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | alter_type | 变动类型 | alter_type | varchar(80) |  | 字符串 (String) |
| 5 | old_value | 变动前 | old_value | varchar(80) |  | 字符串 (String) |
| 6 | new_value | 变动后 | new_value | varchar(80) |  | 字符串 (String) |
| 7 | alter_reason | 变动原因 | alter_reason | varchar(20) |  | 原因 (reason) |
| 8 | alter_date | 变动日期 | alter_date | char(19) |  | 日期 (UFDate) |
| 9 | auditor | 审核人 | auditor | varchar(20) |  | 用户 (user) |
| 10 | item_code | 卡片上的变动字段 | item_code | varchar(20) |  | 字符串 (String) |
| 11 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |