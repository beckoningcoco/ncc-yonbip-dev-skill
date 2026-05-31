# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estirecbill | pk_estirecbill | pk_estirecbill | char(20) | √ |
| 2 | accessorynum | accessorynum | accessorynum | number(38, 0) |  |  | 0 |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) | √ |  | -1 |
| 6 | billclass | billclass | billclass | varchar2(2) | √ |
| 7 | billdate | billdate | billdate | char(19) | √ |
| 8 | billmaker | billmaker | billmaker | char(20) | √ |
| 9 | billno | billno | billno | varchar2(40) |
| 10 | billperiod | billperiod | billperiod | varchar2(2) |
| 11 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 12 | billyear | billyear | billyear | varchar2(4) |
| 13 | confirmuser | confirmuser | confirmuser | varchar2(20) |  |  | '~' |
| 14 | custdelegate | custdelegate | custdelegate | char(20) |
| 15 | effectdate | effectdate | effectdate | char(19) |
| 16 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 17 | effectuser | effectuser | effectuser | varchar2(20) |  |  | '~' |
| 18 | estflag | estflag | estflag | number(38, 0) |
| 19 | globallocal | globallocal | globallocal | number(28, 8) |  |  | 0 |
| 20 | grouplocal | grouplocal | grouplocal | number(28, 8) |  |  | 0 |
| 21 | isflowbill | isflowbill | isflowbill | char(1) |
| 22 | isinit | isinit | isinit | char(1) |
| 23 | isreded | isreded | isreded | char(1) |
| 24 | lastadjustuser | lastadjustuser | lastadjustuser | varchar2(20) |  |  | '~' |
| 25 | lastapproveid | lastapproveid | lastapproveid | varchar2(20) |  |  | '~' |
| 26 | local_money | local_money | local_money | number(28, 8) |  |  | 1 |
| 27 | money | money | money | number(28, 8) |  |  | 0 |
| 28 | officialprintdate | officialprintdate | officialprintdate | char(19) |
| 29 | officialprintuser | officialprintuser | officialprintuser | varchar2(20) |  |  | '~' |
| 30 | outbusitype | outbusitype | outbusitype | char(20) |
| 31 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 32 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 33 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 34 | pk_corp | pk_corp | pk_corp | char(20) |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 37 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 38 | pk_group | pk_group | pk_group | char(20) | √ |
| 39 | pk_org | pk_org | pk_org | char(20) | √ |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 42 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |
| 44 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 45 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 46 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 47 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 48 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 49 | scomment | scomment | scomment | varchar2(250) |
| 50 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 51 | settlenum | settlenum | settlenum | varchar2(30) |
| 52 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 53 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 54 | signdate | signdate | signdate | char(19) |
| 55 | signperiod | signperiod | signperiod | varchar2(2) |
| 56 | signuser | signuser | signuser | varchar2(20) |  |  | '~' |
| 57 | signyear | signyear | signyear | varchar2(4) |
| 58 | src_syscode | src_syscode | src_syscode | number(38, 0) |
| 59 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 60 | syscode | syscode | syscode | number(38, 0) | √ |
| 61 | taxcountryid | taxcountryid | taxcountryid | varchar2(20) |
| 62 | def1 | def1 | def1 | varchar2(101) |
| 63 | def2 | def2 | def2 | varchar2(101) |
| 64 | def3 | def3 | def3 | varchar2(101) |
| 65 | def4 | def4 | def4 | varchar2(101) |
| 66 | def5 | def5 | def5 | varchar2(101) |
| 67 | def6 | def6 | def6 | varchar2(101) |
| 68 | def7 | def7 | def7 | varchar2(101) |
| 69 | def8 | def8 | def8 | varchar2(101) |
| 70 | def9 | def9 | def9 | varchar2(101) |
| 71 | def10 | def10 | def10 | varchar2(101) |
| 72 | def11 | def11 | def11 | varchar2(101) |
| 73 | def12 | def12 | def12 | varchar2(101) |
| 74 | def13 | def13 | def13 | varchar2(101) |
| 75 | def14 | def14 | def14 | varchar2(101) |
| 76 | def15 | def15 | def15 | varchar2(101) |
| 77 | def16 | def16 | def16 | varchar2(101) |
| 78 | def17 | def17 | def17 | varchar2(101) |
| 79 | def18 | def18 | def18 | varchar2(101) |
| 80 | def19 | def19 | def19 | varchar2(101) |
| 81 | def20 | def20 | def20 | varchar2(101) |
| 82 | def21 | def21 | def21 | varchar2(101) |
| 83 | def22 | def22 | def22 | varchar2(101) |
| 84 | def23 | def23 | def23 | varchar2(101) |
| 85 | def24 | def24 | def24 | varchar2(101) |
| 86 | def25 | def25 | def25 | varchar2(101) |
| 87 | def26 | def26 | def26 | varchar2(101) |
| 88 | def27 | def27 | def27 | varchar2(101) |
| 89 | def28 | def28 | def28 | varchar2(101) |
| 90 | def29 | def29 | def29 | varchar2(101) |
| 91 | def30 | def30 | def30 | varchar2(101) |
| 92 | creationtime | creationtime | creationtime | char(19) | √ |
| 93 | creator | creator | creator | char(20) | √ |
| 94 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 95 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 96 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 97 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |