# |<<

**下拨申请单子实体 (sf_allocateapply_b / nc.vo.sf.allocateapply.AllocateApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocateapply_b | 下拨申请单明细标识 | pk_allocateapply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 3 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 4 | pk_bankacc_p | 下拨银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankname_p | 下拨银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | pk_financeorg_r | 收款单位 | pk_financeorg_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_financeorg_r_v | 收款单位组织版本信息 | pk_financeorg_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_bankacc_r | 收款账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | bankacccode_r | 收款银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 10 | bankaccname_r | 收款银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 11 | pk_accid | 收款单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 12 | bankname_r | 收款单位开户银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 13 | pk_planitem_r | 收款单位计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 14 | pk_company_r | 收款客商 | pk_company_r | varchar(20) |  | 客商 (custsupplier) |
| 15 | pk_custbankacc | 收款客商银行账户 | pk_custbankacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 16 | custbankname | 收款客商开户银行 | custbankname | varchar(20) |  | 银行档案 (bankdoc) |
| 17 | isnetpay | 网银支付 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pay_type | 汇款速度 | pay_type | varchar(50) |  | 汇款速度 (pay_type) |  | 0=普通; |