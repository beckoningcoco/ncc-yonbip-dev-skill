# |<<

**付票登记 (fbm_paybill / nc.vo.fbm.paybill.PayBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | 主键 | pk_paybill | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |