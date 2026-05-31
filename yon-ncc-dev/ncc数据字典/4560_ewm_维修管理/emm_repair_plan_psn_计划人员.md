# |<<

**计划人员 (emm_repair_plan_psn / nc.vo.emm.repairplan.RepairPlanPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_psn | 计划人员标识 | pk_repair_plan_psn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | pk_job_type | 工种 | pk_job_type | varchar(20) |  | 工种 (craft) |
| 8 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | person_num | 人员数量 | person_num | int |  | 整数 (Integer) |
| 10 | man_hours | 标准工时（小时） | man_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | rate | 标准费率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | money | 标准成本 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |