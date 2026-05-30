# |<<

**现金缴存办理单 (fts_cashgather_h / nc.vo.fts.cashgather.CashGatherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashgather_h | 现金缴存单标识 | pk_cashgather_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 5 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | billstatus | 单据状态 | billstatus | int |  | 现金缴存单单据状态 (CashGatherBillStatus) |  | 1=待经办; |