# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpmohid | cpmohid | cpmohid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvertime | approvertime | approvertime | varchar2(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | cplanfactoryid | cplanfactoryid | cplanfactoryid | varchar2(20) |  |  | '~' |
| 6 | cplanfactoryvid | cplanfactoryvid | cplanfactoryvid | varchar2(20) |  |  | '~' |
| 7 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 8 | dbilldate | dbilldate | dbilldate | char(19) |
| 9 | dmakedate | dmakedate | dmakedate | char(19) |
| 10 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |  |  | 0 |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 15 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 16 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 17 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 18 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 19 | version | version | version | varchar2(10) |
| 20 | vnote | vnote | vnote | varchar2(200) |
| 21 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |