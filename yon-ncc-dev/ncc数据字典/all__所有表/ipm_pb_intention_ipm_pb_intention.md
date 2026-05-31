# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intention | pk_intention | pk_intention | char(20) | √ |
| 2 | addrdetail | addrdetail | addrdetail | varchar2(2048) |
| 3 | adminregion | adminregion | adminregion | varchar2(20) |  |  | '~' |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | bisbeltroad | bisbeltroad | bisbeltroad | char(1) |
| 7 | bisimport | bisimport | bisimport | char(1) |
| 8 | bisnewlegal | bisnewlegal | bisnewlegal | char(1) |
| 9 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 10 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 11 | cfirstid | cfirstid | cfirstid | char(20) |
| 12 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 13 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 14 | construction | construction | construction | number(38, 0) |
| 15 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 16 | csrcid | csrcid | csrcid | char(20) |
| 17 | demestic | demestic | demestic | number(38, 0) |
| 18 | dmakedate | dmakedate | dmakedate | char(19) |
| 19 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 20 | industrysector | industrysector | industrysector | varchar2(20) |  |  | '~' |
| 21 | investdetail | investdetail | investdetail | varchar2(3072) |
| 22 | investdir | investdir | investdir | number(38, 0) |
| 23 | investendrate | investendrate | investendrate | number(28, 8) |
| 24 | investrate | investrate | investrate | number(28, 8) |
| 25 | nalltotalmny | nalltotalmny | nalltotalmny | number(28, 8) |
| 26 | nalltotalthousmny | nalltotalthousmny | nalltotalthousmny | number(28, 8) |
| 27 | nbasetotalmny | nbasetotalmny | nbasetotalmny | number(28, 8) |
| 28 | nbasetotalthousmny | nbasetotalthousmny | nbasetotalthousmny | number(28, 8) |
| 29 | negative_category | negative_category | negative_category | varchar2(50) |
| 30 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 31 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 32 | ngptotalmny | ngptotalmny | ngptotalmny | number(28, 8) |
| 33 | ngptotalthousmny | ngptotalthousmny | ngptotalthousmny | number(28, 8) |
| 34 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 35 | norigtotalmny | norigtotalmny | norigtotalmny | number(28, 8) |
| 36 | norigtotalthousmny | norigtotalthousmny | norigtotalthousmny | number(28, 8) |
| 37 | pk_afterinveststage | pk_afterinveststage | pk_afterinveststage | varchar2(20) |  |  | '~' |
| 38 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 39 | pk_countryzone | pk_countryzone | pk_countryzone | varchar2(20) |  |  | '~' |
| 40 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 41 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 42 | pk_group | pk_group | pk_group | char(20) | √ |
| 43 | pk_investtype | pk_investtype | pk_investtype | varchar2(20) |  |  | '~' |
| 44 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 45 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 46 | pk_preinveststage | pk_preinveststage | pk_preinveststage | varchar2(20) |  |  | '~' |
| 47 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 48 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 49 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 50 | planenddata | planenddata | planenddata | char(19) |
| 51 | planstartdata | planstartdata | planstartdata | char(19) |
| 52 | projectdetail | projectdetail | projectdetail | varchar2(3072) |
| 53 | taudittime | taudittime | taudittime | char(19) |
| 54 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 55 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 56 | vbillname | vbillname | vbillname | varchar2(1200) |
| 57 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 58 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 59 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 60 | vhideaddress | vhideaddress | vhideaddress | varchar2(150) |
| 61 | vinvesttype | vinvesttype | vinvesttype | varchar2(50) |
| 62 | vmemo | vmemo | vmemo | varchar2(3072) |
| 63 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 64 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 65 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 66 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 67 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 68 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 69 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 70 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 71 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 72 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 73 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 74 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 75 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 76 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 77 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 78 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 79 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 80 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 81 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 82 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 83 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 84 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 85 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 86 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 87 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 88 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 89 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 90 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 91 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 92 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 93 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 94 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 95 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 96 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 97 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 98 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 99 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 100 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 101 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 102 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 103 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 104 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 105 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 106 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 107 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 108 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 109 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 110 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 111 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 112 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 113 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 114 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 115 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 116 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 117 | creationtime | creationtime | creationtime | char(19) |
| 118 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 119 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 120 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 121 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 122 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |