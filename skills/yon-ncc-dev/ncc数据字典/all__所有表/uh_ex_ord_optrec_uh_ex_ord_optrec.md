# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optrec | pk_optrec | pk_optrec | char(20) | √ |
| 2 | amount_bl | amount_bl | amount_bl | number(14, 2) |
| 3 | amount_bt | amount_bt | amount_bt | number(14, 2) |
| 4 | amount_iv | amount_iv | amount_iv | number(14, 2) |
| 5 | code_apply | code_apply | code_apply | varchar2(50) |
| 6 | code_srv_opt | code_srv_opt | code_srv_opt | varchar2(256) |
| 7 | confirm_time | confirm_time | confirm_time | char(19) |
| 8 | date_opt_begin | date_opt_begin | date_opt_begin | char(19) |
| 9 | date_opt_end | date_opt_end | date_opt_end | char(19) |
| 10 | date_opt_exec | date_opt_exec | date_opt_exec | char(19) |
| 11 | date_opt_operate | date_opt_operate | date_opt_operate | char(19) |
| 12 | drainagepos | drainagepos | drainagepos | varchar2(256) |
| 13 | drug_after | drug_after | drug_after | varchar2(256) |
| 14 | drug_before | drug_before | drug_before | varchar2(256) |
| 15 | dt_after_diag | dt_after_diag | dt_after_diag | varchar2(255) |
| 16 | dt_anae | dt_anae | dt_anae | varchar2(100) |
| 17 | dt_asepsis | dt_asepsis | dt_asepsis | varchar2(100) |
| 18 | dt_before_diag | dt_before_diag | dt_before_diag | varchar2(255) |
| 19 | dt_heal | dt_heal | dt_heal | varchar2(100) |
| 20 | dt_incitype | dt_incitype | dt_incitype | varchar2(100) |
| 21 | dt_oplevel | dt_oplevel | dt_oplevel | varchar2(100) |
| 22 | dt_optype | dt_optype | dt_optype | varchar2(100) |
| 23 | dt_posanae | dt_posanae | dt_posanae | varchar2(100) |
| 24 | dt_psn_anes | dt_psn_anes | dt_psn_anes | varchar2(50) |
| 25 | dt_psn_circuit | dt_psn_circuit | dt_psn_circuit | varchar2(50) |
| 26 | dt_psn_confirm | dt_psn_confirm | dt_psn_confirm | varchar2(50) |
| 27 | dt_psn_firstasis | dt_psn_firstasis | dt_psn_firstasis | varchar2(50) |
| 28 | dt_psn_frthasis | dt_psn_frthasis | dt_psn_frthasis | varchar2(50) |
| 29 | dt_psn_instru | dt_psn_instru | dt_psn_instru | varchar2(50) |
| 30 | dt_psn_perf | dt_psn_perf | dt_psn_perf | varchar2(50) |
| 31 | dt_psn_secasis | dt_psn_secasis | dt_psn_secasis | varchar2(50) |
| 32 | dt_psn_thdasis | dt_psn_thdasis | dt_psn_thdasis | varchar2(50) |
| 33 | dt_psn_transf | dt_psn_transf | dt_psn_transf | varchar2(50) |
| 34 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(100) |
| 35 | flag_bt_react | flag_bt_react | flag_bt_react | char(1) |
| 36 | flag_drainage | flag_drainage | flag_drainage | char(1) |
| 37 | flag_isolate | flag_isolate | flag_isolate | char(1) |
| 38 | flag_unexpected | flag_unexpected | flag_unexpected | char(1) |
| 39 | ma_drainage | ma_drainage | ma_drainage | varchar2(256) |
| 40 | name_after_diag | name_after_diag | name_after_diag | varchar2(255) |
| 41 | name_anae | name_anae | name_anae | varchar2(100) |  |  | '~' |
| 42 | name_asepsis | name_asepsis | name_asepsis | varchar2(100) |  |  | '~' |
| 43 | name_before_diag | name_before_diag | name_before_diag | varchar2(255) |
| 44 | name_heal | name_heal | name_heal | varchar2(100) |  |  | '~' |
| 45 | name_incitype | name_incitype | name_incitype | varchar2(100) |  |  | '~' |
| 46 | name_oplevel | name_oplevel | name_oplevel | varchar2(100) |  |  | '~' |
| 47 | name_oppos | name_oppos | name_oppos | varchar2(100) |  |  | '~' |
| 48 | name_optype | name_optype | name_optype | varchar2(100) |  |  | '~' |
| 49 | name_posanae | name_posanae | name_posanae | varchar2(100) |  |  | '~' |
| 50 | name_psn_anes | name_psn_anes | name_psn_anes | varchar2(50) |
| 51 | name_psn_circuit | name_psn_circuit | name_psn_circuit | varchar2(50) |
| 52 | name_psn_confirm | name_psn_confirm | name_psn_confirm | varchar2(50) |
| 53 | name_psn_firstasis | name_psn_firstasis | name_psn_firstasis | varchar2(50) |
| 54 | name_psn_frthasis | name_psn_frthasis | name_psn_frthasis | varchar2(50) |
| 55 | name_psn_instru | name_psn_instru | name_psn_instru | varchar2(50) |
| 56 | name_psn_opt | name_psn_opt | name_psn_opt | varchar2(300) |
| 57 | name_psn_perf | name_psn_perf | name_psn_perf | varchar2(50) |
| 58 | name_psn_secasis | name_psn_secasis | name_psn_secasis | varchar2(50) |
| 59 | name_psn_thdasis | name_psn_thdasis | name_psn_thdasis | varchar2(50) |
| 60 | name_psn_transf | name_psn_transf | name_psn_transf | varchar2(50) |
| 61 | note | note | note | varchar2(256) |
| 62 | note_unexpected | note_unexpected | note_unexpected | varchar2(256) |
| 63 | num_drainage | num_drainage | num_drainage | number(14, 2) |
| 64 | optcn | optcn | optcn | number(38, 0) |
| 65 | optpos | optpos | optpos | varchar2(256) |
| 66 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 67 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 68 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 69 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 70 | pk_psn_opt | pk_psn_opt | pk_psn_opt | varchar2(20) |  |  | '~' |
| 71 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 72 | pk_srv_opt | pk_srv_opt | pk_srv_opt | varchar2(50) |  |  | '~' |
| 73 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 74 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 75 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |