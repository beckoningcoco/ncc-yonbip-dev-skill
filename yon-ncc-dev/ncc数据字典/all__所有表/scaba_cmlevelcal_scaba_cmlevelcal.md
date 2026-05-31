# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmlevelcalid | cmlevelcalid | cmlevelcalid | varchar2(20) | √ |
| 2 | begindate | begindate | begindate | char(19) |
| 3 | calgroup | calgroup | calgroup | number(38, 0) |
| 4 | calstatus | calstatus | calstatus | number(38, 0) |  |  | 1 |
| 5 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 6 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 7 | enddate | enddate | enddate | char(19) |
| 8 | isdrive | isdrive | isdrive | char(1) |
| 9 | nlevel | nlevel | nlevel | number(38, 0) |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_co | pk_org_co | pk_org_co | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 16 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 17 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 18 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 19 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 20 | saga_status | saga_status | saga_status | number(38, 0) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |