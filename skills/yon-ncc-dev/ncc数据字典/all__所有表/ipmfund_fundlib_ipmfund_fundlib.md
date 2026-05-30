# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundlib | pk_fundlib | pk_fundlib | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | code | code | code | varchar2(50) |
| 10 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 11 | csrcid | csrcid | csrcid | char(20) |
| 12 | dfounddate | dfounddate | dfounddate | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | drecorddate | drecorddate | drecorddate | char(19) |
| 15 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 16 | ifundterm | ifundterm | ifundterm | number(28, 8) |
| 17 | investtooutband | investtooutband | investtooutband | varchar2(50) |
| 18 | nalltargetpaymny | nalltargetpaymny | nalltargetpaymny | number(28, 8) |
| 19 | name | name | name | varchar2(300) |
| 20 | name2 | name2 | name2 | varchar2(300) |
| 21 | name3 | name3 | name3 | varchar2(300) |
| 22 | name4 | name4 | name4 | varchar2(300) |
| 23 | name5 | name5 | name5 | varchar2(300) |
| 24 | name6 | name6 | name6 | varchar2(300) |
| 25 | nbasetargetpaymny | nbasetargetpaymny | nbasetargetpaymny | number(28, 8) |
| 26 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 27 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 28 | ngptargetpaymny | ngptargetpaymny | ngptargetpaymny | number(28, 8) |
| 29 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 30 | norigtargetpaymny | norigtargetpaymny | norigtargetpaymny | number(28, 8) |
| 31 | pk_admin | pk_admin | pk_admin | varchar2(20) |  |  | '~' |
| 32 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 33 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 34 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 35 | pk_enterprise_person | pk_enterprise_person | pk_enterprise_person | varchar2(20) |  |  | '~' |
| 36 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | char(20) | √ |
| 38 | pk_officer | pk_officer | pk_officer | varchar2(20) |  |  | '~' |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_org_form | pk_org_form | pk_org_form | varchar2(20) |  |  | '~' |
| 41 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 42 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 43 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 44 | taudittime | taudittime | taudittime | char(19) |
| 45 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 46 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 47 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 48 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 49 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 50 | vfundabbr | vfundabbr | vfundabbr | varchar2(3072) |
| 51 | vfundstate | vfundstate | vfundstate | varchar2(50) |
| 52 | vmain_invest_area | vmain_invest_area | vmain_invest_area | varchar2(750) |
| 53 | vmanagetype | vmanagetype | vmanagetype | varchar2(50) |
| 54 | vmemo | vmemo | vmemo | varchar2(3072) |
| 55 | vrecordcode | vrecordcode | vrecordcode | varchar2(50) |
| 56 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 57 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 58 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 59 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 60 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 61 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 62 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 63 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 64 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 65 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 66 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 67 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 68 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 69 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 70 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 71 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 72 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 73 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 74 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 75 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 76 | vshortname | vshortname | vshortname | varchar2(300) |
| 77 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 78 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 79 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 80 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 81 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 82 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 83 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 84 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 85 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 86 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 87 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 88 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 89 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 90 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 91 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 92 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 93 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 94 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 95 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 96 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 97 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 98 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 99 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 100 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 101 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 102 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 103 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 104 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 105 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 106 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 107 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 108 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 109 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 110 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 111 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 112 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 113 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 114 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 115 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 116 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 117 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 118 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 119 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 120 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 121 | creationtime | creationtime | creationtime | char(19) |
| 122 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 123 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 124 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 125 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 126 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |