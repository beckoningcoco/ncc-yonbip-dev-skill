# |<<

**申请单发票关联关系 (sscivm_inv_ina_relation / nc.vo.sscivm.ivsale.IVApplicationRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5540.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inv_ina_relation | 主键 | pk_inv_ina_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_ivapplication | 开票申请主键 | pk_ivapplication | varchar(20) |  | 开票申请单 (sscivm_ivapplication) |
| 3 | pk_ivappdetail | 开票申请明细主键 | pk_ivappdetail | varchar(20) |  | 开票申请明细 (sscivm_ivappdetail) |
| 4 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 5 | pk_invoicedetail | 发票明细主键 | pk_invoicedetail | varchar(20) |  | 发票明细 (sscivm_invoicedetail) |
| 6 | rowno | 发票行号 | rowno | varchar(11) |  | 字符串 (String) |
| 7 | fpqqlsh | 发票请求流水号 | fpqqlsh | varchar(50) |  | 字符串 (String) |
| 8 | xmsl | 数量 | xmsl | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | xmje | 金额 | xmje | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | xmjshj | 价税合计 | xmjshj | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | isplitmerge | 申请单拆合标志 | isplitmerge | char(1) |  | 布尔类型 (UFBoolean) |