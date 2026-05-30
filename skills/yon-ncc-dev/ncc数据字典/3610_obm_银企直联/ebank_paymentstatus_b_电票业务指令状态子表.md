# |<<

**电票业务指令状态子表 (ebank_paymentstatus_b / nc.vo.obm.ebankpaymentstatus.EbankPaymentStatusBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpaymentstatus_b | 主键 | pk_ebankpaymentstatus_b | char(20) | √ | 主键 (UFID) |
| 2 | dppaymenttype | 电票指令类型 | dppaymenttype | int |  | 电票指令类型 (EcdTypeEnum) |  | 1=电票签收; |