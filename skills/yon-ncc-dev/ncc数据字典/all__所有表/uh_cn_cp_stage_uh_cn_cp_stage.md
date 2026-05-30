# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage | pk_stage | pk_stage | char(20) | √ |
| 2 | flag_day_oper | flag_day_oper | flag_day_oper | number(38, 0) |
| 3 | max_in_day_no | max_in_day_no | max_in_day_no | number(38, 0) |
| 4 | min_in_day_no | min_in_day_no | min_in_day_no | number(38, 0) |
| 5 | name_stage | name_stage | name_stage | varchar2(128) |
| 6 | parent_stage | parent_stage | parent_stage | varchar2(20) |
| 7 | pk_cp | pk_cp | pk_cp | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) | √ |
| 10 | stage_sn | stage_sn | stage_sn | varchar2(20) |
| 11 | suger_max_day_no | suger_max_day_no | suger_max_day_no | number(38, 0) |
| 12 | suger_min_day_no | suger_min_day_no | suger_min_day_no | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |