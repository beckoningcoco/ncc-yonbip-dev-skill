# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12588.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bttest | pk_bttest | pk_bttest | char(20) | √ |
| 2 | code_srv | code_srv | code_srv | varchar2(50) |
| 3 | dt_blood_abo | dt_blood_abo | dt_blood_abo | varchar2(50) |
| 4 | dt_blood_rh | dt_blood_rh | dt_blood_rh | varchar2(50) |
| 5 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 6 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(300) |
| 7 | name_psn_cross | name_psn_cross | name_psn_cross | varchar2(300) |
| 8 | note | note | note | varchar2(256) |
| 9 | pk_blood_abo | pk_blood_abo | pk_blood_abo | varchar2(20) |  |  | '~' |
| 10 | pk_blood_rh | pk_blood_rh | pk_blood_rh | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 14 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 15 | pk_psn_cross | pk_psn_cross | pk_psn_cross | varchar2(20) |  |  | '~' |
| 16 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 17 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 18 | result_abo | result_abo | result_abo | number(38, 0) |
| 19 | result_anti | result_anti | result_anti | varchar2(256) |
| 20 | result_cross | result_cross | result_cross | varchar2(256) |
| 21 | result_otexam | result_otexam | result_otexam | varchar2(256) |
| 22 | result_rh | result_rh | result_rh | varchar2(50) |
| 23 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |