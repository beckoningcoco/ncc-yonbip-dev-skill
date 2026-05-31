# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementreport | pk_implementreport | pk_implementreport | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | dmakedate | dmakedate | dmakedate | char(19) |
| 12 | expect | expect | expect | varchar2(1536) |
| 13 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 14 | implementstate | implementstate | implementstate | varchar2(1536) |
| 15 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 16 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 17 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 18 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 19 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 20 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 21 | pk_enterprisetopic | pk_enterprisetopic | pk_enterprisetopic | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | char(20) | √ |
| 23 | pk_implementstatus | pk_implementstatus | pk_implementstatus | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 27 | pk_specialtask | pk_specialtask | pk_specialtask | varchar2(20) |  |  | '~' |
| 28 | pk_tasksource | pk_tasksource | pk_tasksource | varchar2(20) |  |  | '~' |
| 29 | pk_topicreport | pk_topicreport | pk_topicreport | varchar2(20) |  |  | '~' |
| 30 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 31 | taudittime | taudittime | taudittime | char(19) |
| 32 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 33 | vbillcode | vbillcode | vbillcode | varchar2(50) | √ |
| 34 | vbillname | vbillname | vbillname | varchar2(1536) |
| 35 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 36 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 37 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 38 | vmemo | vmemo | vmemo | varchar2(3000) |
| 39 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 40 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 41 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 42 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 43 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 44 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 45 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 46 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 47 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 48 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 49 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 50 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 51 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 52 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 53 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 54 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 55 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 56 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 57 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 58 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 59 | vspecialtaskname | vspecialtaskname | vspecialtaskname | varchar2(1536) |
| 60 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 61 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 62 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 63 | vtasksource | vtasksource | vtasksource | varchar2(1536) |
| 64 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 65 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 66 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 67 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 68 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 69 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 70 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 71 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 72 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 73 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 74 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 75 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 76 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 77 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 78 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 79 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 80 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 81 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 82 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 83 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 84 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 85 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 86 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 87 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 88 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 89 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 90 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 91 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 92 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 93 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 94 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 95 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 96 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 97 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 98 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 99 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 100 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 101 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 102 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 103 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 104 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 105 | creationtime | creationtime | creationtime | char(19) |
| 106 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 107 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 108 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 109 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 110 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |