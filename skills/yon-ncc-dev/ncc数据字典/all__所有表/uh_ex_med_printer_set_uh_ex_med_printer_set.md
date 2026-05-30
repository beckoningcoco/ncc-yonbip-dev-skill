# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_medprinterset | pk_medprinterset | pk_medprinterset | char(20) | √ |
| 2 | call_msg | call_msg | call_msg | varchar2(200) |
| 3 | call_num | call_num | call_num | number(38, 0) |  |  | 0 |
| 4 | call_status | call_status | call_status | number(38, 0) |
| 5 | call_time | call_time | call_time | varchar2(20) |
| 6 | call_user | call_user | call_user | varchar2(20) |
| 7 | dept | dept | dept | varchar2(20) |
| 8 | dt_param | dt_param | dt_param | varchar2(50) |
| 9 | memo | memo | memo | varchar2(500) |
| 10 | name_param | name_param | name_param | varchar2(100) |
| 11 | param_type | param_type | param_type | varchar2(20) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_param | pk_param | pk_param | varchar2(20) |
| 16 | printer | printer | printer | varchar2(100) |
| 17 | printer_ip | printer_ip | printer_ip | varchar2(15) |
| 18 | repeat_msg | repeat_msg | repeat_msg | varchar2(20) |
| 19 | repeat_num | repeat_num | repeat_num | varchar2(20) |  |  | 0 |
| 20 | repeat_time | repeat_time | repeat_time | varchar2(20) |
| 21 | repeat_user | repeat_user | repeat_user | varchar2(20) |
| 22 | triage_flag | triage_flag | triage_flag | number(38, 0) |  |  | 0 |
| 23 | triage_seq | triage_seq | triage_seq | number(38, 0) |
| 24 | triage_time | triage_time | triage_time | varchar2(20) |
| 25 | triage_user | triage_user | triage_user | varchar2(20) |
| 26 | def1 | def1 | def1 | varchar2(100) |
| 27 | def2 | def2 | def2 | varchar2(100) |
| 28 | def3 | def3 | def3 | varchar2(100) |
| 29 | def4 | def4 | def4 | varchar2(100) |
| 30 | def5 | def5 | def5 | varchar2(100) |
| 31 | def6 | def6 | def6 | varchar2(100) |
| 32 | def7 | def7 | def7 | varchar2(100) |
| 33 | def8 | def8 | def8 | varchar2(100) |
| 34 | def9 | def9 | def9 | varchar2(100) |
| 35 | def10 | def10 | def10 | varchar2(100) |
| 36 | def11 | def11 | def11 | varchar2(100) |
| 37 | def12 | def12 | def12 | varchar2(100) |
| 38 | def13 | def13 | def13 | varchar2(100) |
| 39 | def14 | def14 | def14 | varchar2(100) |
| 40 | def15 | def15 | def15 | varchar2(100) |
| 41 | def16 | def16 | def16 | varchar2(100) |
| 42 | def17 | def17 | def17 | varchar2(100) |
| 43 | def18 | def18 | def18 | varchar2(100) |
| 44 | def19 | def19 | def19 | varchar2(100) |
| 45 | def20 | def20 | def20 | varchar2(100) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |