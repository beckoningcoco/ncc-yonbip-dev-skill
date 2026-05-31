# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liquidate | pk_liquidate | pk_liquidate | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | dbasedate | dbasedate | dbasedate | char(19) |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | dnoticedate | dnoticedate | dnoticedate | char(19) |
| 15 | dpublicdate | dpublicdate | dpublicdate | char(19) |
| 16 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 17 | hold_ratio | hold_ratio | hold_ratio | number(28, 8) |
| 18 | latest_hold_ratio | latest_hold_ratio | latest_hold_ratio | number(28, 8) |
| 19 | liquidate_reason | liquidate_reason | liquidate_reason | varchar2(50) |
| 20 | nallbasedatemny | nallbasedatemny | nallbasedatemny | number(28, 8) |
| 21 | nallcompensationmny | nallcompensationmny | nallcompensationmny | number(28, 8) |
| 22 | nalldebtmny | nalldebtmny | nalldebtmny | number(28, 8) |
| 23 | nallinvestamountmny | nallinvestamountmny | nallinvestamountmny | number(28, 8) |
| 24 | nallinvestorsmny | nallinvestorsmny | nallinvestorsmny | number(28, 8) |
| 25 | nallliquidationmny | nallliquidationmny | nallliquidationmny | number(28, 8) |
| 26 | nallliquidationtotalmny | nallliquidationtotalmny | nallliquidationtotalmny | number(28, 8) |
| 27 | nallothermny | nallothermny | nallothermny | number(28, 8) |
| 28 | nallpaytaxmny | nallpaytaxmny | nallpaytaxmny | number(28, 8) |
| 29 | nbasebasedatemny | nbasebasedatemny | nbasebasedatemny | number(28, 8) |
| 30 | nbasecompensationmny | nbasecompensationmny | nbasecompensationmny | number(28, 8) |
| 31 | nbasedebtmny | nbasedebtmny | nbasedebtmny | number(28, 8) |
| 32 | nbaseinvestamountmny | nbaseinvestamountmny | nbaseinvestamountmny | number(28, 8) |
| 33 | nbaseinvestorsmny | nbaseinvestorsmny | nbaseinvestorsmny | number(28, 8) |
| 34 | nbaseliquidationmny | nbaseliquidationmny | nbaseliquidationmny | number(28, 8) |
| 35 | nbaseliquidationtotalmny | nbaseliquidationtotalmny | nbaseliquidationtotalmny | number(28, 8) |
| 36 | nbaseothermny | nbaseothermny | nbaseothermny | number(28, 8) |
| 37 | nbasepaytaxmny | nbasepaytaxmny | nbasepaytaxmny | number(28, 8) |
| 38 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 39 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 40 | ngpbasedatemny | ngpbasedatemny | ngpbasedatemny | number(28, 8) |
| 41 | ngpcompensationmny | ngpcompensationmny | ngpcompensationmny | number(28, 8) |
| 42 | ngpdebtmny | ngpdebtmny | ngpdebtmny | number(28, 8) |
| 43 | ngpinvestamountmny | ngpinvestamountmny | ngpinvestamountmny | number(28, 8) |
| 44 | ngpinvestorsmny | ngpinvestorsmny | ngpinvestorsmny | number(28, 8) |
| 45 | ngpliquidationmny | ngpliquidationmny | ngpliquidationmny | number(28, 8) |
| 46 | ngpliquidationtotalmny | ngpliquidationtotalmny | ngpliquidationtotalmny | number(28, 8) |
| 47 | ngpothermny | ngpothermny | ngpothermny | number(28, 8) |
| 48 | ngppaytaxmny | ngppaytaxmny | ngppaytaxmny | number(28, 8) |
| 49 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 50 | norigbasedatemny | norigbasedatemny | norigbasedatemny | number(28, 8) |
| 51 | norigcompensationmny | norigcompensationmny | norigcompensationmny | number(28, 8) |
| 52 | norigdebtmny | norigdebtmny | norigdebtmny | number(28, 8) |
| 53 | noriginvestamountmny | noriginvestamountmny | noriginvestamountmny | number(28, 8) |
| 54 | noriginvestorsmny | noriginvestorsmny | noriginvestorsmny | number(28, 8) |
| 55 | norigliquidationmny | norigliquidationmny | norigliquidationmny | number(28, 8) |
| 56 | norigliquidationtotalmny | norigliquidationtotalmny | norigliquidationtotalmny | number(28, 8) |
| 57 | norigothermny | norigothermny | norigothermny | number(28, 8) |
| 58 | norigpaytaxmny | norigpaytaxmny | norigpaytaxmny | number(28, 8) |
| 59 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 60 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 61 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 62 | pk_fund | pk_fund | pk_fund | varchar2(20) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | char(20) | √ |
| 64 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 65 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 66 | pk_projectlib | pk_projectlib | pk_projectlib | varchar2(20) |  |  | '~' |
| 67 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 68 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 69 | target_enterprise | target_enterprise | target_enterprise | varchar2(30) |  |  | '~' |
| 70 | taudittime | taudittime | taudittime | char(19) |
| 71 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 72 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 73 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 74 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 75 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 76 | vmemo | vmemo | vmemo | varchar2(3072) |
| 77 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 78 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 79 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 80 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 81 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 82 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 83 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 84 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 85 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 86 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 87 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 88 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 89 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 90 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 91 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 92 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 93 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 94 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 95 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 96 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 97 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 98 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 99 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 100 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 101 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 102 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 103 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 104 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 105 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 106 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 107 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 108 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 109 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 110 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 111 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 112 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 113 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 114 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 115 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 116 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 117 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 118 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 119 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 120 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 121 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 122 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 123 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 124 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 125 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 126 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 127 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 128 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 129 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 130 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 131 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 132 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 133 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 134 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 135 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 136 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 137 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 138 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 139 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 140 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 141 | creationtime | creationtime | creationtime | char(19) |
| 142 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 143 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 144 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 145 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 146 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |