# |<<

**发票明细 (sscivm_invoicedetail / nc.vo.sscivm.invoice.IVMInvoiceDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5553.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicedetail | 发票明细主键 | pk_invoicedetail | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | xmmc | 货物或应税劳务、服务名称 | xmmc | varchar(512) |  | 字符串 (String) |
| 4 | ggxh | 规格型号 | ggxh | varchar(200) |  | 字符串 (String) |
| 5 | dw | 单位 | dw | varchar(256) |  | 字符串 (String) |
| 6 | jldw | 计量单位 | jldw | varchar(20) |  | 计量单位 (measdoc) |
| 7 | xmsl | 数量 | xmsl | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | xmdj | 单价 | xmdj | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | xmje | 不含税金额 | xmje | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | sl | 税率 | sl | varchar(50) |  | 字符串 (String) |
| 11 | se | 税额 | se | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | xmjshj | 价税合计 | xmjshj | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | isfee | 是否费用 | isfee | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | matchfinish | 匹配状态 | matchfinish | int |  | 发票明细匹配状态 (InvoiceMatchStatus) |  | 0=未匹配; |