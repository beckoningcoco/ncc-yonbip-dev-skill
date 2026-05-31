# |<<

**计划其他费用 (emm_repair_plan_exes / nc.vo.emm.repairplan.RepairPlanExesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_exes | 计划其他费用标识 | pk_repair_plan_exes | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | exestype | 费用类型 | exestype | varchar(50) |  | 字符串 (String) |
| 8 | pk_inoutbusiclass | 收支项目 | pk_inoutbusiclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 9 | exesmoney | 计划费用 | exesmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |