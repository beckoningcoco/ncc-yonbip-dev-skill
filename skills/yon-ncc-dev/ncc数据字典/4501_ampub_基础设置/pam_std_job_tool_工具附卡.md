# |<<

**工具附卡 (pam_std_job_tool / nc.vo.am.stdjob.StdJobToolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_std_job_tool | 工具附卡标识 | pk_std_job_tool | char(20) | √ | 主键 (UFID) |
| 2 | pk_std_job_task | 作业序号 | pk_std_job_task | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | sequence_num | 序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | pk_tool | 工具 | pk_tool | varchar(20) |  | 工具 (tools) |
| 8 | tools_num | 工具数量 | tools_num | int |  | 整数 (Integer) |
| 9 | normal_hours | 标准工时 | normal_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | total_tool | 标准成本 | total_tool | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 12 | std_rate | 标准费率 | std_rate | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |