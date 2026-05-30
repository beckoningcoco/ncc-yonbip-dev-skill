# |<<

**进度条目 (phm_plan_progress_item / nc.vo.phm.plan.progress.PlanProgressItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress_item | 条目主键 | pk_progress_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_plan_item | 计划条目 | pk_plan_item | varchar(20) |  | 前期计划条目 (EarlyPlanItem) |
| 3 | real_start_date | 实际开始日期 | real_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 4 | real_end_date | 实际截至日期 | real_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 5 | memo | 备注 | memo | varchar(600) |  | 字符串 (String) |
| 6 | item_status | 任务状态 | item_status | int |  | 前期任务执行状态 (ExecuteStatus) |  | 1=已完成; |