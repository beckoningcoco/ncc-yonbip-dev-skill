# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmsp | pk_ordmsp | pk_ordmsp | char(20) | √ |
| 2 | code_srv | code_srv | code_srv | varchar2(50) |
| 3 | date_exec | date_exec | date_exec | char(19) |
| 4 | desc_execresult | desc_execresult | desc_execresult | varchar2(256) |
| 5 | dt_execresult | dt_execresult | dt_execresult | varchar2(50) |
| 6 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 7 | name_execresult | name_execresult | name_execresult | varchar2(50) |
| 8 | name_psn_beauty | name_psn_beauty | name_psn_beauty | varchar2(300) |
| 9 | name_psn_cure | name_psn_cure | name_psn_cure | varchar2(300) |
| 10 | name_psn_exec | name_psn_exec | name_psn_exec | varchar2(300) |
| 11 | name_psn_main | name_psn_main | name_psn_main | varchar2(300) |
| 12 | name_psn_nurse | name_psn_nurse | name_psn_nurse | varchar2(300) |
| 13 | note | note | note | varchar2(50) |
| 14 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 15 | pk_execresult | pk_execresult | pk_execresult | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 19 | pk_psn_beauty | pk_psn_beauty | pk_psn_beauty | varchar2(20) |
| 20 | pk_psn_cure | pk_psn_cure | pk_psn_cure | varchar2(20) |
| 21 | pk_psn_exec | pk_psn_exec | pk_psn_exec | varchar2(20) |  |  | '~' |
| 22 | pk_psn_main | pk_psn_main | pk_psn_main | varchar2(20) |
| 23 | pk_psn_nurse | pk_psn_nurse | pk_psn_nurse | varchar2(20) |
| 24 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 25 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 26 | quan_exec | quan_exec | quan_exec | number(14, 2) |
| 27 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |