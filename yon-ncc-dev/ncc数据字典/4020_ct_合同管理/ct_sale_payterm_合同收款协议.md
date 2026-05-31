# |<<

**合同收款协议 (ct_sale_payterm / nc.vo.ct.saledaily.entity.CtSalePayTermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1680.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_sale_payterm | 合同收款协议主键 | pk_ct_sale_payterm | char(20) | √ | 主键 (UFID) |
| 2 | showorder | 收款期 | showorder | int | √ | 整数 (Integer) |
| 3 | vbillcode | 合同编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 4 | accrate | 收款比例（%） | accrate | decimal(16, 4) | √ | 数值 (UFDouble) |
| 5 | prepayment | 预收款 | prepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_incomeperiod | 起效日期 | pk_incomeperiod | varchar(20) |  | 收款时点 (incomeperiod) |
| 7 | effectdateadddate | 起效日期延期天数 | effectdateadddate | int |  | 整数 (Integer) |
| 8 | accountday | 出账日 | accountday | int |  | 整数 (Integer) |
| 9 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) | 0 |
| 10 | checkdata | 固定结账日 | checkdata | int |  | 整数 (Integer) |
| 11 | effectmonth | 生效月 | effectmonth | char(1) |  | 生效月 (effectmonth) |  | 0=当月生效; |