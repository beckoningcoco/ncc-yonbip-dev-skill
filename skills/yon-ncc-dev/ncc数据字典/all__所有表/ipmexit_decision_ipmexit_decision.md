# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_decision | pk_decision | pk_decision | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bisnormalexit | bisnormalexit | bisnormalexit | char(1) |
| 5 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 6 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 7 | cfirstid | cfirstid | cfirstid | char(20) |
| 8 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 9 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 10 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 11 | csrcid | csrcid | csrcid | char(20) |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | decision_attr | decision_attr | decision_attr | varchar2(300) |
| 14 | decision_date | decision_date | decision_date | char(19) |
| 15 | decision_opinion | decision_opinion | decision_opinion | varchar2(1536) |
| 16 | decision_result | decision_result | decision_result | varchar2(50) |
| 17 | dmakedate | dmakedate | dmakedate | char(19) |
| 18 | feasibility_overview | feasibility_overview | feasibility_overview | varchar2(1536) |
| 19 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 20 | latest_hold_ratio | latest_hold_ratio | latest_hold_ratio | number(28, 8) |
| 21 | nallcostofinvestmny | nallcostofinvestmny | nallcostofinvestmny | number(28, 8) |
| 22 | nallexitearnmny | nallexitearnmny | nallexitearnmny | number(28, 8) |
| 23 | nallexitpricemny | nallexitpricemny | nallexitpricemny | number(28, 8) |
| 24 | nbasecostofinvestmny | nbasecostofinvestmny | nbasecostofinvestmny | number(28, 8) |
| 25 | nbaseexitearnmny | nbaseexitearnmny | nbaseexitearnmny | number(28, 8) |
| 26 | nbaseexitpricemny | nbaseexitpricemny | nbaseexitpricemny | number(28, 8) |
| 27 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 28 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 29 | ngpcostofinvestmny | ngpcostofinvestmny | ngpcostofinvestmny | number(28, 8) |
| 30 | ngpexitearnmny | ngpexitearnmny | ngpexitearnmny | number(28, 8) |
| 31 | ngpexitpricemny | ngpexitpricemny | ngpexitpricemny | number(28, 8) |
| 32 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 33 | norigcostofinvestmny | norigcostofinvestmny | norigcostofinvestmny | number(28, 8) |
| 34 | norigexitearnmny | norigexitearnmny | norigexitearnmny | number(28, 8) |
| 35 | norigexitpricemny | norigexitpricemny | norigexitpricemny | number(28, 8) |
| 36 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 37 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 38 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 39 | pk_fund | pk_fund | pk_fund | varchar2(20) |  |  | '~' |
| 40 | pk_group | pk_group | pk_group | char(20) | √ |
| 41 | pk_invest_subject | pk_invest_subject | pk_invest_subject | varchar2(20) |  |  | '~' |
| 42 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 43 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 44 | pk_projectlib | pk_projectlib | pk_projectlib | varchar2(20) |  |  | '~' |
| 45 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 46 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 47 | predicted_finish | predicted_finish | predicted_finish | char(19) |
| 48 | predicted_start | predicted_start | predicted_start | char(19) |
| 49 | quit_reason | quit_reason | quit_reason | varchar2(1024) |
| 50 | sug_exit_rate | sug_exit_rate | sug_exit_rate | number(28, 8) |
| 51 | sug_exit_way | sug_exit_way | sug_exit_way | varchar2(50) |
| 52 | target_enterprise | target_enterprise | target_enterprise | varchar2(20) |  |  | '~' |
| 53 | taudittime | taudittime | taudittime | char(19) |
| 54 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 55 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 56 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 57 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 58 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 59 | vmemo | vmemo | vmemo | varchar2(2048) |
| 60 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 61 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 62 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 63 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 64 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 65 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 66 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 67 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 68 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 69 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 70 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 71 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 72 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 73 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 74 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 75 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 76 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 77 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 78 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 79 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 80 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 81 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 82 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 83 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 84 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 85 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 86 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 87 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 88 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 89 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 90 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 91 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 92 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 93 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 94 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 95 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 96 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 97 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 98 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 99 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 100 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 101 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 102 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 103 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 104 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 105 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 106 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 107 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 108 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 109 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 110 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 111 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 112 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 113 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 114 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 115 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 116 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 117 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 118 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 119 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 120 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 121 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 122 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 123 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 124 | creationtime | creationtime | creationtime | char(19) |
| 125 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 126 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 127 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 128 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 129 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |