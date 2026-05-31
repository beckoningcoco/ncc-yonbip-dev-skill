# |<<

**贴现试算 (fbm_discountcalculate / nc.vo.fbm.discountcalculate.DiscalculateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2128.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discalculate | 主键 | pk_discalculate | char(20) | √ | 主键 (UFID) |
| 2 | discount_date | 贴现日期 | discount_date | char(19) |  | 日期 (UFDate) |
| 3 | interest_date_year | 贴现年利率 | interest_date_year | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 4 | delay_days | 延迟天数 | delay_days | int |  | 整数 (Integer) |
| 5 | interest_days | 利率天数 | interest_days | int |  | 利率天数 (interestdays) | 360 | 360=360天; |