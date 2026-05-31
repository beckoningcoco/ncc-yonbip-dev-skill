# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvlis | pk_srvlis | pk_srvlis | char(20) | √ |
| 2 | dt_colltype | dt_colltype | dt_colltype | varchar2(50) |
| 3 | dt_contype | dt_contype | dt_contype | varchar2(50) |
| 4 | dt_lisgroup | dt_lisgroup | dt_lisgroup | varchar2(50) |
| 5 | dt_samptype | dt_samptype | dt_samptype | varchar2(50) |
| 6 | note | note | note | varchar2(50) |
| 7 | pk_colltype | pk_colltype | pk_colltype | varchar2(20) |  |  | '~' |
| 8 | pk_contype | pk_contype | pk_contype | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_lisgroup | pk_lisgroup | pk_lisgroup | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_samptype | pk_samptype | pk_samptype | varchar2(20) |  |  | '~' |
| 13 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 14 | std_hi | std_hi | std_hi | number(14, 2) |
| 15 | std_lo | std_lo | std_lo | number(14, 2) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |