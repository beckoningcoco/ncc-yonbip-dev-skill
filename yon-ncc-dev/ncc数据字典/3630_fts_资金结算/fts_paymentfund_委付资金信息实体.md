# |<<

**委付资金信息实体 (fts_paymentfund / nc.vo.fts.commissionpayment.PayFundVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentfund | 委付资金信息实体标识 | pk_paymentfund | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 主键 (UFID) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 5 | amount | 付款金额 | amount | decimal(28, 8) | √ | 金额 (UFMoney) |
| 6 | olcrate | 本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 7 | olcamount | 本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 9 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_fundcashaccount | 支付现金账户 | pk_fundcashaccount | varchar(20) |  | 现金账户 (cashaccount) |
| 13 | pk_fundbankaccount_p | 支付银行账户标识 | pk_fundbankaccount_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 14 | pk_allotaccount | 下拨银行账户标识 | pk_allotaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 15 | pk_notetype | 票据类型 | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 16 | billno | 票据编号 | billno | varchar(50) |  | 字符串 (String) |
| 17 | pk_billno | 票据号 | pk_billno | char(20) |  | 主键 (UFID) |
| 18 | isfees | 是否费用 | isfees | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | isnetpay | 是否网银支付 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | isebankback | 是否网银回拨 | isebankback | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | isebankunback | 是否网银上收回拨 | isebankunback | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | isreserve | 是否冲销 | isreserve | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | isebankbackfull | 回拨网银补录信息是否完整 | isebankbackfull | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | isebankwritefull | 支付网银补录信息是否完整 | isebankwritefull | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isebankunbackfull | 上收回拨网银补录是否完整 | isebankunbackfull | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | paymode | 支付方式 | paymode | varchar(30) |  | 支付方式 (paymode) |  | cashpay=现金支付; |