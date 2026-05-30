# |<<

**电票业务指令状态主表 (ebank_paymentstatus_h / nc.vo.obm.ebankpaymentstatus.EbankPaymentStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpaymentstatus_h | 主键 | pk_ebankpaymentstatus_h | char(20) | √ | 主键 (UFID) |
| 2 | srcgroup | 所属集团 | srcgroup | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | srcbillno | 来源单据编号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 5 | paymentserialnum | 支付指令序号 | paymentserialnum | varchar(50) |  | 字符串 (String) |
| 6 | billbusitype | 票据业务类型 | billbusitype | varchar(50) |  | 票据业务类型 (BillBusiTypeEnum) |  | 1=电票签收; |