# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mps | pk_mps | pk_mps | varchar2(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 4 | confirmer | confirmer | confirmer | varchar2(20) |  |  | '~' |
| 5 | confirmtime | confirmtime | confirmtime | varchar2(19) |
| 6 | dbilldate | dbilldate | dbilldate | varchar2(19) |
| 7 | dplandate | dplandate | dplandate | char(19) |
| 8 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 9 | nofficialver | nofficialver | nofficialver | number(28, 8) |
| 10 | nsimver | nsimver | nsimver | number(28, 8) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_source_mps | pk_source_mps | pk_source_mps | varchar2(20) |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 19 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 20 | versiontype | versiontype | versiontype | number(38, 0) |
| 21 | vnote | vnote | vnote | varchar2(181) |
| 22 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 23 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 24 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 25 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 26 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 27 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 28 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 29 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 30 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 31 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 32 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 33 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 34 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 35 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 36 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 37 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 38 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 39 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 40 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 41 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |