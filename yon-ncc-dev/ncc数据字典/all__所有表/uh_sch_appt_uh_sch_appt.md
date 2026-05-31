# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schappt | pk_schappt | pk_schappt | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | date_appt | date_appt | date_appt | char(19) |
| 4 | date_canc | date_canc | date_canc | char(19) |
| 5 | date_entry | date_entry | date_entry | char(19) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_canc | flag_canc | flag_canc | char(1) |
| 8 | flag_lock | flag_lock | flag_lock | char(1) |
| 9 | flag_notice_appt | flag_notice_appt | flag_notice_appt | char(1) |
| 10 | flag_notice_canc | flag_notice_canc | flag_notice_canc | char(1) |
| 11 | name | name | name | varchar2(50) |
| 12 | note_canc | note_canc | note_canc | varchar2(256) |
| 13 | pk_appttype | pk_appttype | pk_appttype | varchar2(20) |  |  | '~' |
| 14 | pk_dateslot | pk_dateslot | pk_dateslot | varchar2(20) |  |  | '~' |
| 15 | pk_dept_entry | pk_dept_entry | pk_dept_entry | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_entry | pk_org_entry | pk_org_entry | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_pati_glo | pk_pati_glo | pk_pati_glo | varchar2(50) |  |  | '~' |
| 21 | pk_pati_org | pk_pati_org | pk_pati_org | varchar2(20) |  |  | '~' |
| 22 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 23 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 24 | pk_res | pk_res | pk_res | varchar2(20) |  |  | '~' |
| 25 | pk_sch | pk_sch | pk_sch | varchar2(20) |  |  | '~' |
| 26 | pk_schcate | pk_schcate | pk_schcate | varchar2(20) |  |  | '~' |
| 27 | pk_schsrv | pk_schsrv | pk_schsrv | varchar2(50) |  |  | '~' |
| 28 | pk_ticket | pk_ticket | pk_ticket | varchar2(20) |  |  | '~' |
| 29 | ticketno | ticketno | ticketno | number(38, 0) |
| 30 | time_begin | time_begin | time_begin | char(8) |
| 31 | time_end | time_end | time_end | char(8) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | creationtime | creationtime | creationtime | char(19) |
| 53 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |