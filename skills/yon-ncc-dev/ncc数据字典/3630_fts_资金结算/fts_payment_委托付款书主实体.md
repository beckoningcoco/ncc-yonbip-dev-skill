# |<<

**委托付款书主实体 (fts_payment / nc.vo.fts.commissionpayment.PaymentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | 委托付款书主实体标识 | pk_payment | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 委托付款书号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型编码 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属资金组织 | pk_org | char(20) | √ | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_org_v | 所属资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | pk_fundpayorg | 付款资金组织 | pk_fundpayorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 8 | pk_fundpayorg_v | 付款资金组织版本 | pk_fundpayorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 9 | pk_transactorg | 办理资金组织 | pk_transactorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 10 | pk_transactorg_v | 办理资金组织版本 | pk_transactorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 11 | pk_gaincenter | 利润中心 | pk_gaincenter | varchar(20) |  | 利润中心 (profitcenter) |
| 12 | billstatus | 单据状态 | billstatus | int |  | 委托付款单据状态 (billstatus) |  | 0=待提交; |