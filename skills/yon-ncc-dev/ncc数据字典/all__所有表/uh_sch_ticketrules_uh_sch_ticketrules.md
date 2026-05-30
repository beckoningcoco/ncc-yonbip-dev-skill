# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ticketrules | pk_ticketrules | pk_ticketrules | char(20) | √ |
| 2 | dt_ticketrule | dt_ticketrule | dt_ticketrule | varchar2(20) |
| 3 | flag_stop | flag_stop | flag_stop | char(1) |  |  | 'N' |
| 4 | func | func | func | varchar2(256) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_schcate | pk_schcate | pk_schcate | varchar2(20) |
| 8 | pk_ticketrule | pk_ticketrule | pk_ticketrule | varchar2(20) |  |  | '~' |
| 9 | rulecode | rulecode | rulecode | varchar2(30) |
| 10 | rulename | rulename | rulename | varchar2(50) |
| 11 | rulename2 | rulename2 | rulename2 | varchar2(50) |
| 12 | rulename3 | rulename3 | rulename3 | varchar2(50) |
| 13 | rulename4 | rulename4 | rulename4 | varchar2(50) |
| 14 | rulename5 | rulename5 | rulename5 | varchar2(50) |
| 15 | rulename6 | rulename6 | rulename6 | varchar2(50) |
| 16 | tickets | tickets | tickets | varchar2(256) |
| 17 | ticketsend | ticketsend | ticketsend | number(38, 0) |
| 18 | ticketstart | ticketstart | ticketstart | number(38, 0) |
| 19 | def1 | def1 | def1 | varchar2(101) |
| 20 | def2 | def2 | def2 | varchar2(101) |
| 21 | def3 | def3 | def3 | varchar2(101) |
| 22 | def4 | def4 | def4 | varchar2(101) |
| 23 | def5 | def5 | def5 | varchar2(101) |
| 24 | def6 | def6 | def6 | varchar2(101) |
| 25 | def7 | def7 | def7 | varchar2(101) |
| 26 | def8 | def8 | def8 | varchar2(101) |
| 27 | def9 | def9 | def9 | varchar2(101) |
| 28 | def10 | def10 | def10 | varchar2(101) |
| 29 | def11 | def11 | def11 | varchar2(101) |
| 30 | def12 | def12 | def12 | varchar2(101) |
| 31 | def13 | def13 | def13 | varchar2(101) |
| 32 | def14 | def14 | def14 | varchar2(101) |
| 33 | def15 | def15 | def15 | varchar2(101) |
| 34 | def16 | def16 | def16 | varchar2(101) |
| 35 | def17 | def17 | def17 | varchar2(101) |
| 36 | def18 | def18 | def18 | varchar2(101) |
| 37 | def19 | def19 | def19 | varchar2(101) |
| 38 | def20 | def20 | def20 | varchar2(101) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |