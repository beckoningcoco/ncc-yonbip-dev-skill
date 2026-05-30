# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7778.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettle_f | pk_apsettle_f | pk_apsettle_f | char(20) | √ |
| 2 | casscustid | casscustid | casscustid | varchar2(20) |  |  | '~' |
| 3 | ccosignid | ccosignid | ccosignid | varchar2(20) |  |  | '~' |
| 4 | cfeeitemid | cfeeitemid | cfeeitemid | varchar2(20) |  |  | '~' |
| 5 | creceivecustid | creceivecustid | creceivecustid | varchar2(20) |  |  | '~' |
| 6 | creceivestoreid | creceivestoreid | creceivestoreid | varchar2(20) |
| 7 | creceivestoreorgid | creceivestoreorgid | creceivestoreorgid | varchar2(20) |
| 8 | creceivestoreorgvid | creceivestoreorgvid | creceivestoreorgvid | varchar2(20) |
| 9 | crowno | crowno | crowno | varchar2(20) |
| 10 | csendstoreid | csendstoreid | csendstoreid | varchar2(20) |  |  | '~' |
| 11 | csendstoreorgid | csendstoreorgid | csendstoreorgid | varchar2(20) |  |  | '~' |
| 12 | csendstoreorgvid | csendstoreorgvid | csendstoreorgvid | varchar2(20) |  |  | '~' |
| 13 | csettlefinorgid | csettlefinorgid | csettlefinorgid | varchar2(20) |  |  | '~' |
| 14 | csettlefinorgvid | csettlefinorgvid | csettlefinorgvid | varchar2(20) |  |  | '~' |
| 15 | ctakefeeid | ctakefeeid | ctakefeeid | varchar2(20) |  |  | '~' |
| 16 | dbilldate | dbilldate | dbilldate | char(19) |
| 17 | nfeemny | nfeemny | nfeemny | number(28, 8) |
| 18 | ntotalverifymny | ntotalverifymny | ntotalverifymny | number(28, 8) |
| 19 | pk_apsettle | pk_apsettle | pk_apsettle | char(20) | √ |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 23 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 24 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 25 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 26 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 27 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 28 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 29 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 30 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 31 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 32 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 33 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 34 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 35 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 36 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 37 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 38 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 39 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 40 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 41 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |