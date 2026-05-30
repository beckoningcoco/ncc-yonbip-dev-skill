# |<<

**贴现试算子表 (fbm_discountcalculate_b / nc.vo.fbm.discountcalculate.DiscalculateBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pk_discalculate_b | 主键 | pk_pk_discalculate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_discalculate | 主表主键 | pk_discalculate | char(20) |  | 主键 (UFID) |
| 3 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号（隐藏） | fbmbillno | varchar(50) |  | 字符串 (String) |
| 5 | interest_year | 贴现年利率 | interest_year | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 6 | interest_month | 贴现月利率 | interest_month | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 1000] |
| 7 | interest_day | 贴现日利率 | interest_day | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 1000] |
| 8 | enable_date | 起效日期 | enable_date | char(19) |  | 日期 (UFDate) |
| 9 | discount_date_b | 贴现日期 | discount_date_b | char(19) |  | 日期 (UFDate) |
| 10 | discount_interest | 贴现利息 | discount_interest | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | olc_discount_interest | 组织贴现利息本币金额 | olc_discount_interest | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | glc_discount_interest | 集团贴现利息本币金额 | glc_discount_interest | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | gll_discount_interest | 全局贴现利息本币金额 | gll_discount_interest | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | discount_money | 贴现净值 | discount_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olc_discount_money | 组织贴现净值本币金额 | olc_discount_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | glc_discount_money | 集团贴现净值本币金额 | glc_discount_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | gll_discount_money | 全局贴现净值本币金额 | gll_discount_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | interest_days_b | 利率天数 | interest_days_b | int |  | 利率天数 (interestdays) |  | 360=360天; |