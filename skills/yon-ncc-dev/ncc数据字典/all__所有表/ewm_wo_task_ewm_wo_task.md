# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_task | pk_wo_task | pk_wo_task | char(20) | √ |
| 2 | actual_hours | actual_hours | actual_hours | number(28, 8) |
| 3 | actu_end_time | actu_end_time | actu_end_time | char(19) |
| 4 | actu_start_time | actu_start_time | actu_start_time | char(19) |
| 5 | check_means | check_means | check_means | varchar2(200) |
| 6 | executed_flag | executed_flag | executed_flag | char(1) |
| 7 | job_content | job_content | job_content | varchar2(200) |
| 8 | memo | memo | memo | varchar2(200) |
| 9 | normal_hours | normal_hours | normal_hours | number(28, 8) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 13 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 14 | pk_workcenter | pk_workcenter | pk_workcenter | varchar2(20) |  |  | '~' |
| 15 | plan_end_time | plan_end_time | plan_end_time | char(19) |
| 16 | plan_start_time | plan_start_time | plan_start_time | char(19) |
| 17 | rowno | rowno | rowno | varchar2(30) |
| 18 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 19 | std_need | std_need | std_need | varchar2(200) |
| 20 | def1 | def1 | def1 | varchar2(101) |
| 21 | def2 | def2 | def2 | varchar2(101) |
| 22 | def3 | def3 | def3 | varchar2(101) |
| 23 | def4 | def4 | def4 | varchar2(101) |
| 24 | def5 | def5 | def5 | varchar2(101) |
| 25 | def6 | def6 | def6 | varchar2(101) |
| 26 | def7 | def7 | def7 | varchar2(101) |
| 27 | def8 | def8 | def8 | varchar2(101) |
| 28 | def9 | def9 | def9 | varchar2(101) |
| 29 | def10 | def10 | def10 | varchar2(101) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |