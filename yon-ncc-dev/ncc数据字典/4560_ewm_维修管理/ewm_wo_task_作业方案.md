# |<<

**作业方案 (ewm_wo_task / nc.vo.ewm.workorder.WOTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_task | 作业方案主键 | pk_wo_task | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 4 | job_content | 作业内容 | job_content | varchar(200) |  | 字符串 (String) |
| 5 | std_need | 标准要求 | std_need | varchar(200) |  | 字符串 (String) |
| 6 | check_means | 检查方法 | check_means | varchar(200) |  | 字符串 (String) |
| 7 | normal_hours | 标准工时(小时) | normal_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | plan_start_time | 计划开始时间 | plan_start_time | char(19) |  | 日期时间 (UFDateTime) |
| 9 | plan_end_time | 计划结束时间 | plan_end_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | executed_flag | 已执行 | executed_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_workcenter | 执行工作中心 | pk_workcenter | varchar(20) |  | 工作中心 (bd_wk) |
| 12 | actual_hours | 实际工时(小时) | actual_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | actu_start_time | 实际开始时间 | actu_start_time | char(19) |  | 日期时间 (UFDateTime) |
| 14 | actu_end_time | 实际结束时间 | actu_end_time | char(19) |  | 日期时间 (UFDateTime) |
| 15 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 17 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 18 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 19 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |