# |<<

**支付信息变更单 (fts_payinfochange / nc.vo.fts.payinfochange.PayInfoChangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payinfochange | 支付信息变更单标识 | pk_payinfochange | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_payment | 委托付款书标识 | pk_payment | varchar(20) |  | 主键 (UFID) |
| 5 | pk_paymentfund | 委托付款书资金明细标识 | pk_paymentfund | varchar(20) |  | 主键 (UFID) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 办理资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 8 | pk_org_v | 办理资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | vbillno | 单据号 | vbillno | varchar(40) |  | 字符串 (String) |
| 11 | billstatus | 单据状态 | billstatus | int |  | 支付信息变更单单据状态 (BillStatus) |  | 0=待审批; |