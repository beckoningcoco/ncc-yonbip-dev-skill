# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_medblacklist | pk_medblacklist | pk_medblacklist | char(20) | √ |
| 2 | blacklist_status | blacklist_status | blacklist_status | number(38, 0) |
| 3 | limit_days | limit_days | limit_days | number(38, 0) |
| 4 | limit_end_date | limit_end_date | limit_end_date | varchar2(50) |
| 5 | limit_start_date | limit_start_date | limit_start_date | varchar2(50) |
| 6 | memo | memo | memo | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_pati | pk_pati | pk_pati | varchar2(50) |
| 10 | def1 | def1 | def1 | varchar2(50) |
| 11 | def2 | def2 | def2 | varchar2(50) |
| 12 | def3 | def3 | def3 | varchar2(50) |
| 13 | def4 | def4 | def4 | varchar2(50) |
| 14 | def5 | def5 | def5 | varchar2(50) |
| 15 | def6 | def6 | def6 | varchar2(50) |
| 16 | def7 | def7 | def7 | varchar2(50) |
| 17 | def8 | def8 | def8 | varchar2(50) |
| 18 | def9 | def9 | def9 | varchar2(50) |
| 19 | def10 | def10 | def10 | varchar2(50) |
| 20 | def11 | def11 | def11 | varchar2(50) |
| 21 | def12 | def12 | def12 | varchar2(50) |
| 22 | def13 | def13 | def13 | varchar2(50) |
| 23 | def14 | def14 | def14 | varchar2(50) |
| 24 | def15 | def15 | def15 | varchar2(50) |
| 25 | def16 | def16 | def16 | varchar2(50) |
| 26 | def17 | def17 | def17 | varchar2(50) |
| 27 | def18 | def18 | def18 | varchar2(50) |
| 28 | def19 | def19 | def19 | varchar2(50) |
| 29 | def20 | def20 | def20 | varchar2(50) |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |