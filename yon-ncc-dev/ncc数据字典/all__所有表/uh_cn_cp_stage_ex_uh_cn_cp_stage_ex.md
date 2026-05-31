# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage_ex | pk_stage_ex | pk_stage_ex | varchar2(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | fact_date_begin | fact_date_begin | fact_date_begin | char(19) |
| 5 | fact_date_end | fact_date_end | fact_date_end | char(19) |
| 6 | name_stage | name_stage | name_stage | varchar2(128) |
| 7 | parent_stage | parent_stage | parent_stage | varchar2(50) |
| 8 | pk_aber | pk_aber | pk_aber | char(20) |  |  | '~' |
| 9 | pk_cp_ex | pk_cp_ex | pk_cp_ex | char(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 12 | pk_stage | pk_stage | pk_stage | char(20) |  |  | '~' |
| 13 | pk_stage_check | pk_stage_check | pk_stage_check | varchar2(50) |
| 14 | stage_flag | stage_flag | stage_flag | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |