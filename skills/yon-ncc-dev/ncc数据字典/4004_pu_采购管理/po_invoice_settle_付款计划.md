# |<<

**付款计划 (po_invoice_settle / nc.vo.pu.m25.entity.InvoiceSettleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_settle | 付款计划 | pk_invoice_settle | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_apfinanceorg_v | 财务组织 | pk_apfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_apfinanceorg | 财务组织最新版本 | pk_apfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | vpaydate | 付款期 | vpaydate | varchar(20) |  | 字符串 (String) |
| 6 | npayrate | 付款比例 | npayrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | bpreflag | 预付款 | bpreflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | csettletype | 结算方式 | csettletype | varchar(20) |  | 结算方式 (balatype) |
| 9 | cincomeperiod | 起效日期 | cincomeperiod | varchar(20) |  | 付款时点 (payperiod) |
| 10 | feffectdatebill | 起效日期对应单据 | feffectdatebill | int |  | 起效日期对应单据 (effectdatebill) |  | 0=进口合同; |