# |<<

**租赁负债 (ali_leaseliability / nc.vo.ali.used.confirm.LeaseLiabilityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/57.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leaseliability | 租赁负债主键 | pk_leaseliability | char(20) | √ | 主键 (UFID) |
| 2 | begin_date | 起始日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 3 | end_date | 截止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 4 | calculate_renttax | 租赁付款额含税 | calculate_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | calculate_rentnotax | 租赁付款额无税 | calculate_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | begin_liability | 期初租赁负债 | begin_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | end_liability | 期末租赁负债 | end_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | interest | 利息 | interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | stage | 周期 | stage | int |  | 整数 (Integer) |
| 10 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |