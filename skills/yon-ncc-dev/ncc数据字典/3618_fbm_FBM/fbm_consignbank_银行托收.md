# |<<

**银行托收 (fbm_consignbank / nc.vo.fbm.consignbank.ConsignBankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_consignbank | 主键 | pk_consignbank | char(20) | √ | 主键 (UFID) |
| 2 | consignbankno | 托收单编号 | consignbankno | varchar(50) |  | 字符串 (String) |
| 3 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | initflag | 期初标识 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | autorecflag | 自动收妥 | autorecflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 7 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 8 | holdunit | 持票单位 | holdunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | holderacc | 托收银行账户 | holderacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 10 | pk_holderbank | 托收银行 | pk_holderbank | varchar(20) |  | 银行档案 (bankdoc) |
| 11 | dconsigndate | 委托日期 | dconsigndate | char(19) |  | 日期 (UFDate) |
| 12 | dcollectiondate | 款项收妥日期 | dcollectiondate | char(19) |  | 日期 (UFDate) |
| 13 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 14 | vtransactorid | 办理人 | vtransactorid | varchar(20) |  | 用户 (user) |
| 15 | dtransactdate | 办理日期 | dtransactdate | char(19) |  | 日期 (UFDate) |
| 16 | vdisablemanid | 作废人 | vdisablemanid | varchar(20) |  | 用户 (user) |
| 17 | ddisabledate | 作废日期 | ddisabledate | char(19) |  | 日期 (UFDate) |
| 18 | disablenote | 作废原因 | disablenote | varchar(200) |  | 备注 (Memo) |
| 19 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 20 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |