# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep | pk_oprep | pk_oprep | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 5 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 6 | cshiftid | cshiftid | cshiftid | varchar2(20) |  |  | '~' |
| 7 | cteamid | cteamid | cteamid | varchar2(20) |  |  | '~' |
| 8 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 9 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 10 | dbilldate | dbilldate | dbilldate | char(19) |
| 11 | dmakedate | dmakedate | dmakedate | char(19) |
| 12 | fprodmode | fprodmode | fprodmode | number(38, 0) |
| 13 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |  |  | 1 |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 18 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 19 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 20 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 21 | taudittime | taudittime | taudittime | varchar2(19) |
| 22 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 23 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 24 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 25 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 26 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 27 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 28 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 29 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 30 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 31 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 32 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 33 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 34 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 35 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 36 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 37 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 38 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 39 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 40 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 41 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 42 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 43 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 44 | creationtime | creationtime | creationtime | char(19) |
| 45 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 48 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |