# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schap | pk_schap | pk_schap | char(20) | √ |
| 2 | applyno | applyno | applyno | varchar2(50) |
| 3 | apply_status | apply_status | apply_status | number(38, 0) |
| 4 | birthdate | birthdate | birthdate | char(19) |
| 5 | date_appt_begin | date_appt_begin | date_appt_begin | char(19) |
| 6 | date_appt_end | date_appt_end | date_appt_end | char(19) |
| 7 | date_canc | date_canc | date_canc | char(19) |
| 8 | date_entry | date_entry | date_entry | char(19) |
| 9 | flag_canc | flag_canc | flag_canc | char(1) |
| 10 | mobile | mobile | mobile | varchar2(50) |
| 11 | note_canc | note_canc | note_canc | varchar2(256) |
| 12 | patiname | patiname | patiname | varchar2(50) |
| 13 | patisex | patisex | patisex | varchar2(20) |  |  | '~' |
| 14 | pk_dateslot | pk_dateslot | pk_dateslot | varchar2(20) |  |  | '~' |
| 15 | pk_dept_phy | pk_dept_phy | pk_dept_phy | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 20 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 21 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 22 | pk_res | pk_res | pk_res | varchar2(20) |  |  | '~' |
| 23 | pk_schappt | pk_schappt | pk_schappt | varchar2(20) |  |  | '~' |
| 24 | pk_schcate | pk_schcate | pk_schcate | varchar2(20) |  |  | '~' |
| 25 | pk_schsrv | pk_schsrv | pk_schsrv | varchar2(20) |  |  | '~' |
| 26 | priority | priority | priority | number(38, 0) |
| 27 | def1 | def1 | def1 | varchar2(101) |
| 28 | def2 | def2 | def2 | varchar2(101) |
| 29 | def3 | def3 | def3 | varchar2(101) |
| 30 | def4 | def4 | def4 | varchar2(101) |
| 31 | def5 | def5 | def5 | varchar2(101) |
| 32 | def6 | def6 | def6 | varchar2(101) |
| 33 | def7 | def7 | def7 | varchar2(101) |
| 34 | def8 | def8 | def8 | varchar2(101) |
| 35 | def9 | def9 | def9 | varchar2(101) |
| 36 | def10 | def10 | def10 | varchar2(101) |
| 37 | def11 | def11 | def11 | varchar2(101) |
| 38 | def12 | def12 | def12 | varchar2(101) |
| 39 | def13 | def13 | def13 | varchar2(101) |
| 40 | def14 | def14 | def14 | varchar2(101) |
| 41 | def15 | def15 | def15 | varchar2(101) |
| 42 | def16 | def16 | def16 | varchar2(101) |
| 43 | def17 | def17 | def17 | varchar2(101) |
| 44 | def18 | def18 | def18 | varchar2(101) |
| 45 | def19 | def19 | def19 | varchar2(101) |
| 46 | def20 | def20 | def20 | varchar2(101) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |