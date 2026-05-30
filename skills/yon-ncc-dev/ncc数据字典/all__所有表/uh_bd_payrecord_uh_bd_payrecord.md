# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payrecord | pk_payrecord | pk_payrecord | char(20) | √ |
| 2 | eu_direct | eu_direct | eu_direct | varchar2(50) |
| 3 | eu_pvtype | eu_pvtype | eu_pvtype | varchar2(50) |
| 4 | eu_status | eu_status | eu_status | varchar2(50) |
| 5 | flag_inner | flag_inner | flag_inner | char(1) |
| 6 | note | note | note | varchar2(50) |
| 7 | pk_paypati | pk_paypati | pk_paypati | varchar2(50) |
| 8 | pk_paypv | pk_paypv | pk_paypv | varchar2(50) |
| 9 | receive | receive | receive | varchar2(50) |
| 10 | send | send | send | varchar2(50) |
| 11 | tradetype | tradetype | tradetype | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |