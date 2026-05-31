# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvque | pk_pvque | pk_pvque | char(20) | √ |
| 2 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 3 | cretiontime | cretiontime | cretiontime | char(19) |
| 4 | date_acpt | date_acpt | date_acpt | char(19) |
| 5 | date_al | date_al | date_al | char(19) |
| 6 | date_in | date_in | date_in | char(19) |
| 7 | date_out | date_out | date_out | char(19) |
| 8 | date_pv | date_pv | date_pv | char(19) |
| 9 | date_sign | date_sign | date_sign | char(19) |
| 10 | dt_pvcontilev | dt_pvcontilev | dt_pvcontilev | varchar2(50) |
| 11 | eu_pvquetype | eu_pvquetype | eu_pvquetype | varchar2(50) |
| 12 | eu_source | eu_source | eu_source | varchar2(50) |
| 13 | eu_status | eu_status | eu_status | varchar2(50) |
| 14 | eu_status_acpt | eu_status_acpt | eu_status_acpt | varchar2(50) |
| 15 | eu_status_que | eu_status_que | eu_status_que | varchar2(50) |
| 16 | eu_type | eu_type | eu_type | varchar2(50) |
| 17 | flag_active | flag_active | flag_active | char(1) |
| 18 | flag_canc | flag_canc | flag_canc | varchar2(50) |
| 19 | flag_exp | flag_exp | flag_exp | char(1) |
| 20 | name_psn_acpt | name_psn_acpt | name_psn_acpt | varchar2(50) |
| 21 | name_psn_al | name_psn_al | name_psn_al | varchar2(50) |
| 22 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 23 | name_psn_sign | name_psn_sign | name_psn_sign | char(19) |
| 24 | patiname | patiname | patiname | varchar2(50) |
| 25 | pk_dateslot | pk_dateslot | pk_dateslot | varchar2(20) |  |  | '~' |
| 26 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 31 | pk_paticate | pk_paticate | pk_paticate | varchar2(20) |  |  | '~' |
| 32 | pk_psn_acpt | pk_psn_acpt | pk_psn_acpt | varchar2(20) |  |  | '~' |
| 33 | pk_psn_al | pk_psn_al | pk_psn_al | varchar2(20) |
| 34 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |
| 35 | pk_psn_sign | pk_psn_sign | pk_psn_sign | varchar2(20) |
| 36 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 37 | pk_pvcontilev | pk_pvcontilev | pk_pvcontilev | varchar2(20) |  |  | '~' |
| 38 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 39 | pk_que | pk_que | pk_que | varchar2(50) |
| 40 | pk_quesite | pk_quesite | pk_quesite | varchar2(20) |  |  | '~' |
| 41 | pk_res | pk_res | pk_res | varchar2(20) |
| 42 | sortno | sortno | sortno | number(38, 0) |
| 43 | ticketno | ticketno | ticketno | number(38, 0) |
| 44 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 47 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |