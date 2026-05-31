# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_task | pk_repair_plan_task | pk_repair_plan_task | char(20) | √ |
| 2 | check_means | check_means | check_means | varchar2(200) |
| 3 | job_content | job_content | job_content | varchar2(200) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | normal_hours | normal_hours | normal_hours | number(28, 8) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_repair_plan_b | pk_repair_plan_b | pk_repair_plan_b | char(20) | √ |
| 10 | plan_end_time | plan_end_time | plan_end_time | char(19) |
| 11 | plan_start_time | plan_start_time | plan_start_time | char(19) |
| 12 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 13 | std_need | std_need | std_need | varchar2(200) |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | def6 | def6 | def6 | varchar2(101) |
| 20 | def7 | def7 | def7 | varchar2(101) |
| 21 | def8 | def8 | def8 | varchar2(101) |
| 22 | def9 | def9 | def9 | varchar2(101) |
| 23 | def10 | def10 | def10 | varchar2(101) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |