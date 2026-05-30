# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprec | pk_oprec | pk_oprec | char(20) | √ |
| 2 | amount_bl | amount_bl | amount_bl | number(14, 2) |
| 3 | amount_bt | amount_bt | amount_bt | number(14, 2) |
| 4 | amount_iv | amount_iv | amount_iv | number(14, 2) |
| 5 | code_srv_op | code_srv_op | code_srv_op | varchar2(256) |
| 6 | date_opt_begin | date_opt_begin | date_opt_begin | char(19) |
| 7 | date_opt_end | date_opt_end | date_opt_end | char(19) |
| 8 | desc_diag_aop | desc_diag_aop | desc_diag_aop | varchar2(256) |
| 9 | desc_diag_bop | desc_diag_bop | desc_diag_bop | varchar2(256) |
| 10 | drainagepos | drainagepos | drainagepos | varchar2(256) |
| 11 | drug_after | drug_after | drug_after | varchar2(256) |
| 12 | drug_before | drug_before | drug_before | varchar2(256) |
| 13 | dt_anae | dt_anae | dt_anae | varchar2(50) |
| 14 | dt_asepsis | dt_asepsis | dt_asepsis | varchar2(50) |
| 15 | dt_heal | dt_heal | dt_heal | varchar2(50) |
| 16 | dt_incitype | dt_incitype | dt_incitype | varchar2(50) |
| 17 | dt_oplevel | dt_oplevel | dt_oplevel | varchar2(50) |
| 18 | dt_optype | dt_optype | dt_optype | varchar2(50) |
| 19 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 20 | flag_bt_react | flag_bt_react | flag_bt_react | char(19) |
| 21 | flag_drainage | flag_drainage | flag_drainage | char(19) |
| 22 | flag_isolate | flag_isolate | flag_isolate | char(19) |
| 23 | flag_unexpected | flag_unexpected | flag_unexpected | char(19) |
| 24 | ma_drainage | ma_drainage | ma_drainage | varchar2(256) |
| 25 | name_psn_op | name_psn_op | name_psn_op | varchar2(300) |
| 26 | note | note | note | varchar2(50) |
| 27 | note_unexpected | note_unexpected | note_unexpected | varchar2(50) |
| 28 | num_drainage | num_drainage | num_drainage | number(14, 2) |
| 29 | optcn | optcn | optcn | number(38, 0) |
| 30 | optpos | optpos | optpos | varchar2(256) |
| 31 | pk_anae | pk_anae | pk_anae | char(20) |  |  | '~' |
| 32 | pk_asepsis | pk_asepsis | pk_asepsis | char(20) |  |  | '~' |
| 33 | pk_diag_aop | pk_diag_aop | pk_diag_aop | char(20) |  |  | '~' |
| 34 | pk_diag_bop | pk_diag_bop | pk_diag_bop | char(20) |
| 35 | pk_emr | pk_emr | pk_emr | char(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | char(20) |  |  | '~' |
| 37 | pk_heal | pk_heal | pk_heal | char(20) |  |  | '~' |
| 38 | pk_incitype | pk_incitype | pk_incitype | char(20) |  |  | '~' |
| 39 | pk_oplevel | pk_oplevel | pk_oplevel | char(20) |  |  | '~' |
| 40 | pk_oppos | pk_oppos | pk_oppos | char(20) |  |  | '~' |
| 41 | pk_optype | pk_optype | pk_optype | char(20) |  |  | '~' |
| 42 | pk_ordmt | pk_ordmt | pk_ordmt | char(20) |  |  | '~' |
| 43 | pk_org | pk_org | pk_org | char(20) |  |  | '~' |
| 44 | pk_posanae | pk_posanae | pk_posanae | char(20) |  |  | '~' |
| 45 | pk_psn_op | pk_psn_op | pk_psn_op | char(20) |  |  | '~' |
| 46 | pk_srvtype | pk_srvtype | pk_srvtype | char(20) |  |  | '~' |
| 47 | pk_srv_op | pk_srv_op | pk_srv_op | char(20) |  |  | '~' |
| 48 | posanae | posanae | posanae | varchar2(50) |
| 49 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |