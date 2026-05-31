# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_labret | pk_labret | pk_labret | char(20) | √ |
| 2 | code_srv | code_srv | code_srv | varchar2(50) |
| 3 | date_coll | date_coll | date_coll | char(19) |
| 4 | date_result | date_result | date_result | char(19) |
| 5 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 6 | eu_result | eu_result | eu_result | number(38, 0) |
| 7 | name_meas | name_meas | name_meas | varchar2(50) |
| 8 | name_srv | name_srv | name_srv | varchar2(50) |
| 9 | note | note | note | varchar2(4000) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_lisret | pk_lisret | pk_lisret | varchar2(50) |
| 12 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |  |  | '~' |
| 13 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 15 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 16 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 17 | result | result | result | number(38, 0) |
| 18 | sortno | sortno | sortno | number(38, 0) |
| 19 | stdval_max | stdval_max | stdval_max | varchar2(256) |
| 20 | stdval_min | stdval_min | stdval_min | varchar2(256) |
| 21 | unit_srv | unit_srv | unit_srv | varchar2(20) |  |  | '~' |
| 22 | val | val | val | varchar2(256) |
| 23 | val1 | val1 | val1 | varchar2(512) |
| 24 | val2 | val2 | val2 | varchar2(512) |
| 25 | val3 | val3 | val3 | varchar2(512) |
| 26 | val4 | val4 | val4 | varchar2(512) |
| 27 | val5 | val5 | val5 | varchar2(512) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |