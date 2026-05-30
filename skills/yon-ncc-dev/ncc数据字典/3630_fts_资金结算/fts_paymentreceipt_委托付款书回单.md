# |<<

**委托付款书回单 (fts_paymentreceipt / nc.vo.fts.commission.receipt.PaymentReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentreceipt_h | 委托付款书回单标识 | pk_paymentreceipt_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vbillno | 委托付款书回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | vsourcebillno | 委托付款书号 | vsourcebillno | varchar(50) |  | 字符串 (String) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | isreversebusitype | 冲销业务 | isreversebusitype | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isreimbursement | 代理员工报销 | isreimbursement | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_fundpayorg | 付款资金组织 | pk_fundpayorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 13 | pk_fundpayorg_v | 付款资金组织版本 | pk_fundpayorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 14 | pk_transactorg | 办理资金组织 | pk_transactorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 15 | pk_transactorg_v | 办理资金组织版本 | pk_transactorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 16 | pk_inneraccount_p | 付方内部账户 | pk_inneraccount_p | varchar(20) |  | 内部账户 (bd_accid) |
| 17 | pk_company_r | 收款客商标识 | pk_company_r | char(20) |  | 主键 (UFID) |
| 18 | pk_bankaccount_r | 收款方银行账号标识 | pk_bankaccount_r | char(20) |  | 主键 (UFID) |
| 19 | company_r | 收款方单位名称 | company_r | varchar(200) |  | 字符串 (String) |
| 20 | address_r | 收款方单位地址 | address_r | varchar(200) |  | 字符串 (String) |
| 21 | bankaccount_r | 收款方银行账号 | bankaccount_r | varchar(200) |  | 字符串 (String) |
| 22 | pk_bankname_r | 收款方开户银行标识 | pk_bankname_r | char(20) |  | 主键 (UFID) |
| 23 | bankname_r | 收款方开户银行名称 | bankname_r | varchar(200) |  | 字符串 (String) |
| 24 | custaccprop | 客商账户性质 | custaccprop | int |  | 账户性质 (accountproperty) |  | 0=公司; |