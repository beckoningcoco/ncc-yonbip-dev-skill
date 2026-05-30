# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7646.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cproductid | cproductid | cproductid | char(20) | √ |
| 2 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 3 | clastcostcenter | clastcostcenter | clastcostcenter | varchar2(20) |  |  | '~' |
| 4 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 5 | csourcebillid | csourcebillid | csourcebillid | char(20) |
| 6 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 7 | instoragetype | instoragetype | instoragetype | number(38, 0) |
| 8 | isourcetype | isourcetype | isourcetype | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 13 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 14 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 15 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 16 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 17 | vnote | vnote | vnote | varchar2(181) |
| 18 | vsourcebilltype | vsourcebilltype | vsourcebilltype | varchar2(50) |
| 19 | vsourcecode | vsourcecode | vsourcecode | varchar2(30) |
| 20 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 21 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 22 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 23 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 24 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 25 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 26 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 27 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 28 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 29 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 30 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 31 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 32 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 33 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 34 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 35 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 36 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 37 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 38 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 39 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |