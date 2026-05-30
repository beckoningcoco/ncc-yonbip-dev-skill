# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planadjust | pk_planadjust | pk_planadjust | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bisgathered | bisgathered | bisgathered | char(1) |
| 5 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 6 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 7 | cfirstid | cfirstid | cfirstid | char(20) |
| 8 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 9 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 10 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 11 | csrcid | csrcid | csrcid | varchar2(50) |  |  | '~' |
| 12 | dmakedate | dmakedate | dmakedate | char(19) |
| 13 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 14 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 15 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 16 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 17 | pk_adjustdept | pk_adjustdept | pk_adjustdept | varchar2(20) |  |  | '~' |
| 18 | pk_adjustdept_v | pk_adjustdept_v | pk_adjustdept_v | varchar2(20) |  |  | '~' |
| 19 | pk_adjustpsn | pk_adjustpsn | pk_adjustpsn | varchar2(20) |  |  | '~' |
| 20 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | char(20) | √ |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 25 | plan_name | plan_name | plan_name | varchar2(383) |
| 26 | taudittime | taudittime | taudittime | char(19) |
| 27 | vadjustmemo | vadjustmemo | vadjustmemo | varchar2(3072) |
| 28 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 29 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 30 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 31 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 32 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 33 | vmemo | vmemo | vmemo | varchar2(3072) |
| 34 | vmonth | vmonth | vmonth | varchar2(50) |  |  | '~' |
| 35 | vquarter | vquarter | vquarter | varchar2(50) |  |  | '~' |
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
| 46 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 47 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 48 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 49 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 50 | vyear | vyear | vyear | varchar2(20) |
| 51 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 52 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 53 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 54 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 55 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 56 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 57 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 58 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 59 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 60 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 61 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 62 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 63 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 64 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 65 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 66 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 67 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 68 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 69 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 70 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 71 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 72 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 73 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 74 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 75 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 76 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 77 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 78 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 79 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 80 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 81 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 82 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 83 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 84 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 85 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 86 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 87 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 88 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 89 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 90 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 91 | creationtime | creationtime | creationtime | char(19) |
| 92 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 93 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 94 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 95 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 96 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |