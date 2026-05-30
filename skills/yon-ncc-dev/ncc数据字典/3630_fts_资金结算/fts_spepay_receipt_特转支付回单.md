# |<<

**特转支付回单 (fts_spepay_receipt / nc.vo.fts.spepay.receipt.SpePayReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2327.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spepay_receipt_h | 特转支付单回单标识 | pk_spepay_receipt_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vbillno | 特转支付回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | vsourcebillno | 特转支付单号 | vsourcebillno | varchar(50) |  | 字符串 (String) |
| 9 | isreversebustype | 是否冲销业务 | isreversebustype | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_org_p | 付款资金组织 | pk_org_p | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 11 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 12 | billstatus | 单据状态 | billstatus | int |  | 特转付款单单据状态 (SpePayBillStatus) |  | 1=待经办; |