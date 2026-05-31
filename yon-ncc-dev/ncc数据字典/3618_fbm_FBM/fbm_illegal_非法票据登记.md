# |<<

**非法票据登记 (fbm_illegal / nc.vo.fbm.illegal.IllegalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_illegal | 主键 | pk_illegal | char(20) | √ | 主键 (UFID) |
| 2 | fbmbillno | 非法票据编号 | fbmbillno | varchar(100) |  | 字符串 (String) |
| 3 | moneyy | 票据金额 | moneyy | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 5 | invoicedate | 出票日期 | invoicedate | char(19) |  | 日期 (UFDate) |
| 6 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 7 | invoiceunit | 出票单位 | invoiceunit | varchar(100) |  | 字符串 (String) |
| 8 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 9 | note | 备注 | note | varchar(181) |  | 字符串 (String) |
| 10 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 17 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 18 | payunit | 付款单位 | payunit | varchar(100) |  | 字符串 (String) |
| 19 | receiveunit | 收款单位 | receiveunit | varchar(100) |  | 字符串 (String) |
| 20 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 22 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 23 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 24 | fromtype | 来源 | fromtype | int |  | 非法票据来源 (IllegalBilltypeEnum) |  | 1=录入; |