# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closebook | pk_closebook | pk_closebook | varchar2(20) | √ |
| 2 | accyear | accyear | accyear | varchar2(10) |
| 3 | closebook_date | closebook_date | closebook_date | char(19) |
| 4 | closebook_flag | closebook_flag | closebook_flag | number(38, 0) |
| 5 | period | period | period | varchar2(10) |
| 6 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 7 | pk_closebookuser | pk_closebookuser | pk_closebookuser | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 12 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 13 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 14 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |