# |<<

**计提利息记录 (fa_logdepaccrualview / nc.vo.fa.asset.LogDepAccrualViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logdepaccrual | 主键 | pk_logdepaccrual | char(20) | √ | 主键 (UFID) |
| 2 | begin_liability | 期初租赁负债 | begin_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | local_interest | 利息(本币) | local_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | local_accrued_interest | 累计计提利息(本币) | local_accrued_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | end_liability | 期末租赁负债 | end_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | accounting_period | 会计期间 | accounting_period | varchar(50) |  | 字符串 (String) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |