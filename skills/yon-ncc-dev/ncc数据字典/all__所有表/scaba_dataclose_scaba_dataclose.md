# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdatacloseid | cdatacloseid | cdatacloseid | char(20) | √ |
| 2 | cperiod | cperiod | cperiod | varchar2(20) | √ |  | '~' |
| 3 | iaccountstatus | iaccountstatus | iaccountstatus | number(38, 0) | √ |  | 3 |
| 4 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) | √ |  | '~' |
| 5 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | char(20) | √ |
| 7 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 8 | pk_org_co | pk_org_co | pk_org_co | varchar2(20) | √ |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 11 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 12 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 13 | saga_status | saga_status | saga_status | number(38, 0) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |