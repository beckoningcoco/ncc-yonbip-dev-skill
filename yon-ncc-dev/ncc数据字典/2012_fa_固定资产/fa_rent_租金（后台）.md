# |<<

**租金（后台） (fa_rent / nc.vo.fa.assetcard.RentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent | 主键 | pk_rent | char(20) | √ | 主键 (UFID) |
| 2 | undertaker | 承租方 | undertaker | varchar(80) |  | 字符串 (String) |
| 3 | area | 面积 | area | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | term_date | 期限 | term_date | char(19) |  | 日期 (UFDate) |
| 5 | rent_date | 租赁日期 | rent_date | char(19) |  | 日期 (UFDate) |
| 6 | month_rent | 月租金 | month_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | total_rent | 租金总额 | total_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | fact_date | 实际日期 | fact_date | char(19) |  | 日期 (UFDate) |
| 9 | reside_period | 所属期间 | reside_period | varchar(80) |  | 字符串 (String) |
| 10 | fact_rent | 实际租金 | fact_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_bill | 收款单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 12 | pk_bill_b | 单据表体主键 | pk_bill_b | varchar(20) |  | 字符串 (String) |
| 13 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |