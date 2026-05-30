# |<<

**进度 (phm_plan_progress / nc.vo.phm.plan.progress.PlanProgressVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress | 进度主键 | pk_progress | char(20) | √ | 主键 (UFID) |
| 2 | pk_plan | 计划主键 | pk_plan | varchar(20) |  | 前期计划 (EarlyPlan) |
| 3 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 4 | pk_project_reg | 项目登记 | pk_project_reg | varchar(20) |  | 项目登记 (pm_projectregister) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 7 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 8 | real_start_date | 实际开始时间 | real_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | real_end_date | 实际截至时间 | real_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 10 | fin_item_num | 完成任务数 | fin_item_num | int |  | 整数 (Integer) |
| 11 | last_record | 最近反馈时间 | last_record | char(19) |  | 日期时间 (UFDateTime) |
| 12 | last_sum | 最近更新时间 | last_sum | char(19) |  | 日期时间 (UFDateTime) |
| 13 | last_plan | 最近计划时间 | last_plan | char(19) |  | 日期时间 (UFDateTime) |
| 14 | exec_status | 进行状态 | exec_status | int |  | 前期任务执行状态 (ExecuteStatus) |  | 1=已完成; |