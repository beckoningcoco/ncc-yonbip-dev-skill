# |<<

**业务对账结果 (po_compareresult / nccloud.vo.pu.comparebill.entity.CompareResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4592.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compareresult | 业务对账结果 | pk_compareresult | char(20) | √ | 主键 (UFID) |
| 2 | srcid | 来源单据主键 | srcid | varchar(50) |  | 字符串 (String) |
| 3 | srcbillcode | 来源单据号 | srcbillcode | varchar(50) |  | 字符串 (String) |
| 4 | srcbid | 来源单据行主键 | srcbid | varchar(50) |  | 字符串 (String) |
| 5 | srcrowno | 来源单据行号 | srcrowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | ninvoicenum | 本次开票数量 | ninvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | dinvoicedate | 开票日期 | dinvoicedate | char(19) |  | 日期 (UFDate) |
| 9 | ncollectnum | 本次开票对应收票主数量 | ncollectnum | decimal(28, 8) |  | 数值 (UFDouble) |