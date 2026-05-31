# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | cbillid | cbillid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 5 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 6 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 7 | cfinanceorgid | cfinanceorgid | cfinanceorgid | varchar2(20) |  |  | '~' |
| 8 | cfinanceorgvid | cfinanceorgvid | cfinanceorgvid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | cpsnid | cpsnid | cpsnid | varchar2(20) |  |  | '~' |
| 11 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | dcanceldate | dcanceldate | dcanceldate | char(19) |
| 14 | dmakedate | dmakedate | dmakedate | char(19) |
| 15 | fpfstatusflag | fpfstatusflag | fpfstatusflag | number(38, 0) |  |  | -1 |
| 16 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |  |  | 0 |
| 17 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 18 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 19 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 20 | ntotalmny | ntotalmny | ntotalmny | number(28, 8) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 25 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 26 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 27 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 28 | taudittime | taudittime | taudittime | char(19) |
| 29 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 30 | vnote | vnote | vnote | varchar2(180) |
| 31 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 32 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 33 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 34 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 35 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 36 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 37 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 38 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 39 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 40 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 41 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 42 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 43 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 44 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 45 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 46 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 47 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 48 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 49 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 50 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 51 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 52 | creationtime | creationtime | creationtime | char(19) |
| 53 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |