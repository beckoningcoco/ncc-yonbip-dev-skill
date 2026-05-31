# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eco | pk_eco | pk_eco | char(20) | √ |
| 2 | approvecode | approvecode | approvecode | varchar2(1024) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | varchar2(19) |
| 5 | bcreateversion | bcreateversion | bcreateversion | char(1) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | capplier | capplier | capplier | varchar2(20) |  |  | '~' |
| 8 | capplydeptid | capplydeptid | capplydeptid | varchar2(20) |  |  | '~' |
| 9 | capplydeptvid | capplydeptvid | capplydeptvid | varchar2(20) |  |  | '~' |
| 10 | cchangedeptid | cchangedeptid | cchangedeptid | varchar2(20) |  |  | '~' |
| 11 | cchangedeptvid | cchangedeptvid | cchangedeptvid | varchar2(20) |  |  | '~' |
| 12 | cecrbillcode | cecrbillcode | cecrbillcode | varchar2(40) |
| 13 | dbilldate | dbilldate | dbilldate | char(19) |
| 14 | dmakedate | dmakedate | dmakedate | char(19) |
| 15 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) | √ |
| 16 | fchangeobj | fchangeobj | fchangeobj | number(38, 0) | √ |  | 0 |
| 17 | fchangereason | fchangereason | fchangereason | varchar2(20) |  |  | '~' |
| 18 | pk_applyorg | pk_applyorg | pk_applyorg | varchar2(20) |  |  | '~' |
| 19 | pk_applyorg_v | pk_applyorg_v | pk_applyorg_v | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 24 | vbilltype | vbilltype | vbilltype | varchar2(4) |  |  | '19A3' |
| 25 | vchangenote | vchangenote | vchangenote | varchar2(1024) |
| 26 | vfirstbid | vfirstbid | vfirstbid | varchar2(20) |
| 27 | vfirstcode | vfirstcode | vfirstcode | varchar2(40) |
| 28 | vfirstid | vfirstid | vfirstid | varchar2(20) |
| 29 | vfirstrowno | vfirstrowno | vfirstrowno | varchar2(20) |
| 30 | vfirsttrantypecode | vfirsttrantypecode | vfirsttrantypecode | varchar2(20) |
| 31 | vfirsttrantypeid | vfirsttrantypeid | vfirsttrantypeid | varchar2(20) |
| 32 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 33 | vnote | vnote | vnote | varchar2(181) |
| 34 | vsrcbid | vsrcbid | vsrcbid | varchar2(20) |
| 35 | vsrccode | vsrccode | vsrccode | varchar2(40) |
| 36 | vsrcid | vsrcid | vsrcid | varchar2(20) |
| 37 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(20) |
| 38 | vsrctrantypecode | vsrctrantypecode | vsrctrantypecode | varchar2(20) |
| 39 | vsrctrantypeid | vsrctrantypeid | vsrctrantypeid | varchar2(20) |
| 40 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 41 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 42 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 43 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 44 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 45 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 46 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 47 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 48 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 49 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 50 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 51 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 52 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 53 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 54 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 55 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 56 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 57 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 58 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 59 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 60 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |