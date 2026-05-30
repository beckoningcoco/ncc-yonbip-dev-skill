# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettle | pk_apsettle | pk_apsettle | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | capcustid | capcustid | capcustid | varchar2(20) |  |  | '~' |
| 5 | ccarrierid | ccarrierid | ccarrierid | varchar2(20) |  |  | '~' |
| 6 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |
| 7 | cdelivbillhid | cdelivbillhid | cdelivbillhid | varchar2(20) |  |  | '~' |
| 8 | crouteid | crouteid | crouteid | varchar2(20) |  |  | '~' |
| 9 | csendtypeid | csendtypeid | csendtypeid | varchar2(20) |  |  | '~' |
| 10 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 11 | cvehicletypeid | cvehicletypeid | cvehicletypeid | varchar2(20) |  |  | '~' |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | ddelivdate | ddelivdate | ddelivdate | char(19) |
| 14 | dmakedate | dmakedate | dmakedate | char(19) |
| 15 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 16 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 17 | ntotalmny | ntotalmny | ntotalmny | number(28, 8) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | taudittime | taudittime | taudittime | char(19) |
| 22 | vdelivbillcode | vdelivbillcode | vdelivbillcode | varchar2(40) |
| 23 | vnote | vnote | vnote | varchar2(181) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |