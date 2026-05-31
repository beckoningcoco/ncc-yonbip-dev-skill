# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9356.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exit | pk_exit | pk_exit | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | dbilldate | dbilldate | dbilldate | char(19) |
| 12 | dfounddate | dfounddate | dfounddate | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 15 | nallexitmny | nallexitmny | nallexitmny | number(28, 8) |
| 16 | nallresidualmny | nallresidualmny | nallresidualmny | number(28, 8) |
| 17 | nalltargetpaymny | nalltargetpaymny | nalltargetpaymny | number(28, 8) |
| 18 | nalltotalexitmny | nalltotalexitmny | nalltotalexitmny | number(28, 8) |
| 19 | nbaseexitmny | nbaseexitmny | nbaseexitmny | number(28, 8) |
| 20 | nbaseresidualmny | nbaseresidualmny | nbaseresidualmny | number(28, 8) |
| 21 | nbasetargetpaymny | nbasetargetpaymny | nbasetargetpaymny | number(28, 8) |
| 22 | nbasetotalexitmny | nbasetotalexitmny | nbasetotalexitmny | number(28, 8) |
| 23 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 24 | nforecastmultiple | nforecastmultiple | nforecastmultiple | number(28, 8) |
| 25 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 26 | ngpexitmny | ngpexitmny | ngpexitmny | number(28, 8) |
| 27 | ngpresidualmny | ngpresidualmny | ngpresidualmny | number(28, 8) |
| 28 | ngptargetpaymny | ngptargetpaymny | ngptargetpaymny | number(28, 8) |
| 29 | ngptotalexitmny | ngptotalexitmny | ngptotalexitmny | number(28, 8) |
| 30 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 31 | norigexitmny | norigexitmny | norigexitmny | number(28, 8) |
| 32 | norigresidualmny | norigresidualmny | norigresidualmny | number(28, 8) |
| 33 | norigtargetpaymny | norigtargetpaymny | norigtargetpaymny | number(28, 8) |
| 34 | norigtotalexitmny | norigtotalexitmny | norigtotalexitmny | number(28, 8) |
| 35 | nreturnmultiple | nreturnmultiple | nreturnmultiple | number(28, 8) |
| 36 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 37 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 38 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 39 | pk_fundlib | pk_fundlib | pk_fundlib | varchar2(20) |  |  | '~' |
| 40 | pk_fundlib_child | pk_fundlib_child | pk_fundlib_child | varchar2(20) |  |  | '~' |
| 41 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 42 | pk_group | pk_group | pk_group | char(20) | √ |
| 43 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 45 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 46 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 47 | taudittime | taudittime | taudittime | char(19) |
| 48 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 49 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 50 | vexitdeclare | vexitdeclare | vexitdeclare | varchar2(2048) |
| 51 | vexitstatus | vexitstatus | vexitstatus | varchar2(50) |
| 52 | vexittype | vexittype | vexittype | varchar2(50) |
| 53 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 54 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 55 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 56 | vfundname | vfundname | vfundname | varchar2(200) |
| 57 | vmemo | vmemo | vmemo | varchar2(2048) |
| 58 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 59 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 60 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 61 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 62 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 63 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 64 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 65 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 66 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 67 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 68 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 69 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 70 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 71 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 72 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 73 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 74 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 75 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 76 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 77 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 78 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 79 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 80 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 81 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 82 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 83 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 84 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 85 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 86 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 87 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 88 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 89 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 90 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 91 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 92 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 93 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 94 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 95 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 96 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 97 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 98 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 99 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 100 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 101 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 102 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 103 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 104 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 105 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 106 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 107 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 108 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 109 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 110 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 111 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 112 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 113 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 114 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 115 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 116 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 117 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 118 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 119 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 120 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 121 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 122 | creationtime | creationtime | creationtime | char(19) |
| 123 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 124 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 125 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 126 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 127 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |