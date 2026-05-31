# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_earningalloc | pk_earningalloc | pk_earningalloc | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | dallocdate | dallocdate | dallocdate | char(19) |
| 12 | dmakedate | dmakedate | dmakedate | char(19) |
| 13 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 14 | nallallallocedmny | nallallallocedmny | nallallallocedmny | number(28, 8) |
| 15 | nallallocedmny | nallallocedmny | nallallocedmny | number(28, 8) |
| 16 | nallallocmny | nallallocmny | nallallocmny | number(28, 8) |
| 17 | nbaseallallocedmny | nbaseallallocedmny | nbaseallallocedmny | number(28, 8) |
| 18 | nbaseallocedmny | nbaseallocedmny | nbaseallocedmny | number(28, 8) |
| 19 | nbaseallocmny | nbaseallocmny | nbaseallocmny | number(28, 8) |
| 20 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 21 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 22 | ngpallallocedmny | ngpallallocedmny | ngpallallocedmny | number(28, 8) |
| 23 | ngpallocedmny | ngpallocedmny | ngpallocedmny | number(28, 8) |
| 24 | ngpallocmny | ngpallocmny | ngpallocmny | number(28, 8) |
| 25 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 26 | norigallallocedmny | norigallallocedmny | norigallallocedmny | number(28, 8) |
| 27 | norigallocedmny | norigallocedmny | norigallocedmny | number(28, 8) |
| 28 | norigallocmny | norigallocmny | norigallocmny | number(28, 8) |
| 29 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 30 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 31 | pk_fundlib | pk_fundlib | pk_fundlib | varchar2(20) |  |  | '~' |
| 32 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | char(20) | √ |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 37 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 38 | taudittime | taudittime | taudittime | char(19) |
| 39 | vallocdesc | vallocdesc | vallocdesc | varchar2(2048) |
| 40 | vallocperiod | vallocperiod | vallocperiod | varchar2(300) |
| 41 | vallocperiod2 | vallocperiod2 | vallocperiod2 | varchar2(300) |
| 42 | vallocperiod3 | vallocperiod3 | vallocperiod3 | varchar2(300) |
| 43 | vallocperiod4 | vallocperiod4 | vallocperiod4 | varchar2(300) |
| 44 | vallocperiod5 | vallocperiod5 | vallocperiod5 | varchar2(300) |
| 45 | vallocperiod6 | vallocperiod6 | vallocperiod6 | varchar2(300) |
| 46 | valloctype | valloctype | valloctype | varchar2(50) |
| 47 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 48 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 49 | vbillname | vbillname | vbillname | varchar2(800) |
| 50 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 51 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 52 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 53 | vmemo | vmemo | vmemo | varchar2(2048) |
| 54 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 55 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 56 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 57 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 58 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 59 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 60 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 61 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 62 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 63 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 64 | vreserve11 | vreserve11 | vreserve11 | varchar2(50) |
| 65 | vreserve12 | vreserve12 | vreserve12 | varchar2(50) |
| 66 | vreserve13 | vreserve13 | vreserve13 | varchar2(50) |
| 67 | vreserve14 | vreserve14 | vreserve14 | varchar2(50) |
| 68 | vreserve15 | vreserve15 | vreserve15 | varchar2(50) |
| 69 | vreserve16 | vreserve16 | vreserve16 | varchar2(50) |
| 70 | vreserve17 | vreserve17 | vreserve17 | varchar2(50) |
| 71 | vreserve18 | vreserve18 | vreserve18 | varchar2(50) |
| 72 | vreserve19 | vreserve19 | vreserve19 | varchar2(50) |
| 73 | vreserve20 | vreserve20 | vreserve20 | varchar2(50) |
| 74 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 75 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 76 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 77 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 78 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 79 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 80 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 81 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 82 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 83 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 84 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 85 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 86 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 87 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 88 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 89 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 90 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 91 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 92 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 93 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 94 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 95 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 96 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 97 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 98 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 99 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 100 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 101 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 102 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 103 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 104 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 105 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 106 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 107 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 108 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 109 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 110 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 111 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 112 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 113 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 114 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 115 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 116 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 117 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 118 | creationtime | creationtime | creationtime | char(19) |
| 119 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 120 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 121 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 122 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 123 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |