# |<<

**调拨申请子实体 (sf_fundtransferapply_b / nc.vo.sf.fundtransferapply.FundTransferApplyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5269.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransferapply_b | 调拨申请单子实体标识 | pk_fundtransferapply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 3 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 4 | pk_bankacc_p | 付款银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | bankname_p | 付款银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | pk_planitem_p | 调拨计划项目 | pk_planitem_p | varchar(20) |  | 资金计划项目 (fundplan) |
| 7 | pk_accid_p | 付款单位内部账户 | pk_accid_p | varchar(20) |  | 内部账户 (bd_accid) |
| 8 | pk_org_r | 收款单位 | pk_org_r | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_org_r_v | 收款单位版本信息 | pk_org_r_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_bankacc_r | 收款银行账户PK | pk_bankacc_r | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | bankacccode_r | 收款银行账户 | bankacccode_r | varchar(40) |  | 字符串 (String) |
| 12 | bankaccname_r | 收款银行账户户名 | bankaccname_r | varchar(200) |  | 字符串 (String) |
| 13 | bankname_r | 收款银行 | bankname_r | varchar(20) |  | 银行档案 (bankdoc) |
| 14 | amount | 申请金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olcrate | 本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | olcamount | 申请本币金额 | olcamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | glcrate | 集团汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | glcamount | 申请集团本币金额 | glcamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | gllcrate | 全局汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 20 | gllcamount | 申请全局本币金额 | gllcamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | successmoney | 调拨成功金额 | successmoney | varchar(50) |  | 字符串 (String) |
| 22 | successolcmoney | 调拨成功本币金额 | successolcmoney | varchar(50) |  | 字符串 (String) |
| 23 | successolgmoney | 调拨成功集团本币金额 | successolgmoney | varchar(50) |  | 字符串 (String) |
| 24 | successollmoney | 调拨成功全局本币金额 | successollmoney | varchar(50) |  | 字符串 (String) |
| 25 | applytransferdate | 申请调拨日期 | applytransferdate | char(19) |  | 日期 (UFDate) |
| 26 | isnetpay | 网银支付 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | paytype | 汇款速度 | paytype | varchar(50) |  | 汇款速度 (PayType) |  | 0=普通; |