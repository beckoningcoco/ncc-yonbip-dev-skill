# |<<

**特转收款单 (fts_spegather_h / nc.vo.fts.spegather.SpeGatherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spegather_h | 特转收款单标识 | pk_spegather_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 3 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | pk_org | 收款资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_org_v | 收款资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | billstatus | 单据状态 | billstatus | int |  | 特转收款单单据状态 (SpeGatherBillStatus) |  | 1=待经办; |