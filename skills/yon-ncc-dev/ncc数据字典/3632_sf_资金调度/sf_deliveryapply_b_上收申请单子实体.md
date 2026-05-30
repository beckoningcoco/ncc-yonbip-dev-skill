# |<<

**上收申请单子实体 (sf_deliveryapply_b / nc.vo.sf.deliveryapply.DeliveryApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryapply_b | 上收申请单子实体标识 | pk_deliveryapply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 3 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 4 | bankname_r | 上收银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 5 | pk_bankacc_r | 上收银行账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 6 | bankacccode_r | 上收银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 7 | bankaccname_r | 上收银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 8 | bankname_p | 缴款单位开户银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | pk_bankacc_p | 缴款银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 10 | pk_accid | 缴款单位内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 11 | pk_planitem_p | 缴款单位计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 12 | amount | 上收金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olcrate | 本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | olcamount | 上收本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glcrate | 集团汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcrate | 全局汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | isnetpay | 网银上收 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 21 | recordstatus | 分录状态 | recordstatus | int |  | 分录状态 (DeliveryApplyRecordStatus) |  | 1=正常; |