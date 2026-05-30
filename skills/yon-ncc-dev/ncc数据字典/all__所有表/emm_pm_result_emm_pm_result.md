# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pm_result | pk_pm_result | pk_pm_result | char(20) | √ |
| 2 | adjust_date | adjust_date | adjust_date | char(19) |
| 3 | ahead_num | ahead_num | ahead_num | number(28, 8) |
| 4 | alter_flag | alter_flag | alter_flag | char(1) |
| 5 | gen_rate | gen_rate | gen_rate | number(28, 8) |
| 6 | initial_num | initial_num | initial_num | number(28, 8) |
| 7 | next_num | next_num | next_num | number(28, 8) |
| 8 | persist_flag | persist_flag | persist_flag | char(1) |
| 9 | pk_adjuster | pk_adjuster | pk_adjuster | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |
| 11 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 12 | pk_measure_item | pk_measure_item | pk_measure_item | varchar2(20) |  |  | '~' |
| 13 | pk_measure_point | pk_measure_point | pk_measure_point | varchar2(50) |
| 14 | pk_measure_point_b | pk_measure_point_b | pk_measure_point_b | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 17 | pk_pm | pk_pm | pk_pm | char(20) | √ |
| 18 | pre_end_num | pre_end_num | pre_end_num | number(28, 8) |
| 19 | pre_start_num | pre_start_num | pre_start_num | number(28, 8) |
| 20 | rowno | rowno | rowno | varchar2(30) |
| 21 | def1 | def1 | def1 | varchar2(101) |
| 22 | def2 | def2 | def2 | varchar2(101) |
| 23 | def3 | def3 | def3 | varchar2(101) |
| 24 | def4 | def4 | def4 | varchar2(101) |
| 25 | def5 | def5 | def5 | varchar2(101) |
| 26 | def6 | def6 | def6 | varchar2(101) |
| 27 | def7 | def7 | def7 | varchar2(101) |
| 28 | def8 | def8 | def8 | varchar2(101) |
| 29 | def9 | def9 | def9 | varchar2(101) |
| 30 | def10 | def10 | def10 | varchar2(101) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |