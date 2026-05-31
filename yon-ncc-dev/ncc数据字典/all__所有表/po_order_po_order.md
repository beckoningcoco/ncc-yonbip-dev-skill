# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order | pk_order | pk_order | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | bcooptoso | bcooptoso | bcooptoso | char(1) |
| 4 | bdirect | bdirect | bdirect | char(1) |
| 5 | bfinalclose | bfinalclose | bfinalclose | char(1) |  |  | 'N' |
| 6 | bfrozen | bfrozen | bfrozen | char(1) |  |  | 'N' |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | bislatest | bislatest | bislatest | char(1) |  |  | 'Y' |
| 9 | bisreplenish | bisreplenish | bisreplenish | char(1) |  |  | 'N' |
| 10 | brefwhenreturn | brefwhenreturn | brefwhenreturn | char(1) |  |  | 'N' |
| 11 | breturn | breturn | breturn | char(1) |  |  | 'N' |
| 12 | bsocooptome | bsocooptome | bsocooptome | char(1) |  |  | 'N' |
| 13 | ccontracttextpath | ccontracttextpath | ccontracttextpath | varchar2(181) |
| 14 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 15 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 16 | crevisepsn | crevisepsn | crevisepsn | varchar2(20) |  |  | '~' |
| 17 | ctradewordid | ctradewordid | ctradewordid | varchar2(20) |  |  | '~' |
| 18 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 19 | dbilldate | dbilldate | dbilldate | char(19) |
| 20 | dclosedate | dclosedate | dclosedate | varchar2(19) |
| 21 | dmakedate | dmakedate | dmakedate | char(19) |
| 22 | fhtaxtypeflag | fhtaxtypeflag | fhtaxtypeflag | number(38, 0) |  |  | 1 |
| 23 | forderstatus | forderstatus | forderstatus | number(38, 0) |  |  | 0 |
| 24 | iprintcount | iprintcount | iprintcount | number(38, 0) |  |  | 0 |
| 25 | nhtaxrate | nhtaxrate | nhtaxrate | number(28, 8) |
| 26 | norgprepaylimit | norgprepaylimit | norgprepaylimit | number(28, 8) |
| 27 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 28 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 29 | ntotalpiece | ntotalpiece | ntotalpiece | number(28, 8) |
| 30 | ntotalvolume | ntotalvolume | ntotalvolume | number(28, 8) |
| 31 | ntotalweight | ntotalweight | ntotalweight | number(28, 8) |
| 32 | nversion | nversion | nversion | number(38, 0) |
| 33 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 34 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 35 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 36 | pk_deliveradd | pk_deliveradd | pk_deliveradd | varchar2(20) |  |  | '~' |
| 37 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 38 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 39 | pk_freecust | pk_freecust | pk_freecust | varchar2(20) |  |  | '~' |
| 40 | pk_freezepsndoc | pk_freezepsndoc | pk_freezepsndoc | varchar2(20) |  |  | '~' |
| 41 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 42 | pk_invcsupllier | pk_invcsupllier | pk_invcsupllier | varchar2(20) |  |  | '~' |
| 43 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 45 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 46 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 47 | pk_recvcustomer | pk_recvcustomer | pk_recvcustomer | varchar2(20) |  |  | '~' |
| 48 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) | √ |  | '~' |
| 49 | pk_transporttype | pk_transporttype | pk_transporttype | varchar2(20) |  |  | '~' |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 54 | taudittime | taudittime | taudittime | char(19) |
| 55 | tfreezetime | tfreezetime | tfreezetime | char(19) |
| 56 | trevisiontime | trevisiontime | trevisiontime | char(19) |
| 57 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 58 | vcoopordercode | vcoopordercode | vcoopordercode | varchar2(40) |
| 59 | vfrozenreason | vfrozenreason | vfrozenreason | varchar2(100) |
| 60 | vmemo | vmemo | vmemo | varchar2(181) |
| 61 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 62 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 63 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 64 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 65 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 66 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 67 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 68 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 69 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 70 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 71 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 72 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 73 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 74 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 75 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 76 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 77 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 78 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 79 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 80 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 81 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 82 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 83 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 84 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 85 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 86 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 87 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 88 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 89 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 90 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 91 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 92 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 93 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 94 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 95 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 96 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 97 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 98 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 99 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 100 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 101 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 102 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 103 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 104 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 105 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 106 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 107 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 108 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 109 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 110 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 111 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 112 | creationtime | creationtime | creationtime | char(19) |
| 113 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 114 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 115 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 116 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 117 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |