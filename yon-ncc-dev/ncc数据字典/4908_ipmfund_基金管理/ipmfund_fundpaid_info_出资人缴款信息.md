# |<<

**出资人缴款信息 (ipmfund_fundpaid_info / nc.vo.ipmfund.fundpaid.FundpaidInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundpaid_info | 出资人信息主键 | pk_fundpaid_info | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 4 | nallpaidrate | 累计实缴比例（%） | nallpaidrate | decimal(28, 2) |  | 数值 (UFDouble) |
| 5 | nallallpaidmny | 累计实缴金额（全局本币） | nallallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ngpallpaidmny | 累计实缴金额（集团本币） | ngpallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nbaseallpaidmny | 累计实缴金额（组织本币） | nbaseallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | norigallpaidmny | 累计实缴金额（组织原币） | norigallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nallreturnedmny | 过往已退还本金（全局本币） | nallreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ngpreturnedmny | 过往已退还本金（集团本币） | ngpreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbasereturnedmny | 过往已退还本金（组织本币） | nbasereturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | norigreturnedmny | 过往已退还本金（组织原币） | norigreturnedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallpaidmny | 过往已实缴金额（全局本币） | nallpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ngppaidmny | 过往已实缴金额（集团本币） | ngppaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasepaidmny | 过往已实缴金额（组织本币） | nbasepaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | norigpaidmny | 过往已实缴金额（组织原币） | norigpaidmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | dpaid_date | 实缴到位日期 | dpaid_date | char(19) |  | 日期 (UFDate) |
| 18 | nallcurrmny | 本次实缴金额（全局本币） | nallcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ngpcurrmny | 本次实缴金额（集团本币） | ngpcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nbasecurrmny | 本次实缴金额（组织本币） | nbasecurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | norigcurrmny | 本次实缴金额（组织原币） | norigcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nalladmitmny | 认缴出资金额（全局本币） | nalladmitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngpadmitmny | 认缴出资金额（集团本币） | ngpadmitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nbaseadmitmny | 认缴出资金额（组织本币） | nbaseadmitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | norigadmitmny | 认缴出资金额（组织原币） | norigadmitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | vpartnernature | 出资人性质 | vpartnernature | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |