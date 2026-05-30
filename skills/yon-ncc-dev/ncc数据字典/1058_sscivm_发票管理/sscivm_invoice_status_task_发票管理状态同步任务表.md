# |<<

**发票管理状态同步任务表 (sscivm_invoice_status_task / nc.vo.sscivm.invoice.SSCIVMInvoiceStatusTask)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5548.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | 主键 | pk_task | char(20) | √ | 主键 (UFID) |
| 2 | request_type | 状态变更种类 | request_type | varchar(50) |  | 字符串 (String) |
| 3 | request_data | 状态变更数据 | request_data | varchar(2048) |  | 字符串 (String) |
| 4 | error_no | 出错次数 | error_no | int |  | 整数 (Integer) | 0 |