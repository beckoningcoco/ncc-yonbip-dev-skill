# |<<

**变动记录 (fa_logalterview / nc.vo.fa.asset.LogalterViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logalter | 主键 | pk_logalter | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | bill_code | 变动单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 5 | alter_type | 变动类型 | alter_type | varchar(80) |  | 字符串 (String) |
| 6 | old_value | 变动前内容 | old_value | varchar(80) |  | 字符串 (String) |
| 7 | new_value | 变动后内容 | new_value | varchar(80) |  | 字符串 (String) |
| 8 | alter_date | 变动日期 | alter_date | char(19) |  | 日期 (UFDate) |
| 9 | alter_reason | 变动原因 | alter_reason | varchar(20) |  | 原因 (reason) |
| 10 | auditor | 审核人 | auditor | varchar(20) |  | 用户 (user) |
| 11 | edit_flag | 手工录入 | edit_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | item_code | 变动字段 | item_code | varchar(80) |  | 字符串 (String) |
| 13 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 14 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |