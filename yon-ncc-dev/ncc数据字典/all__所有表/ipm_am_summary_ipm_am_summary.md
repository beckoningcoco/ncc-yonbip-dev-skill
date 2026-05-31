# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_summary | pk_summary | pk_summary | char(20) | √ |
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
| 12 | dmakedate | dmakedate | dmakedate | char(19) |
| 13 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 14 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 15 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 16 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 17 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 18 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 19 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 20 | pk_enterprise | pk_enterprise | pk_enterprise | varchar2(20) |  |  | '~' |
| 21 | pk_enterprise_person | pk_enterprise_person | pk_enterprise_person | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | char(20) | √ |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 26 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 27 | taudittime | taudittime | taudittime | char(19) |
| 28 | tbeigintime | tbeigintime | tbeigintime | char(19) |
| 29 | tendtime | tendtime | tendtime | char(19) |
| 30 | vanchor | vanchor | vanchor | varchar2(75) |
| 31 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 32 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 33 | vbillname | vbillname | vbillname | varchar2(1200) |
| 34 | vconvener | vconvener | vconvener | varchar2(75) |
| 35 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 36 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 37 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 38 | vholdmeetnature | vholdmeetnature | vholdmeetnature | varchar2(50) |
| 39 | vmeetingcount | vmeetingcount | vmeetingcount | number(38, 0) |
| 40 | vmeetingplace | vmeetingplace | vmeetingplace | varchar2(75) |
| 41 | vmeetingtimes | vmeetingtimes | vmeetingtimes | varchar2(75) |
| 42 | vmeetingtype | vmeetingtype | vmeetingtype | varchar2(50) |
| 43 | vmeetingyear | vmeetingyear | vmeetingyear | number(38, 0) |
| 44 | vmemo | vmemo | vmemo | varchar2(3072) |
| 45 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 46 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 47 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 48 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 49 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 50 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 51 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 52 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 53 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 54 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 55 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 56 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 57 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 58 | vsupermeetnature | vsupermeetnature | vsupermeetnature | varchar2(50) |
| 59 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 60 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 61 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 62 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 63 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 64 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 65 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 66 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 67 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 68 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 69 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 70 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 71 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 72 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 73 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 74 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 75 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 76 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 77 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 78 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 79 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 80 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 81 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 82 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 83 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 84 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 85 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 86 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 87 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 88 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 89 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 90 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 91 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 92 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 93 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 94 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 95 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 96 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 97 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 98 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 99 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 100 | creationtime | creationtime | creationtime | char(19) |
| 101 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 102 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 103 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 104 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 105 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |