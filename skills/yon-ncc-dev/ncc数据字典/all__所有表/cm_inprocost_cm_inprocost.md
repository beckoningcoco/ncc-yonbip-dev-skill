# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinprocostid | cinprocostid | cinprocostid | char(20) | √ |
| 2 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 3 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(20) |  |  | '~' |
| 4 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 5 | cmeasdocid | cmeasdocid | cmeasdocid | varchar2(20) |  |  | '~' |
| 6 | cperiod | cperiod | cperiod | varchar2(50) |
| 7 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 8 | flag | flag | flag | number(38, 0) |
| 9 | nmoney | nmoney | nmoney | number(28, 8) |
| 10 | nnum | nnum | nnum | number(28, 8) |  |  | 0 |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 15 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 16 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 17 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 18 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 19 | vnote | vnote | vnote | varchar2(181) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |