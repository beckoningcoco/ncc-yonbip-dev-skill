# |<<

**减少 (fa_logreduceview / nc.vo.fa.asset.LogreduceViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce | 主键 | pk_reduce | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | reduce_date | 减少日期 | reduce_date | char(19) |  | 日期 (UFDate) |
| 4 | pk_reducestyle | 减少方式 | pk_reducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 5 | purgerevenue | 清理收入 | purgerevenue | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | purgefee | 清理费用 | purgefee | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | reason | 减少原因 | reason | varchar(20) |  | 原因 (reason) |
| 8 | reducesource | 减少来源 | reducesource | varchar(80) |  | 字符串 (String) |
| 9 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 10 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 11 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |