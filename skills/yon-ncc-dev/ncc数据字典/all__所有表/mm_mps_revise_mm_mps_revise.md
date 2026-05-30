# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mps_revise | pk_mps_revise | pk_mps_revise | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | blatestver | blatestver | blatestver | char(1) |
| 4 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 5 | confirmer | confirmer | confirmer | varchar2(20) |  |  | '~' |
| 6 | confirmtime | confirmtime | confirmtime | varchar2(19) |
| 7 | dbilldate | dbilldate | dbilldate | varchar2(19) |
| 8 | dplandate | dplandate | dplandate | char(19) |
| 9 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_source_mps | pk_source_mps | pk_source_mps | char(20) |
| 14 | revisever | revisever | revisever | number(28, 8) |
| 15 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 16 | vnote | vnote | vnote | varchar2(181) |
| 17 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 18 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 19 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 20 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 21 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 22 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 23 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 24 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 25 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 26 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 27 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 28 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 29 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 30 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 31 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 32 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 33 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 34 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 35 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 36 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |