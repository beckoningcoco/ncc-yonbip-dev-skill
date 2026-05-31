# |<<

**发票关联信息 (sscivm_invoice_relation / nc.vo.sscivm.invoice.IVMInvoiceRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 关联主键 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_invoice | 发票主键 | pk_invoice | varchar(50) |  | 字符串 (String) |
| 3 | billid | 单据主键 | billid | varchar(50) |  | 字符串 (String) |
| 4 | amount | 单据金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 8 | tradetype | 交易类型 | tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | fpdm | 发票代码 | fpdm | varchar(50) |  | 字符串 (String) |
| 10 | fphm | 发票号码 | fphm | varchar(50) |  | 字符串 (String) |
| 11 | invoiceamount | 发票金额 | invoiceamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | je | 无税金额 | je | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | se | 税额 | se | decimal(28, 8) |  | 数值 (UFDouble) |