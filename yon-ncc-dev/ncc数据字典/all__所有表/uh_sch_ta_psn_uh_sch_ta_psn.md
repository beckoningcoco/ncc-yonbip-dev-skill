# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tapsn | pk_tapsn | pk_tapsn | char(20) | √ |
| 2 | billno | billno | billno | varchar2(50) |
| 3 | date_chk | date_chk | date_chk | char(19) |
| 4 | date_create | date_create | date_create | char(19) |
| 5 | date_ta_begin | date_ta_begin | date_ta_begin | char(19) |
| 6 | date_ta_end | date_ta_end | date_ta_end | char(19) |
| 7 | eu_status | eu_status | eu_status | number(38, 0) |
| 8 | flag_chk | flag_chk | flag_chk | char(1) |
| 9 | note | note | note | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 13 | pk_psn_chk | pk_psn_chk | pk_psn_chk | char(20) |
| 14 | pk_psn_create | pk_psn_create | pk_psn_create | char(20) |
| 15 | pk_tadp | pk_tadp | pk_tadp | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | varchar2(50) |
| 17 | creator | creator | creator | varchar2(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | varchar2(50) |
| 20 | modifier | modifier | modifier | varchar2(50) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |