# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchcode | pk_batchcode | pk_batchcode | char(20) | √ |
| 2 | binqc | binqc | binqc | char(1) |
| 3 | bseal | bseal | bseal | char(1) |
| 4 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |
| 5 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 6 | cqualitylevelid | cqualitylevelid | cqualitylevelid | varchar2(20) |  |  | '~' |
| 7 | csourcebid | csourcebid | csourcebid | varchar2(20) |
| 8 | csourcehid | csourcehid | csourcehid | varchar2(20) |
| 9 | csourcetype | csourcetype | csourcetype | varchar2(10) |
| 10 | dinbounddate | dinbounddate | dinbounddate | char(19) |
| 11 | dproducedate | dproducedate | dproducedate | char(19) |
| 12 | dvalidate | dvalidate | dvalidate | char(19) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | tbatchtime | tbatchtime | tbatchtime | char(19) |
| 15 | tchecktime | tchecktime | tchecktime | char(19) |
| 16 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 17 | version | version | version | number(38, 0) |
| 18 | vhashcode | vhashcode | vhashcode | varchar2(100) | √ |
| 19 | vnote | vnote | vnote | varchar2(200) |
| 20 | vprodbatchcode | vprodbatchcode | vprodbatchcode | varchar2(40) |
| 21 | vsourcebillcode | vsourcebillcode | vsourcebillcode | varchar2(40) |
| 22 | vsourcerowno | vsourcerowno | vsourcerowno | varchar2(20) |
| 23 | vvendbatchcode | vvendbatchcode | vvendbatchcode | varchar2(50) |
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
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |