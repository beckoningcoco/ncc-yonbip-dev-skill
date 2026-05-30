# |<<

**作业方案 (emm_repair_plan_task / nc.vo.emm.repairplan.RepairPlanTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_task | 作业方案标识 | pk_repair_plan_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 6 | job_content | 作业内容 | job_content | varchar(200) |  | 字符串 (String) |
| 7 | std_need | 标准要求 | std_need | varchar(200) |  | 字符串 (String) |
| 8 | check_means | 检查方法 | check_means | varchar(200) |  | 字符串 (String) |
| 9 | normal_hours | 标准工时（小时） | normal_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | plan_start_time | 计划开始时间 | plan_start_time | char(19) |  | 日期时间 (UFDateTime) |
| 11 | plan_end_time | 计划结束时间 | plan_end_time | char(19) |  | 日期时间 (UFDateTime) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |