# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7582.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactcostid | cactcostid | cactcostid | char(20) | √ |
| 2 | cactivityid | cactivityid | cactivityid | varchar2(20) |  |  | '~' |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 4 | cperiod | cperiod | cperiod | varchar2(50) |
| 5 | ioriginalsourcetype | ioriginalsourcetype | ioriginalsourcetype | number(38, 0) |
| 6 | nnum | nnum | nnum | number(20, 8) |
| 7 | pk_book | pk_book | pk_book | char(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 12 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 13 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 14 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |