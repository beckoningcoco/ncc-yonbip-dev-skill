# |<<

**票据台帐 (fbm_counterbook / nc.vo.fbm.report.counterbook.CounterBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 4 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 5 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 6 | money | 票据金额 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | invoicedate | 出票日期 | invoicedate | char(19) |  | 日期 (UFDate) |
| 8 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 9 | registerstatus | 票据状态 | registerstatus | varchar(50) |  | 票据状态 (RegisterStatusEnum) |  | on_gather=在收票; |