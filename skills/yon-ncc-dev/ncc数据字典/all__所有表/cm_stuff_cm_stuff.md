# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstuffid | cstuffid | cstuffid | char(20) | √ |
| 2 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 3 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(20) |  |  | '~' |
| 4 | cdeptid | cdeptid | cdeptid | varchar2(20) |
| 5 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 6 | csourcebillid | csourcebillid | csourcebillid | char(20) |
| 7 | csrccostobjid | csrccostobjid | csrccostobjid | varchar2(20) |  |  | '~' |
| 8 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 9 | ioriginalsourcetype | ioriginalsourcetype | ioriginalsourcetype | number(38, 0) |
| 10 | isourcetype | isourcetype | isourcetype | number(38, 0) |  |  | 1 |
| 11 | pk_book | pk_book | pk_book | char(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 19 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 20 | vnote | vnote | vnote | varchar2(181) |
| 21 | vsourcebilltype | vsourcebilltype | vsourcebilltype | varchar2(50) |
| 22 | vsourcecode | vsourcecode | vsourcecode | varchar2(40) |
| 23 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 24 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 25 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 26 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 27 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 28 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 29 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 30 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 31 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 32 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 33 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 34 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 35 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 36 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 37 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 38 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 39 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 40 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 41 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 42 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 43 | creationtime | creationtime | creationtime | char(19) |
| 44 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 47 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |