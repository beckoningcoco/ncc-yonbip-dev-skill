# |<<

**支付确认单 (ebank_confirmpay_h / nc.vo.obm.ebankconfirmpay.ConfirmPayHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmpay_h | 支付确认单主表主键 | pk_confirmpay_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | yurref | 支付参考号 | yurref | varchar(100) |  | 字符串 (String) |
| 6 | reconciliationcode | 对账标识码 | reconciliationcode | varchar(50) |  | 字符串 (String) |
| 7 | dbtrbank | 付款开户银行 | dbtrbank | varchar(100) |  | 字符串 (String) |
| 8 | pk_banktype | 付方银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 9 | dbtracc | 付款银行账号 | dbtracc | varchar(50) |  | 字符串 (String) |
| 10 | dbtraccname | 付款账户户名 | dbtraccname | varchar(100) |  | 字符串 (String) |
| 11 | pk_bankaccbas | 付款账户 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 12 | pk_bankaccsub | 付款子户 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 14 | vbillno | 单据编号 | vbillno | varchar(60) |  | 字符串 (String) |
| 15 | billstate | 单据状态 | billstate | varchar(20) |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |