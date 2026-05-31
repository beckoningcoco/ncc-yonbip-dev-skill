# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_psn | pk_repair_plan_psn | pk_repair_plan_psn | char(20) | √ |
| 2 | man_hours | man_hours | man_hours | number(28, 8) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | money | money | money | number(28, 8) |
| 5 | person_num | person_num | person_num | number(38, 0) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_job_type | pk_job_type | pk_job_type | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 11 | pk_repair_plan_b | pk_repair_plan_b | pk_repair_plan_b | char(20) | √ |
| 12 | rate | rate | rate | number(28, 8) |
| 13 | rowno | rowno | rowno | varchar2(30) |
| 14 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |