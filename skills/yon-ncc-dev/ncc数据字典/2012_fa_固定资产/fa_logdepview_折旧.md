# |<<

**折旧 (fa_logdepview / nc.vo.fa.asset.LogdepViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logdep | 主键 | pk_logdep | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | depamount | 月折旧额 | depamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | monthworkloan | 月工作量 | monthworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | accuworkloan | 累计工作量 | accuworkloan | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | period_string | 会计期间 | period_string | varchar(40) |  | 字符串 (String) |
| 8 | accyear | 年 | accyear | varchar(4) |  | 字符串 (String) |
| 9 | period | 月 | period | varchar(2) |  | 字符串 (String) |
| 10 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |