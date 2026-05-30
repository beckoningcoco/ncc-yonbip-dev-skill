# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihp | pk_patihp | pk_patihp | char(20) | √ |
| 2 | code_hp | code_hp | code_hp | varchar2(50) |
| 3 | date_begin | date_begin | date_begin | char(10) |
| 4 | date_end | date_end | date_end | char(10) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | eu_validmode | eu_validmode | eu_validmode | varchar2(50) |
| 7 | flag_def | flag_def | flag_def | char(1) |
| 8 | note | note | note | varchar2(256) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 13 | priority | priority | priority | number(38, 0) |
| 14 | sortno | sortno | sortno | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |