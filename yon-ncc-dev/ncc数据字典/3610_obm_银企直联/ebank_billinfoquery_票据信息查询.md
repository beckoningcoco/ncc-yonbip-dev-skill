# |<<

**票据信息查询 (ebank_billinfoquery / nc.vo.obm.ebankbillinfoquery.EbankBillInfoQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankbillinfoquery | 主键 | pk_ebankbillinfoquery | char(20) | √ | 主键 (UFID) |
| 2 | srcorg | 所属组织 | srcorg | varchar(20) |  | 组织 (org) |
| 3 | srcgroup | 所属集团 | srcgroup | varchar(20) |  | 组织_集团 (group) |
| 4 | ebillnum | 电票编号 | ebillnum | varchar(50) |  | 字符串 (String) |
| 5 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 6 | billmoney | 票据金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | tradedate | 交易日期 | tradedate | char(19) |  | 日期 (UFDate) |
| 8 | billstatus | 票据状态 | billstatus | varchar(50) |  | 票据状态 (enum) |  | has_bank_back=已银行领用; |