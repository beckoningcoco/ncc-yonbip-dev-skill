# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticard | pk_paticard | pk_paticard | char(20) | √ |
| 2 | code_card | code_card | code_card | varchar2(50) |
| 3 | date_begin | date_begin | date_begin | char(19) |
| 4 | date_end | date_end | date_end | char(19) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_def | flag_def | flag_def | char(1) |
| 8 | pk_cardtype | pk_cardtype | pk_cardtype | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 12 | sortno | sortno | sortno | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |