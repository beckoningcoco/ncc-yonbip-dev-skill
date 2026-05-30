# |<<

**计划执行进度条目 (pmsch_time_progress_item / nc.vo.pmsch.plan.progress.TimeProgressItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_progress_item | 进度条目主键 | pk_progress_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_plan_item | 计划条目 | pk_plan_item | varchar(20) |  | 进度计划条目 (TimePlanItemVO) |
| 3 | percentage | 当前进度 | percentage | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | real_start_date | 实际开始日期 | real_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | real_end_date | 实际截止日期 | real_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | memo | 备注 | memo | varchar(600) |  | 字符串 (String) |
| 7 | pk_last_record | 最近反馈记录 | pk_last_record | varchar(50) |  | 字符串 (String) |
| 8 | last_record_time | 最近反馈时间 | last_record_time | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_project | 项目 | pk_project | varchar(50) |  | 字符串 (String) |
| 10 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 11 | pk_org_v | 组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 12 | leaf | 叶节点 | leaf | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | real_duration | 实际工期 | real_duration | int |  | 整数 (Integer) |
| 14 | exec_mark | 任务标识 | exec_mark | int |  | 任务执行标识 (PmschExecMark) |  | 1=已超期; |