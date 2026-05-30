# |<<

**下拨核准单子实体 (sf_allocateagree_b / nc.vo.sf.allocateagree.AllocateAgreeBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5249.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocateagree_b | 下拨核准单明细标识 | pk_allocateagree_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_srcbill | 来源单据标识 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 3 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 4 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 5 | pk_bankacc_p | 下拨银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 6 | bankname_p | 下拨银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | pk_planitem_p | 下拨组织计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 8 | pk_financeorg_r | 收款单位 | pk_financeorg_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_financeorg_r_v | 收款单位版本信息 | pk_financeorg_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_accid | 收款单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | pk_planitem_r | 收款单位计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 12 | pk_bankacc_r | 收款银行账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | bankacccode_r | 收款银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 14 | bankaccname_r | 收款银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 15 | bankname_r | 收款单位开户银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 16 | pk_company_r | 收款客商编码 | pk_company_r | varchar(20) |  | 客商 (custsupplier) |
| 17 | pk_custbankacc | 收款客商银行账户 | pk_custbankacc | varchar(20) |  | 客商银行账户子户 (custbankaccsub) |
| 18 | custbankname | 收款客商开户银行 | custbankname | varchar(20) |  | 银行档案 (bankdoc) |
| 19 | applyamount | 申请金额 | applyamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcrate | 本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 21 | applyolcamount | 申请本币金额 | applyolcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glcrate | 集团汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 23 | applyglcamount | 申请集团本币金额 | applyglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gllcrate | 全局汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 25 | applygllcamount | 申请全局本币金额 | applygllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | applyallocatedate | 建议下拨日期 | applyallocatedate | char(19) |  | 日期 (UFDate) |
| 27 | isagree | 处理意见 | isagree | int |  | 处理意见 (agreemode) |  | 0=不同意; |