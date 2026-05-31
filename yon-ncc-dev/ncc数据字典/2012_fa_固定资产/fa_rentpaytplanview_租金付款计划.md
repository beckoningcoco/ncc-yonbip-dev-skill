# |<<

**租金付款计划 (fa_rentpaytplanview / nc.vo.fa.asset.RentPaymentPlanViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2059.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentpayplan | 主键 | pk_rentpayplan | char(20) | √ | 主键 (UFID) |
| 2 | start_date | 起算日期 | start_date | char(19) |  | 日期 (UFDate) |
| 3 | end_date | 止算日期 | end_date | char(19) |  | 日期 (UFDate) |
| 4 | accounting_period | 会计期间 | accounting_period | char(19) |  | 日期 (UFDate) |
| 5 | calculate_renttax | 含税租金 | calculate_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | calculate_tax | 税额 | calculate_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | calculate_rentnotax | 无税租金 | calculate_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | adjustment_renttax | 调整后租金 | adjustment_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | period_num | 分段周期 | period_num | int |  | 整数 (Integer) |
| 10 | renewal_flag | 续租选择权 | renewal_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | remarks | 备注 | remarks | varchar(200) |  | 字符串 (String) |
| 12 | nocalculate | 免租期标识 | nocalculate | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | amount_type | 租金类型 | amount_type | int |  | 租金类型 (rent_type) | 1 | 1=租金; |