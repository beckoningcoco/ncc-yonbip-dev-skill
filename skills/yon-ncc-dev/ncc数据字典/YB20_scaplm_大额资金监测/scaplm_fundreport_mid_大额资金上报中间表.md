# |<<

**大额资金上报中间表 (scaplm_fundreport_mid / nc.vo.scaplm.fundreportmid.FundReportMidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5096.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundreport_mid | 大额资金上报中间表主键 | pk_fundreport_mid | char(20) | √ | 主键 (UFID) |
| 2 | comcode | 上报单位编码 | comcode | varchar(50) |  | 字符串 (String) |
| 3 | comname | 上报单位名称 | comname | varchar(200) |  | 字符串 (String) |
| 4 | recordid | 上报资金唯一标识 | recordid | varchar(100) |  | 字符串 (String) |
| 5 | year | 数据年度 | year | varchar(50) |  | 字符串 (String) |
| 6 | dayidx | 数据所属日期 | dayidx | varchar(50) |  | 字符串 (String) |
| 7 | payunitname | 支付单位名称 | payunitname | varchar(200) |  | 字符串 (String) |
| 8 | receiveunitname | 对方单位名称 | receiveunitname | varchar(200) |  | 字符串 (String) |
| 9 | amountmoney | 资金金额 | amountmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | moneyuse | 资金用途 | moneyuse | varchar(50) |  | 字符串 (String) |
| 11 | moneyuseexplain | 资金用途说明 | moneyuseexplain | varchar(500) |  | 字符串 (String) |
| 12 | opertype | 操作类型 | opertype | varchar(50) |  | 大额资金监测操作类型 (ScaplmOperTypeEum) |  | 01=新增; |