# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | pk_scheme | pk_scheme | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bisnormalexit | bisnormalexit | bisnormalexit | char(1) |
| 5 | busi_condition | busi_condition | busi_condition | varchar2(1536) |
| 6 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 7 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 8 | cfirstid | cfirstid | cfirstid | char(20) |
| 9 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 10 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 11 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 12 | csrcid | csrcid | csrcid | char(20) |
| 13 | dbilldate | dbilldate | dbilldate | char(19) |
| 14 | dmakedate | dmakedate | dmakedate | char(19) |
| 15 | earn_estimates | earn_estimates | earn_estimates | varchar2(1536) |
| 16 | feedback | feedback | feedback | varchar2(1536) |
| 17 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 18 | hold_ratio | hold_ratio | hold_ratio | number(28, 8) |
| 19 | invest_overview | invest_overview | invest_overview | varchar2(1536) |
| 20 | latest_hold_ratio | latest_hold_ratio | latest_hold_ratio | number(28, 8) |
| 21 | nallcostofinvestmny | nallcostofinvestmny | nallcostofinvestmny | number(28, 8) |
| 22 | nallexitearnmny | nallexitearnmny | nallexitearnmny | number(28, 8) |
| 23 | nallexitpricemny | nallexitpricemny | nallexitpricemny | number(28, 8) |
| 24 | nallinvestamountmny | nallinvestamountmny | nallinvestamountmny | number(28, 8) |
| 25 | name | name | name | varchar2(300) |
| 26 | name2 | name2 | name2 | varchar2(300) |
| 27 | name3 | name3 | name3 | varchar2(300) |
| 28 | name4 | name4 | name4 | varchar2(300) |
| 29 | name5 | name5 | name5 | varchar2(300) |
| 30 | name6 | name6 | name6 | varchar2(300) |
| 31 | nbasecostofinvestmny | nbasecostofinvestmny | nbasecostofinvestmny | number(28, 8) |
| 32 | nbaseexitearnmny | nbaseexitearnmny | nbaseexitearnmny | number(28, 8) |
| 33 | nbaseexitpricemny | nbaseexitpricemny | nbaseexitpricemny | number(28, 8) |
| 34 | nbaseinvestamountmny | nbaseinvestamountmny | nbaseinvestamountmny | number(28, 8) |
| 35 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 36 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 37 | ngpcostofinvestmny | ngpcostofinvestmny | ngpcostofinvestmny | number(28, 8) |
| 38 | ngpexitearnmny | ngpexitearnmny | ngpexitearnmny | number(28, 8) |
| 39 | ngpexitpricemny | ngpexitpricemny | ngpexitpricemny | number(28, 8) |
| 40 | ngpinvestamountmny | ngpinvestamountmny | ngpinvestamountmny | number(28, 8) |
| 41 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 42 | norigcostofinvestmny | norigcostofinvestmny | norigcostofinvestmny | number(28, 8) |
| 43 | norigexitearnmny | norigexitearnmny | norigexitearnmny | number(28, 8) |
| 44 | norigexitpricemny | norigexitpricemny | norigexitpricemny | number(28, 8) |
| 45 | noriginvestamountmny | noriginvestamountmny | noriginvestamountmny | number(28, 8) |
| 46 | other_description | other_description | other_description | varchar2(1536) |
| 47 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 48 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 49 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 50 | pk_fund | pk_fund | pk_fund | varchar2(20) |  |  | '~' |
| 51 | pk_group | pk_group | pk_group | char(20) | √ |
| 52 | pk_invest_subject | pk_invest_subject | pk_invest_subject | varchar2(20) |  |  | '~' |
| 53 | pk_invest_type | pk_invest_type | pk_invest_type | varchar2(20) |  |  | '~' |
| 54 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 55 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 56 | pk_projectlib | pk_projectlib | pk_projectlib | varchar2(20) |  |  | '~' |
| 57 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 58 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 59 | predicted_finish | predicted_finish | predicted_finish | char(19) |
| 60 | predicted_start | predicted_start | predicted_start | char(19) |
| 61 | quit_reason | quit_reason | quit_reason | varchar2(1536) |
| 62 | solutions | solutions | solutions | varchar2(1536) |
| 63 | sug_exit_rate | sug_exit_rate | sug_exit_rate | number(28, 8) |
| 64 | sug_exit_way | sug_exit_way | sug_exit_way | varchar2(50) |
| 65 | target_enterprise | target_enterprise | target_enterprise | varchar2(20) |  |  | '~' |
| 66 | taudittime | taudittime | taudittime | char(19) |
| 67 | timing_analysis | timing_analysis | timing_analysis | varchar2(1536) |
| 68 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 69 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 70 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 71 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 72 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 73 | vmemo | vmemo | vmemo | varchar2(3072) |
| 74 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 75 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 76 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 77 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 78 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 79 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 80 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 81 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 82 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 83 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 84 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 85 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 86 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 87 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 88 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 89 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 90 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 91 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 92 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 93 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 94 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 95 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 96 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 97 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 98 | way_analysis | way_analysis | way_analysis | varchar2(1536) |
| 99 | work_plan | work_plan | work_plan | varchar2(1536) |
| 100 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 101 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 102 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 103 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 104 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 105 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 106 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 107 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 108 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 109 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 110 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 111 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 112 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 113 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 114 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 115 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 116 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 117 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 118 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 119 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 120 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 121 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 122 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 123 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 124 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 125 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 126 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 127 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 128 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 129 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 130 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 131 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 132 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 133 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 134 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 135 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 136 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 137 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 138 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 139 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 140 | creationtime | creationtime | creationtime | char(19) |
| 141 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 142 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 143 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 144 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 145 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |