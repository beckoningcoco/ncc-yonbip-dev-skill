# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equityproto | pk_equityproto | pk_equityproto | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | deffect_date | deffect_date | deffect_date | char(19) |
| 12 | dmakedate | dmakedate | dmakedate | char(19) |
| 13 | dsign_date | dsign_date | dsign_date | char(19) |
| 14 | dterminal_date | dterminal_date | dterminal_date | char(19) |
| 15 | effecter | effecter | effecter | varchar2(20) |  |  | '~' |
| 16 | effecttime | effecttime | effecttime | char(19) |
| 17 | eprotocal_state | eprotocal_state | eprotocal_state | number(38, 0) |
| 18 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 19 | nallinvestmny | nallinvestmny | nallinvestmny | number(28, 8) |
| 20 | nbaseinvestmny | nbaseinvestmny | nbaseinvestmny | number(28, 8) |
| 21 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 22 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 23 | ngpinvestmny | ngpinvestmny | ngpinvestmny | number(28, 8) |
| 24 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 25 | nnew_equity_prop | nnew_equity_prop | nnew_equity_prop | number(28, 8) |
| 26 | noriginvestmny | noriginvestmny | noriginvestmny | number(28, 8) |
| 27 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 28 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | char(20) | √ |
| 30 | pk_invest_subject | pk_invest_subject | pk_invest_subject | varchar2(20) |  |  | '~' |
| 31 | pk_invest_type | pk_invest_type | pk_invest_type | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 35 | pk_target_enterp | pk_target_enterp | pk_target_enterp | varchar2(20) |  |  | '~' |
| 36 | pk_target_proj | pk_target_proj | pk_target_proj | varchar2(20) |  |  | '~' |
| 37 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 38 | taudittime | taudittime | taudittime | char(19) |
| 39 | terminal_maker | terminal_maker | terminal_maker | varchar2(20) |  |  | '~' |
| 40 | terminal_time | terminal_time | terminal_time | char(19) |
| 41 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 42 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 43 | vbillname | vbillname | vbillname | varchar2(800) |
| 44 | vcontent_desc | vcontent_desc | vcontent_desc | varchar2(2048) |
| 45 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 46 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 47 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 48 | vinvest_plan | vinvest_plan | vinvest_plan | varchar2(50) |
| 49 | vinvest_way | vinvest_way | vinvest_way | varchar2(300) |
| 50 | vinvest_way2 | vinvest_way2 | vinvest_way2 | varchar2(300) |
| 51 | vinvest_way3 | vinvest_way3 | vinvest_way3 | varchar2(300) |
| 52 | vinvest_way4 | vinvest_way4 | vinvest_way4 | varchar2(300) |
| 53 | vinvest_way5 | vinvest_way5 | vinvest_way5 | varchar2(300) |
| 54 | vinvest_way6 | vinvest_way6 | vinvest_way6 | varchar2(300) |
| 55 | vmemo | vmemo | vmemo | varchar2(2048) |
| 56 | vprotocol_name | vprotocol_name | vprotocol_name | varchar2(300) |
| 57 | vprotocol_name2 | vprotocol_name2 | vprotocol_name2 | varchar2(300) |
| 58 | vprotocol_name3 | vprotocol_name3 | vprotocol_name3 | varchar2(300) |
| 59 | vprotocol_name4 | vprotocol_name4 | vprotocol_name4 | varchar2(300) |
| 60 | vprotocol_name5 | vprotocol_name5 | vprotocol_name5 | varchar2(300) |
| 61 | vprotocol_name6 | vprotocol_name6 | vprotocol_name6 | varchar2(300) |
| 62 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 63 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 64 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 65 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 66 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 67 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 68 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 69 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 70 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 71 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 72 | vreserve11 | vreserve11 | vreserve11 | varchar2(50) |
| 73 | vreserve12 | vreserve12 | vreserve12 | varchar2(50) |
| 74 | vreserve13 | vreserve13 | vreserve13 | varchar2(50) |
| 75 | vreserve14 | vreserve14 | vreserve14 | varchar2(50) |
| 76 | vreserve15 | vreserve15 | vreserve15 | varchar2(50) |
| 77 | vreserve16 | vreserve16 | vreserve16 | varchar2(50) |
| 78 | vreserve17 | vreserve17 | vreserve17 | varchar2(50) |
| 79 | vreserve18 | vreserve18 | vreserve18 | varchar2(50) |
| 80 | vreserve19 | vreserve19 | vreserve19 | varchar2(50) |
| 81 | vreserve20 | vreserve20 | vreserve20 | varchar2(50) |
| 82 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 83 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 84 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 85 | vterminal_reason | vterminal_reason | vterminal_reason | varchar2(200) |
| 86 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 87 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 88 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 89 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 90 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 91 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 92 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 93 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 94 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 95 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 96 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 97 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 98 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 99 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 100 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 101 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 102 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 103 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 104 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 105 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 106 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 107 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 108 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 109 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 110 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 111 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 112 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 113 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 114 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 115 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 116 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 117 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 118 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 119 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 120 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 121 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 122 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 123 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 124 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 125 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 126 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 127 | creationtime | creationtime | creationtime | char(19) |
| 128 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 129 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 130 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 131 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 132 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |