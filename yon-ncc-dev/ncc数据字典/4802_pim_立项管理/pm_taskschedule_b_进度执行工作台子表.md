# |<<

**进度执行工作台子表 (pm_taskschedule_b / nc.vo.ppm.schedulefill.TaskScheduleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskschedule_b | 子表主键 | pk_taskschedule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 3 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 计划工作台 (wbshead) |
| 4 | prefinishpercent | 上期实际完成(%) | prefinishpercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | taskpercent | 本期实际完成(%) | taskpercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | actu_start_date | 实际开始日期 | actu_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | pre_start_date | 前开始日期 | pre_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | actu_finish_date | 实际完成日期 | actu_finish_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 9 | pre_finish_date | 前完成日期 | pre_finish_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 10 | last_fill_date | 上次填报日期 | last_fill_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | pk_wbsstate | 任务状态 | pk_wbsstate | int |  | 任务状态 (pmwbsstatus) |  | 1=进行中; |