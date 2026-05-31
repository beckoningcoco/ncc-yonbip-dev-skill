# |<<

**票据贴现明细 (fbm_discount_b / nc.vo.fbm.discount.DiscountBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_b | 主键 | pk_discount_b | char(20) | √ | 主键 (UFID) |
| 2 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 主键 (UFID) |
| 4 | rowno | 子表编号 | rowno | varchar(50) |  | 字符串 (String) |
| 5 | code | 数字签名 | code | varchar(1024) |  | 备注 (Memo) |
| 6 | cacode | 网络签名 | cacode | varchar(1024) |  | 备注 (Memo) |
| 7 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 8 | money | 票据金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | contractno | 交易合同编号 | contractno | varchar(100) |  | 字符串 (String) |
| 16 | acceptanceno | 承兑协议编号 | acceptanceno | varchar(100) |  | 字符串 (String) |
| 17 | invoicedate | 出票日期 | invoicedate | char(19) |  | 日期 (UFDate) |
| 18 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 19 | iscantrans | 能否转让 | iscantrans | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | discountinterest | 贴现利息 | discountinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | olcinterestmoney | 组织贴现利息本币金额 | olcinterestmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glcinterestmoney | 集团贴现利息本币金额 | glcinterestmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | gllcinterestmoney | 全局贴现利息本币金额 | gllcinterestmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | discountcharge | 贴现手续费 | discountcharge | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | olcchargemoney | 组织贴现手续费本币金额 | olcchargemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | glcchargemoney | 集团贴现手续费本币金额 | glcchargemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | gllcchargemoney | 全局贴现手续费本币金额 | gllcchargemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | discountmoney | 贴现余额 | discountmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | olcdiscountmoney | 组织贴现余额本币金额 | olcdiscountmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | glcdiscountmoney | 集团贴现余额本币金额 | glcdiscountmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | gllcdiscountmoney | 全局贴现余额本币金额 | gllcdiscountmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | onlinebankflag | 网银办理 | onlinebankflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | paymentstatus | 支付指令状态 | paymentstatus | int |  | 支付指令状态 (PaymentStatusEnum) |  | 1=交易成功; |