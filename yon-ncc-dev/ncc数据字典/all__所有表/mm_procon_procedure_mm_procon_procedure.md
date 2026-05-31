# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | cid | cid | char(20) | √ |
| 2 | bcheckpoint | bcheckpoint | bcheckpoint | char(1) |  |  | '~' |
| 3 | bmain | bmain | bmain | char(1) |
| 4 | breportpoint | breportpoint | breportpoint | char(1) |
| 5 | brework | brework | brework | char(1) |
| 6 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 7 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 8 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 9 | cnumunitid | cnumunitid | cnumunitid | varchar2(50) |
| 10 | coperheadid | coperheadid | coperheadid | varchar2(50) |
| 11 | ctimeunitid | ctimeunitid | ctimeunitid | varchar2(50) |
| 12 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 13 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 14 | foverlaptype | foverlaptype | foverlaptype | varchar2(50) |
| 15 | ftransmode | ftransmode | ftransmode | number(38, 0) |  |  | 2 |
| 16 | nbplanastnum | nbplanastnum | nbplanastnum | number(28, 8) |
| 17 | nbplannum | nbplannum | nbplannum | number(28, 8) |
| 18 | ndispatchastnum | ndispatchastnum | ndispatchastnum | number(28, 8) |
| 19 | ndispatchnum | ndispatchnum | ndispatchnum | number(28, 8) |
| 20 | nfixtime | nfixtime | nfixtime | number(28, 8) |
| 21 | ninastnum | ninastnum | ninastnum | number(28, 8) |
| 22 | ninnum | ninnum | ninnum | number(28, 8) |
| 23 | nmindeliverastnum | nmindeliverastnum | nmindeliverastnum | number(28, 8) |
| 24 | nmindelivernum | nmindelivernum | nmindelivernum | number(28, 8) |
| 25 | nratedtime | nratedtime | nratedtime | number(28, 8) |
| 26 | ntransastnum | ntransastnum | ntransastnum | number(28, 8) |
| 27 | ntransnum | ntransnum | ntransnum | number(28, 8) |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_proconsole | pk_proconsole | pk_proconsole | char(20) | √ |
| 32 | tendtime | tendtime | tendtime | char(19) |  |  | '~' |
| 33 | tsrcts | tsrcts | tsrcts | char(19) |
| 34 | tstarttime | tstarttime | tstarttime | char(19) |  |  | '~' |
| 35 | vchangerate | vchangerate | vchangerate | varchar2(50) |  |  | '~' |
| 36 | vprocedureno | vprocedureno | vprocedureno | varchar2(50) |
| 37 | vprocedurenote | vprocedurenote | vprocedurenote | varchar2(50) |
| 38 | vproceduretype | vproceduretype | vproceduretype | varchar2(20) |  |  | '~' |
| 39 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 40 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 41 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 42 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 43 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 44 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 45 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 46 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 47 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 48 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 49 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 50 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 51 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 52 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 53 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 54 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 55 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 56 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 57 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 58 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |