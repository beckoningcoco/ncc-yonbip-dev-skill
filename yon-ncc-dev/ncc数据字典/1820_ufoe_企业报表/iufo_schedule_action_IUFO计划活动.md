# |<<

**IUFO计划活动 (iufo_schedule_action / nc.vo.iufo.schedule.IUfoScheduleActionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheduleaction | 主键 | pk_scheduleaction | char(20) | √ | 主键 (UFID) |
| 2 | pk_schedule | 计划 | pk_schedule | varchar(20) |  | IUFO计划 (IUFO计划) |
| 3 | pk_actiontype | 动作类型 | pk_actiontype | varchar(20) |  | 业务动作类型 (ActionType) |
| 4 | pk_action | 动作 | pk_action | char(20) |  | 主键 (UFID) |
| 5 | position | 序号 | position | int |  | 整数 (Integer) |
| 6 | pk_org | 报表组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | actionname | 动作名称 | actionname | varchar(50) |  | 字符串 (String) |