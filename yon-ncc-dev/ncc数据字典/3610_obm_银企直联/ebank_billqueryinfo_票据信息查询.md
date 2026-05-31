# |<<

**票据信息查询 (ebank_billqueryinfo / nc.vo.obm.ebankbillqueryinfo.EbankBillQueryInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankbillqueryinfo | 主键 | pk_ebankbillqueryinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | srcgroup | 所属集团 | srcgroup | varchar(50) |  | 字符串 (String) |
| 6 | scrorg | 所属组织 | scrorg | varchar(50) |  | 字符串 (String) |
| 7 | ebillnum | 电票编号 | ebillnum | varchar(50) |  | 字符串 (String) |
| 8 | pk_bankdoc | 银行类别 | pk_bankdoc | varchar(20) |  | 银行类别 (banktype) |
| 9 | billmoney | 票据金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | tradedate | 交易日期 | tradedate | char(19) |  | 日期 (UFDate) |
| 11 | billstatus | 票据状态 | billstatus | int |  | 票据状态 (BillStatusEnum) |  | 1=交易成功; |