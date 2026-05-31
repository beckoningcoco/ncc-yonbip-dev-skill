# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9936.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpmohvid | cpmohvid | cpmohvid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvertime | approvertime | approvertime | varchar2(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | cplanfactoryid | cplanfactoryid | cplanfactoryid | varchar2(20) |  |  | '~' |
| 6 | cplanfactoryvid | cplanfactoryvid | cplanfactoryvid | varchar2(20) |  |  | '~' |
| 7 | cpmohid | cpmohid | cpmohid | char(20) | √ |
| 8 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 9 | dbilldate | dbilldate | dbilldate | char(19) |
| 10 | dmakedate | dmakedate | dmakedate | char(19) |
| 11 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |  |  | 0 |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 16 | version | version | version | varchar2(10) |
| 17 | vnote | vnote | vnote | varchar2(200) |
| 18 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |