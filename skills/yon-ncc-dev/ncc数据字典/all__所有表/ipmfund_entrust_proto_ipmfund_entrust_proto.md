# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entrust_proto | pk_entrust_proto | pk_entrust_proto | char(20) | √ |
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
| 12 | dfounddate | dfounddate | dfounddate | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | dsign_date | dsign_date | dsign_date | char(19) |
| 15 | dterminal_date | dterminal_date | dterminal_date | char(19) |
| 16 | effecter | effecter | effecter | varchar2(20) |  |  | '~' |
| 17 | effecttime | effecttime | effecttime | char(19) |
| 18 | entrust_descrip | entrust_descrip | entrust_descrip | varchar2(2048) |
| 19 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 20 | fund_name | fund_name | fund_name | varchar2(20) |  |  | '~' |
| 21 | fund_supervision | fund_supervision | fund_supervision | varchar2(2048) |
| 22 | legal_behalf_a | legal_behalf_a | legal_behalf_a | varchar2(50) |
| 23 | legal_behalf_b | legal_behalf_b | legal_behalf_b | varchar2(50) |
| 24 | manage_cost | manage_cost | manage_cost | varchar2(2048) |
| 25 | nalltargetpaymny | nalltargetpaymny | nalltargetpaymny | number(28, 8) |
| 26 | name_a | name_a | name_a | varchar2(20) |  |  | '~' |
| 27 | name_b | name_b | name_b | varchar2(20) |  |  | '~' |
| 28 | nbasetargetpaymny | nbasetargetpaymny | nbasetargetpaymny | number(28, 8) |
| 29 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 30 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 31 | ngptargetpaymny | ngptargetpaymny | ngptargetpaymny | number(28, 8) |
| 32 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 33 | norigtargetpaymny | norigtargetpaymny | norigtargetpaymny | number(28, 8) |
| 34 | phone_one_a | phone_one_a | phone_one_a | varchar2(50) |
| 35 | phone_one_b | phone_one_b | phone_one_b | varchar2(50) |
| 36 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 37 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 38 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 39 | pk_group | pk_group | pk_group | char(20) | √ |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_org_form | pk_org_form | pk_org_form | varchar2(20) |  |  | '~' |
| 42 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 43 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 44 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 45 | postal_addr_a | postal_addr_a | postal_addr_a | varchar2(50) |
| 46 | postal_addr_b | postal_addr_b | postal_addr_b | varchar2(50) |
| 47 | proto_code | proto_code | proto_code | varchar2(50) |
| 48 | proto_name | proto_name | proto_name | varchar2(200) |
| 49 | proto_state | proto_state | proto_state | varchar2(50) |
| 50 | taudittime | taudittime | taudittime | char(19) |
| 51 | terminal_maker | terminal_maker | terminal_maker | varchar2(20) |  |  | '~' |
| 52 | terminal_time | terminal_time | terminal_time | char(19) |
| 53 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 54 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 55 | vbillname | vbillname | vbillname | varchar2(800) |
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
| 70 | vreserve11 | vreserve11 | vreserve11 | varchar2(50) |
| 71 | vreserve12 | vreserve12 | vreserve12 | varchar2(50) |
| 72 | vreserve13 | vreserve13 | vreserve13 | varchar2(50) |
| 73 | vreserve14 | vreserve14 | vreserve14 | varchar2(50) |
| 74 | vreserve15 | vreserve15 | vreserve15 | varchar2(50) |
| 75 | vreserve16 | vreserve16 | vreserve16 | varchar2(50) |
| 76 | vreserve17 | vreserve17 | vreserve17 | varchar2(50) |
| 77 | vreserve18 | vreserve18 | vreserve18 | varchar2(50) |
| 78 | vreserve19 | vreserve19 | vreserve19 | varchar2(50) |
| 79 | vreserve20 | vreserve20 | vreserve20 | varchar2(50) |
| 80 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 81 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 82 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 83 | vterminal_reason | vterminal_reason | vterminal_reason | varchar2(2048) |
| 84 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 85 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 86 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 87 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 88 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 89 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 90 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 91 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 92 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 93 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 94 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 95 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 96 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 97 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 98 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 99 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 100 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 101 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 102 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 103 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 104 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 105 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 106 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 107 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 108 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 109 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 110 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 111 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 112 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 113 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 114 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 115 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 116 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 117 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 118 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 119 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 120 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 121 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 122 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 123 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 124 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 125 | creationtime | creationtime | creationtime | char(19) |
| 126 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 127 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 128 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 129 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 130 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |