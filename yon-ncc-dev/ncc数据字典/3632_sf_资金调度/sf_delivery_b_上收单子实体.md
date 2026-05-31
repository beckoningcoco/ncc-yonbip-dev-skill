# |<<

**上收单子实体 (sf_delivery_b / nc.vo.sf.delivery.DeliveryBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5258.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_delivery_b | 上收单子实体标识 | pk_delivery_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 3 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 4 | pk_bankacc_r | 上收银行账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankname_r | 上收银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | pk_planitem_r | 上收组织计划项目 | pk_planitem_r | varchar(20) |  | 资金计划项目 (fundplan) |
| 7 | pk_org_p | 缴款单位 | pk_org_p | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_org_p_v | 缴款单位版本信息 | pk_org_p_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_accid | 缴款单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 10 | pk_bankacc_p | 缴款单位银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | bankname_p | 缴款单位开户银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 12 | pk_planitem_p | 缴款单位计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 13 | amount | 上收金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcrate | 本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olcamount | 上收本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | glcrate | 集团汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | glcamount | 上收集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllcrate | 全局汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | gllcamount | 上收全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | isnetpay | 是否网银上收 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | isnetbankfull | 网银补录是否完整 | isnetbankfull | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | paystatus | 支付状态 | paystatus | int |  | 支付状态 (paystatus) |  | 1=未提交; |