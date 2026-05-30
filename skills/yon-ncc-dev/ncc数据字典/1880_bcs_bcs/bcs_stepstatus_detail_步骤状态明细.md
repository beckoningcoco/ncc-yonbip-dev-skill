# |<<

**步骤状态明细 (bcs_stepstatus_detail / nc.vo.bcs.hbflow.BCSStepStatusDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stepstatus_detail | 明细主键 | pk_stepstatus_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 单位主键 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_step_ref | 关联步骤 | pk_step_ref | varchar(50) |  | 字符串 (String) |
| 4 | step_name | 步骤名称 | step_name | varchar(50) |  | 字符串 (String) |
| 5 | step_order | 步骤顺序 | step_order | int |  | 整数 (Integer) |
| 6 | exceptioninfo | 执行异常信息 | exceptioninfo | varchar(200) |  | 字符串 (String) |
| 7 | step_status | 步骤状态 | step_status | varchar(50) |  | 字符串 (String) |
| 8 | pk_task | 任务 | pk_task | varchar(50) |  | 字符串 (String) |
| 9 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |