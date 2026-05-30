# |<<

**票据付款回单 (fbm_accept / nc.vo.cfbm.acceptback.AcceptBackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accept | 主键 | pk_accept | char(20) | √ | 主键 (UFID) |
| 2 | acceptno | 承兑办理单编号 | acceptno | varchar(50) |  | 字符串 (String) |
| 3 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 6 | securityaccount | 保证金账户 | securityaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 7 | backsecaccount | 返回保证金帐户 | backsecaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 8 | holdunit | 持票单位 | holdunit | varchar(20) |  | 客商 (custsupplier) |
| 9 | holderacc | 持票单位银行帐号 | holderacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 10 | pk_holderbank | 持票单位开户行 | pk_holderbank | varchar(20) |  | 银行档案 (bankdoc) |
| 11 | dacceptnotedate | 通知承兑日期 | dacceptnotedate | char(19) |  | 日期 (UFDate) |
| 12 | dacceptdate | 付款日期 | dacceptdate | char(19) |  | 日期 (UFDate) |
| 13 | note | 备注 | note | varchar(181) |  | 字符串 (String) |
| 14 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 15 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |