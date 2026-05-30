# |<<

**任务审批 (iufo_taskapprove / nc.vo.iufo.task.TaskApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskapprove | 主键 | pk_taskapprove | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | varchar(32) |  | 字符串 (String) |
| 3 | pk_task | 任务主键 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | approvemode | 审批模式 | approvemode | int |  | 审批模式 (EnumApproveMode) | 0 | 0=按任务; |