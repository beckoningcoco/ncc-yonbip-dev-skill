# |<<

**委托收款回单 (fts_gatheringreceipt / nc.vo.fts.commission.receipt.GatheringReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringreceipt_h | 委托收款回单标识 | pk_gatheringreceipt_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型编码 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vbillno | 委托收款回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | vsourcebillno | 委托收款书号 | vsourcebillno | varchar(50) |  | 字符串 (String) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | isreversebusitype | 冲销业务 | isreversebusitype | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_fundgetorg | 收款资金组织 | pk_fundgetorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 12 | pk_fundgetorg_v | 收款资金组织版本 | pk_fundgetorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 13 | pk_transactorg | 办理资金组织 | pk_transactorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 14 | pk_transactorg_v | 办理资金组织版本 | pk_transactorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 15 | pk_inneraccount_r | 收款内部账户 | pk_inneraccount_r | varchar(20) |  | 内部账户 (bd_accid) |
| 16 | pk_company_p | 付款客商标识 | pk_company_p | char(20) |  | 主键 (UFID) |
| 17 | pk_bankaccount_p | 客商银行账号标识 | pk_bankaccount_p | char(20) |  | 主键 (UFID) |
| 18 | company_p | 付款方单位名称 | company_p | varchar(200) |  | 字符串 (String) |
| 19 | address_p | 付款方单位地址 | address_p | varchar(200) |  | 字符串 (String) |
| 20 | bankaccount_p | 付款方银行帐号 | bankaccount_p | varchar(200) |  | 字符串 (String) |
| 21 | pk_bankname_p | 付款方开户银行标识 | pk_bankname_p | char(20) |  | 主键 (UFID) |
| 22 | bankname_p | 付款方开户银行名称 | bankname_p | varchar(200) |  | 字符串 (String) |
| 23 | origetmode | 约定收款方式 | origetmode | varchar(50) |  | 收款方式 (gatheringtype) |  | direct=直接收款; |