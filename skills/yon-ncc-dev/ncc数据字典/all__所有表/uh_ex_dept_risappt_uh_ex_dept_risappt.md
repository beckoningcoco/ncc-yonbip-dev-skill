# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_risappt | pk_risappt | pk_risappt | char(20) | √ |
| 2 | code_apply | code_apply | code_apply | varchar2(50) |
| 3 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 4 | code_srv | code_srv | code_srv | varchar2(50) |
| 5 | date_appt | date_appt | date_appt | char(19) |
| 6 | date_notice | date_notice | date_notice | char(19) |
| 7 | date_plan | date_plan | date_plan | char(19) |
| 8 | desc_ord | desc_ord | desc_ord | varchar2(256) |
| 9 | dt_restype | dt_restype | dt_restype | varchar2(50) |
| 10 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 11 | flag_appt | flag_appt | flag_appt | char(1) |
| 12 | flag_notice | flag_notice | flag_notice | char(1) |
| 13 | name_ord | name_ord | name_ord | varchar2(50) |
| 14 | name_psn_notice | name_psn_notice | name_psn_notice | varchar2(256) |
| 15 | note | note | note | varchar2(4000) |
| 16 | note_exam | note_exam | note_exam | varchar2(500) |
| 17 | pk_deptmt | pk_deptmt | pk_deptmt | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_msp | pk_msp | pk_msp | varchar2(20) |  |  | '~' |
| 20 | pk_ord | pk_ord | pk_ord | varchar2(50) |  |  | '~' |
| 21 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(50) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 23 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 24 | pk_psn_notice | pk_psn_notice | pk_psn_notice | varchar2(20) |  |  | '~' |
| 25 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 26 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 27 | pk_restype | pk_restype | pk_restype | varchar2(20) |  |  | '~' |
| 28 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 29 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 30 | ticketno | ticketno | ticketno | varchar2(50) |
| 31 | time_appt | time_appt | time_appt | char(8) |
| 32 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |