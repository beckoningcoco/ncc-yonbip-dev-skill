# |<<

**日志明细 (bda_tasklog / uap.vo.bda.ap.task.entity.TaskLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog | 日志主键 | pk_tasklog | char(20) | √ | 主键 (UFID) |
| 2 | pk_stage | 任务阶段 | pk_stage | varchar(20) |  | 任务阶段 (bda_taskstage) |
| 3 | message | 消息 | message | varchar(4000) |  | 备注 (Memo) |
| 4 | loglevel | 日志级别 | loglevel | int |  | 日志级别 (LogLevel) |  | 1=提示; |