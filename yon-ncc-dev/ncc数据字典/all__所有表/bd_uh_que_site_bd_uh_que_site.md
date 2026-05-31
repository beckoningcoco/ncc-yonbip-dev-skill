# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7215.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_quesite | pk_quesite | pk_quesite | char(20) | √ |
| 2 | addr_board | addr_board | addr_board | varchar2(256) |
| 3 | datetime_begin | datetime_begin | datetime_begin | char(19) |
| 4 | datetime_end | datetime_end | datetime_end | char(19) |
| 5 | eu_role | eu_role | eu_role | number(38, 0) |
| 6 | flag_pause | flag_pause | flag_pause | char(1) |
| 7 | name_quesite | name_quesite | name_quesite | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_pc | pk_pc | pk_pc | varchar2(20) |  |  | '~' |
| 11 | pk_que | pk_que | pk_que | varchar2(20) |  |  | '~' |
| 12 | quan_apply | quan_apply | quan_apply | number(38, 0) |
| 13 | rowno | rowno | rowno | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |