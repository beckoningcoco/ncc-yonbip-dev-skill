# |<<

**发票管理后台任务日志表 (sscivm_invoice_task_log / nc.vo.sscivm.invoice.SSCIVMInvoiceTaskLog)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_log | 主键 | pk_task_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 发票任务表主键 | pk_task | char(20) |  | 主键 (UFID) |
| 3 | request_type | 状态变更种类 | request_type | varchar(50) |  | 字符串 (String) |
| 4 | request_data | 状态变更数据 | request_data | varchar(2048) |  | 字符串 (String) |
| 5 | task_result | 任务执行结果 | task_result | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | error_msg | 出错信息 | error_msg | varchar(512) |  | 字符串 (String) |