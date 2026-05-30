# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11469.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order | pk_order | pk_order | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | blatestflag | blatestflag | blatestflag | varchar2(1) |
| 5 | bpickmo | bpickmo | bpickmo | char(1) |  |  | 'N' |
| 6 | btriatradeflag | btriatradeflag | btriatradeflag | char(1) |
| 7 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 8 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | crececountryid | crececountryid | crececountryid | varchar2(20) |
| 11 | creviser | creviser | creviser | varchar2(20) |  |  | '~' |
| 12 | csendcountryid | csendcountryid | csendcountryid | varchar2(20) |
| 13 | ctaxcountryid | ctaxcountryid | ctaxcountryid | varchar2(20) |
| 14 | ctradewordid | ctradewordid | ctradewordid | varchar2(20) |
| 15 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 16 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) |  |  | '~' |
| 17 | dbilldate | dbilldate | dbilldate | char(19) |
| 18 | dmakedate | dmakedate | dmakedate | char(19) |
| 19 | fbuysellflag | fbuysellflag | fbuysellflag | number(38, 0) |
| 20 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 21 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 22 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 23 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 24 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 25 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 26 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 27 | nversion | nversion | nversion | number(38, 0) |
| 28 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 29 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 30 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 31 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 32 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 33 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_invcsupllier | pk_invcsupllier | pk_invcsupllier | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 39 | pk_recvcustomer | pk_recvcustomer | pk_recvcustomer | varchar2(20) |  |  | '~' |
| 40 | pk_srcorder | pk_srcorder | pk_srcorder | varchar2(20) |
| 41 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 42 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 44 | pk_transporttype | pk_transporttype | pk_transporttype | varchar2(20) |  |  | '~' |
| 45 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 46 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 47 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 48 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 49 | taudittime | taudittime | taudittime | char(19) |
| 50 | trevisetime | trevisetime | trevisetime | varchar2(19) |
| 51 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 52 | vmemo | vmemo | vmemo | varchar2(181) |
| 53 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 54 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 55 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 56 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 57 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 58 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 59 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 60 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 61 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 62 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 63 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 64 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 65 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 66 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 67 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 68 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 69 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 70 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 71 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 72 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 73 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 74 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 75 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 76 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 77 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 78 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 79 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 80 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 81 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 82 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 83 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 84 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 85 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 86 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 87 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 88 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 89 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 90 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 91 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 92 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 93 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 94 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 95 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 96 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 97 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 98 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 99 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 100 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 101 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 102 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 103 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 104 | creationtime | creationtime | creationtime | char(19) |
| 105 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 106 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 107 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 108 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 109 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |