# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7644.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cprodcostid | cprodcostid | cprodcostid | char(20) | √ |
| 2 | blastcenter | blastcenter | blastcenter | char(1) |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 4 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(20) |  |  | '~' |
| 5 | cmaincostobjid | cmaincostobjid | cmaincostobjid | varchar2(20) |  |  | '~' |
| 6 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 7 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 8 | cmeasdocid | cmeasdocid | cmeasdocid | varchar2(20) |  |  | '~' |
| 9 | cperiod | cperiod | cperiod | varchar2(50) |
| 10 | flag | flag | flag | number(38, 0) |  |  | 1 |
| 11 | ifeetype | ifeetype | ifeetype | number(38, 0) |
| 12 | nmoney | nmoney | nmoney | number(28, 8) |
| 13 | nnum | nnum | nnum | number(20, 8) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 18 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 19 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 20 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 21 | vnote | vnote | vnote | varchar2(181) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |