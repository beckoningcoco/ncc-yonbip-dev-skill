# |<<

**委收财务信息实体 (fts_gatheringfinance / nc.vo.fts.commissiongathering.GatherFinanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheringfinance | 委收财务信息实体标识 | pk_gatheringfinance | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 5 | pk_financeorg_r | 收款方财务组织 | pk_financeorg_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_financeorg_v | 收款方财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_inneraccount_r | 收款方内部账户 | pk_inneraccount_r | varchar(20) |  | 内部账户 (bd_accid) |
| 8 | pk_company_p | 付款客商标识 | pk_company_p | varchar(20) |  | 客商 (custsupplier) |
| 9 | company_p | 付款方单位名称 | company_p | varchar(200) |  | 字符串 (String) |
| 10 | address_p | 付款方单位地址 | address_p | varchar(200) |  | 字符串 (String) |
| 11 | bankaccount_p | 付款方银行帐号 | bankaccount_p | varchar(200) |  | 字符串 (String) |
| 12 | pk_bankaccount_p | 付款方银行帐号标识 | pk_bankaccount_p | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 13 | bankname_p | 付款方开户银行名称 | bankname_p | varchar(200) |  | 字符串 (String) |
| 14 | pk_bankname_p | 付款方开户银行标识 | pk_bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 15 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 16 | origetmode | 约定收款方式 | origetmode | varchar(30) |  | 收款方式 (gatheringtype) |  | direct=直接收款; |