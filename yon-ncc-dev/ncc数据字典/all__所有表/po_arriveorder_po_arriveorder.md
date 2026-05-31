# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | bisback | bisback | bisback | char(1) |
| 4 | bpublish | bpublish | bpublish | char(1) |
| 5 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 6 | dbilldate | dbilldate | dbilldate | char(19) |
| 7 | dmakedate | dmakedate | dmakedate | char(19) |
| 8 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |  |  | 0 |
| 9 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 10 | irespstatus | irespstatus | irespstatus | number(38, 0) |
| 11 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 12 | ntotaltaxmny | ntotaltaxmny | ntotaltaxmny | number(28, 8) |
| 13 | pk_arriveorder | pk_arriveorder | pk_arriveorder | char(20) | √ |
| 14 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 15 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 16 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 17 | pk_freecust | pk_freecust | pk_freecust | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_pubpsn | pk_pubpsn | pk_pubpsn | varchar2(20) |  |  | '~' |
| 22 | pk_pupsndoc | pk_pupsndoc | pk_pupsndoc | varchar2(20) |  |  | '~' |
| 23 | pk_purchaseorg | pk_purchaseorg | pk_purchaseorg | varchar2(20) |  |  | '~' |
| 24 | pk_purchaseorg_v | pk_purchaseorg_v | pk_purchaseorg_v | varchar2(20) |  |  | '~' |
| 25 | pk_receivepsndoc | pk_receivepsndoc | pk_receivepsndoc | varchar2(20) |  |  | '~' |
| 26 | pk_resppsn | pk_resppsn | pk_resppsn | varchar2(20) |  |  | '~' |
| 27 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 28 | pk_transporttype | pk_transporttype | pk_transporttype | varchar2(20) |  |  | '~' |
| 29 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 30 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 31 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 32 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 33 | taudittime | taudittime | taudittime | char(19) |
| 34 | tpubtime | tpubtime | tpubtime | char(19) |
| 35 | tresptime | tresptime | tresptime | char(19) |
| 36 | vbackreason | vbackreason | vbackreason | varchar2(20) |  |  | '~' |
| 37 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 38 | vmemo | vmemo | vmemo | varchar2(181) |
| 39 | vsupbackreason | vsupbackreason | vsupbackreason | varchar2(181) |
| 40 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 41 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 42 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 43 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 44 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 45 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 46 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 47 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 48 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 49 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 50 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 51 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 52 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 53 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 54 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 55 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 56 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 57 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 58 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 59 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 60 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 61 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 62 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 63 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 64 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 65 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 66 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 67 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 68 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 69 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 70 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 71 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 72 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 73 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 74 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 75 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 76 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 77 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 78 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 79 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 80 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 81 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 82 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 83 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 84 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 85 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 86 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 87 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 88 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 89 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 90 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 91 | creationtime | creationtime | creationtime | char(19) |
| 92 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 93 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 94 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 95 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 96 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |