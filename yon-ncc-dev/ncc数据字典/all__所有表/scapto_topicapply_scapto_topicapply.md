# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11381.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicapply | pk_topicapply | pk_topicapply | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bisneedassist | bisneedassist | bisneedassist | char(1) |
| 5 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 6 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 7 | cfirstid | cfirstid | cfirstid | char(20) |
| 8 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 9 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 10 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 11 | csrcid | csrcid | csrcid | char(20) |
| 12 | dcreatetime | dcreatetime | dcreatetime | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 15 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 16 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 17 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 18 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 19 | pk_decidemeettype | pk_decidemeettype | pk_decidemeettype | varchar2(20) |  |  | '~' |
| 20 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 21 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 22 | pk_enterprise | pk_enterprise | pk_enterprise | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | char(20) | √ |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 27 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 28 | taudittime | taudittime | taudittime | char(19) |
| 29 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 30 | vbillcode | vbillcode | vbillcode | varchar2(50) | √ |
| 31 | vbillname | vbillname | vbillname | varchar2(2048) |
| 32 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 33 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 34 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 35 | vmemo | vmemo | vmemo | varchar2(4000) |
| 36 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 37 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 38 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 39 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 40 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 41 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 42 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 43 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 44 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 45 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 46 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 47 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 48 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 49 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 50 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 51 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 52 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 53 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 54 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 55 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 56 | vsourcebillcode | vsourcebillcode | vsourcebillcode | varchar2(200) |
| 57 | vsourcebillname | vsourcebillname | vsourcebillname | varchar2(200) |
| 58 | vsourcesystem | vsourcesystem | vsourcesystem | varchar2(200) |
| 59 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 60 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 61 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 62 | vtopicdescription | vtopicdescription | vtopicdescription | varchar2(2048) |
| 63 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 64 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 65 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 66 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 67 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 68 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 69 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 70 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 71 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 72 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 73 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 74 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 75 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 76 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 77 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 78 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 79 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 80 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 81 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 82 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 83 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 84 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 85 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 86 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 87 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 88 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 89 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 90 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 91 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 92 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 93 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 94 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 95 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 96 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 97 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 98 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 99 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 100 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 101 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 102 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 103 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 104 | creationtime | creationtime | creationtime | char(19) |
| 105 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 106 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 107 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 108 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 109 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |