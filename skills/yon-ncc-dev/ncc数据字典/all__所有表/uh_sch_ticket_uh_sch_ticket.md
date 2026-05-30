# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schticket | pk_schticket | pk_schticket | char(20) | √ |
| 2 | flag_appt | flag_appt | flag_appt | char(1) |
| 3 | flag_stop | flag_stop | flag_stop | char(1) |  |  | 'N' |
| 4 | flag_used | flag_used | flag_used | char(1) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_sch | pk_sch | pk_sch | varchar2(20) |  |  | '~' |
| 8 | ticketno | ticketno | ticketno | number(38, 0) |
| 9 | time_begin | time_begin | time_begin | varchar2(50) |
| 10 | time_end | time_end | time_end | varchar2(50) |
| 11 | def1 | def1 | def1 | varchar2(101) |
| 12 | def2 | def2 | def2 | varchar2(101) |
| 13 | def3 | def3 | def3 | varchar2(101) |
| 14 | def4 | def4 | def4 | varchar2(101) |
| 15 | def5 | def5 | def5 | varchar2(101) |
| 16 | def6 | def6 | def6 | varchar2(101) |
| 17 | def7 | def7 | def7 | varchar2(101) |
| 18 | def8 | def8 | def8 | varchar2(101) |
| 19 | def9 | def9 | def9 | varchar2(101) |
| 20 | def10 | def10 | def10 | varchar2(101) |
| 21 | def11 | def11 | def11 | varchar2(101) |
| 22 | def12 | def12 | def12 | varchar2(101) |
| 23 | def13 | def13 | def13 | varchar2(101) |
| 24 | def14 | def14 | def14 | varchar2(101) |
| 25 | def15 | def15 | def15 | varchar2(101) |
| 26 | def16 | def16 | def16 | varchar2(101) |
| 27 | def17 | def17 | def17 | varchar2(101) |
| 28 | def18 | def18 | def18 | varchar2(101) |
| 29 | def19 | def19 | def19 | varchar2(101) |
| 30 | def20 | def20 | def20 | varchar2(101) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |