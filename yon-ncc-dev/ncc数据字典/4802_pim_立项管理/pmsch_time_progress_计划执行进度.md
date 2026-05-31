# |<<

**计划执行进度 (pmsch_time_progress / nc.vo.pmsch.plan.progress.TimeProgressHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress | 进度主键 | pk_progress | char(20) | √ | 主键 (UFID) |
| 2 | pk_plan | 计划主键 | pk_plan | varchar(20) |  | 进度计划 (TimePlanBillVO) |
| 3 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 6 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 7 | real_start_date | 实际开始时间 | real_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | real_end_date | 实际截止时间 | real_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 9 | fin_item_num | 完成任务数 | fin_item_num | int |  | 整数 (Integer) |
| 10 | last_record | 最近反馈时间 | last_record | char(19) |  | 日期时间 (UFDateTime) |
| 11 | last_sum | 最近更新时间 | last_sum | char(19) |  | 日期时间 (UFDateTime) |
| 12 | last_plan | 最近计划时间 | last_plan | char(19) |  | 日期时间 (UFDateTime) |
| 13 | sum_progress | 总进度 | sum_progress | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | real_duration | 实际工期 | real_duration | int |  | 整数 (Integer) |