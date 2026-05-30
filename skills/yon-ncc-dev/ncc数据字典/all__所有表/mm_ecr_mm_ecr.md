# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecr | pk_ecr | pk_ecr | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | capplyer | capplyer | capplyer | varchar2(20) |  |  | '~' |
| 5 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 6 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 7 | dbilldate | dbilldate | dbilldate | char(19) |
| 8 | dmakedate | dmakedate | dmakedate | char(19) |
| 9 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) | √ |
| 10 | pk_applyorg | pk_applyorg | pk_applyorg | varchar2(20) |  |  | '~' |
| 11 | pk_applyorg_v | pk_applyorg_v | pk_applyorg_v | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | taudittime | taudittime | taudittime | varchar2(19) |
| 16 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 17 | vbilltype | vbilltype | vbilltype | varchar2(50) |  |  | '19A2' |
| 18 | vnote | vnote | vnote | varchar2(181) |
| 19 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 20 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 21 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 22 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 23 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 24 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 25 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 26 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 27 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 28 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 29 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 30 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 31 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 32 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 33 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 34 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 35 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 36 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 37 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 38 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |