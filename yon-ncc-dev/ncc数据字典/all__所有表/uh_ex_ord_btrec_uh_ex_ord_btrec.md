# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btrec | pk_btrec | pk_btrec | char(20) | √ |
| 2 | btcont | btcont | btcont | varchar2(50) |
| 3 | code_srv | code_srv | code_srv | varchar2(50) |
| 4 | date_bt | date_bt | date_bt | char(19) |
| 5 | desc_btreact | desc_btreact | desc_btreact | varchar2(4000) |
| 6 | dt_blood_abo | dt_blood_abo | dt_blood_abo | varchar2(50) |
| 7 | dt_blood_rh | dt_blood_rh | dt_blood_rh | varchar2(50) |
| 8 | dt_btreact | dt_btreact | dt_btreact | varchar2(50) |
| 9 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 10 | flag_btreact | flag_btreact | flag_btreact | char(1) |
| 11 | name_psn_bbget | name_psn_bbget | name_psn_bbget | varchar2(300) |
| 12 | name_psn_bt | name_psn_bt | name_psn_bt | varchar2(300) |
| 13 | note | note | note | varchar2(256) |
| 14 | pk_blood_abo | pk_blood_abo | pk_blood_abo | varchar2(20) |  |  | '~' |
| 15 | pk_blood_rh | pk_blood_rh | pk_blood_rh | varchar2(20) |  |  | '~' |
| 16 | pk_btreact | pk_btreact | pk_btreact | varchar2(20) |  |  | '~' |
| 17 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 21 | pk_psn_bbget | pk_psn_bbget | pk_psn_bbget | varchar2(20) |  |  | '~' |
| 22 | pk_psn_bt | pk_psn_bt | pk_psn_bt | varchar2(20) |  |  | '~' |
| 23 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 24 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 25 | quan_bt | quan_bt | quan_bt | number(14, 2) |
| 26 | unit_bt | unit_bt | unit_bt | varchar2(50) |  |  | '~' |
| 27 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |