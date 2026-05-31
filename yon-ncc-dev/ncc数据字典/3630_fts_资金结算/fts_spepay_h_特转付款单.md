# |<<

**特转付款单 (fts_spepay_h / nc.vo.fts.spepay.SpePayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spepay_h | 特转付款单标识 | pk_spepay_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 3 | pk_org_v | 付款资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | pk_org | 付款资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | billstatus | 单据状态 | billstatus | int |  | 特转付款单单据状态 (SpePayBillStatus) |  | 1=待经办; |