# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_std_job_type | pk_std_job_type | pk_std_job_type | char(20) | √ |
| 2 | normal_hours | normal_hours | normal_hours | number(28, 8) |
| 3 | person_num | person_num | person_num | number(38, 0) |
| 4 | pk_craft | pk_craft | pk_craft | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 8 | pk_std_job | pk_std_job | pk_std_job | char(20) | √ |
| 9 | pk_std_job_task | pk_std_job_task | pk_std_job_task | varchar2(20) |
| 10 | rowno | rowno | rowno | varchar2(20) |
| 11 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 12 | std_rate | std_rate | std_rate | number(28, 8) |
| 13 | total_craft | total_craft | total_craft | number(28, 8) |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |