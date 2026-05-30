# |<<

**作业方案 (pam_std_job_task / nc.vo.am.stdjob.StdJobTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_std_job_task | 作业方案标识 | pk_std_job_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | sequence_num | 序号 | sequence_num | int |  | 整数 (Integer) |
| 5 | job_content | 作业内容 | job_content | varchar(400) |  | 字符串 (String) |
| 6 | std_need | 标准要求 | std_need | varchar(400) |  | 字符串 (String) |
| 7 | check_means | 检查方法 | check_means | varchar(400) |  | 字符串 (String) |
| 8 | normal_hours | 标准工时 | normal_hours | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |