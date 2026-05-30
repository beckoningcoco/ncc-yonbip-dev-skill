# |<<

**稽核问题历史记录 (sscqm_check_bill_operation / nccloud.vo.sscqm.qualityapi.vo.CheckBillOperationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | billproblemid | 单据和问题关联id | billproblemid | varchar(50) |  | 字符串 (String) |
| 3 | pk_currenttask | 共享中心当前任务 | pk_currenttask | varchar(50) |  | 字符串 (String) |
| 4 | pk_flowpath | 共享中心操作记录 | pk_flowpath | varchar(50) |  | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(400) |  | 字符串 (String) |