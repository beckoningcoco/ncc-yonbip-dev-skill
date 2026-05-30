# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12583.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_medorder | pk_medorder | pk_medorder | char(20) | √ |
| 2 | call_msg | call_msg | call_msg | varchar2(200) |
| 3 | call_num | call_num | call_num | number(38, 0) |  |  | 0 |
| 4 | call_status | call_status | call_status | number(38, 0) |
| 5 | call_time | call_time | call_time | varchar2(20) |
| 6 | call_user | call_user | call_user | varchar2(20) |
| 7 | flag_break_app | flag_break_app | flag_break_app | number(38, 0) |
| 8 | order_no | order_no | order_no | varchar2(50) |
| 9 | order_status | order_status | order_status | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 15 | pk_pv | pk_pv | pk_pv | varchar2(20) |
| 16 | pk_res | pk_res | pk_res | varchar2(20) |
| 17 | pk_sch | pk_sch | pk_sch | varchar2(20) |
| 18 | pk_schticket | pk_schticket | pk_schticket | varchar2(20) |
| 19 | print_num | print_num | print_num | number(38, 0) |
| 20 | repeat_msg | repeat_msg | repeat_msg | varchar2(200) |
| 21 | repeat_num | repeat_num | repeat_num | varchar2(20) |  |  | 0 |
| 22 | repeat_time | repeat_time | repeat_time | varchar2(20) |
| 23 | repeat_user | repeat_user | repeat_user | varchar2(20) |
| 24 | seq_num | seq_num | seq_num | number(38, 0) |
| 25 | triage_flag | triage_flag | triage_flag | number(38, 0) |  |  | 0 |
| 26 | triage_seq | triage_seq | triage_seq | number(38, 0) |
| 27 | triage_time | triage_time | triage_time | varchar2(20) |
| 28 | triage_user | triage_user | triage_user | varchar2(20) |
| 29 | def1 | def1 | def1 | varchar2(100) |
| 30 | def2 | def2 | def2 | varchar2(100) |
| 31 | def3 | def3 | def3 | varchar2(100) |
| 32 | def4 | def4 | def4 | varchar2(100) |
| 33 | def5 | def5 | def5 | varchar2(100) |
| 34 | def6 | def6 | def6 | varchar2(100) |
| 35 | def7 | def7 | def7 | varchar2(100) |
| 36 | def8 | def8 | def8 | varchar2(100) |
| 37 | def9 | def9 | def9 | varchar2(100) |
| 38 | def10 | def10 | def10 | varchar2(100) |
| 39 | def11 | def11 | def11 | varchar2(100) |
| 40 | def12 | def12 | def12 | varchar2(100) |
| 41 | def13 | def13 | def13 | varchar2(100) |
| 42 | def14 | def14 | def14 | varchar2(100) |
| 43 | def15 | def15 | def15 | varchar2(100) |
| 44 | def16 | def16 | def16 | varchar2(100) |
| 45 | def17 | def17 | def17 | varchar2(100) |
| 46 | def18 | def18 | def18 | varchar2(100) |
| 47 | def19 | def19 | def19 | varchar2(100) |
| 48 | def20 | def20 | def20 | varchar2(100) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |