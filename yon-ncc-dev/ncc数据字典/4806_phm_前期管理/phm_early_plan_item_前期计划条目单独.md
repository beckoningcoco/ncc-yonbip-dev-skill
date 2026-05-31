# |<<

**前期计划条目单独 (phm_early_plan_item / nc.vo.phm.plan.EarlyPlanItemExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_early_plan_item | 计划条目主键 | pk_early_plan_item | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | name | 任务名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | description | 任务描述 | description | varchar(200) |  | 字符串 (String) |
| 5 | pk_dutier | 责任人 | pk_dutier | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | plan_start_date | 计划开始日期 | plan_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | plan_end_date | 计划截至日期 | plan_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | real_start_date | 实际开始日期 | real_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | real_end_date | 实际截至日期 | real_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 10 | memo | 备注 | memo | varchar(600) |  | 字符串 (String) |
| 11 | pk_parent | 父主键 | pk_parent | varchar(50) |  | 字符串 (String) |
| 12 | innercode | 内码 | innercode | varchar(50) |  | 字符串 (String) |
| 13 | status | 任务状态 | status | int |  | 前期任务执行状态 (ExecuteStatus) |  | 1=已完成; |