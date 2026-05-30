# |<<

**下拨单子实体 (sf_allocate_b / nc.vo.sf.allocate.AllocateBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocate_b | 下拨单子实体标识 | pk_allocate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 3 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 4 | pk_bankacc_p | 下拨银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankname_p | 下拨银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | pk_planitem_p | 下拨组织计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 7 | pk_org_r | 收款单位 | pk_org_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_org_r_v | 收款单位版本信息 | pk_org_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_accid_r | 收款单位内部账户 | pk_accid_r | varchar(20) |  | 内部账户 (bd_accid) |
| 10 | pk_bankacc_r | 收款单位银行账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | bankacccode_r | 收款银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 12 | bankaccname_r | 收款银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 13 | bankname_r | 收款单位开户银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 14 | pk_planitem_r | 收款单位计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 15 | amount | 下拨金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcrate | 本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | olcamount | 下拨本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcrate | 集团汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 19 | glcamount | 下拨集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcrate | 全局汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 21 | gllcamount | 下拨全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | isnetpay | 网银支付 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | isnetbankfull | 网银补录完整 | isnetbankfull | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | ismergepay | 是否合并支付 | ismergepay | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | paystatus | 支付状态 | paystatus | int |  | 支付状态 (paystatus) |  | 1=未提交; |