# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estipayablebill | pk_estipayablebill | pk_estipayablebill | char(20) | √ |
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
| 19 | globallocal | globallocal | globallocal | number(28, 8) |  |  | 1 |
| 20 | grouplocal | grouplocal | grouplocal | number(28, 8) |  |  | 1 |
| 21 | isflowbill | isflowbill | isflowbill | char(1) |
| 22 | isinit | isinit | isinit | char(1) |
| 23 | ismandatepay | ismandatepay | ismandatepay | char(1) |
| 24 | isreded | isreded | isreded | char(1) |
| 25 | lastadjustuser | lastadjustuser | lastadjustuser | varchar2(20) |  |  | '~' |
| 26 | lastapproveid | lastapproveid | lastapproveid | varchar2(20) |  |  | '~' |
| 27 | local_money | local_money | local_money | number(28, 8) |
| 28 | money | money | money | number(28, 8) |
| 29 | officialprintdate | officialprintdate | officialprintdate | char(19) |
| 30 | officialprintuser | officialprintuser | officialprintuser | varchar2(20) |  |  | '~' |
| 31 | outbusitype | outbusitype | outbusitype | char(20) |
| 32 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 33 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 34 | pk_corp | pk_corp | pk_corp | char(20) |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 37 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 38 | pk_group | pk_group | pk_group | char(20) | √ |
| 39 | pk_org | pk_org | pk_org | char(20) | √ |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |
| 42 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 43 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 44 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 45 | rececountryid | rececountryid | rececountryid | varchar2(20) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 50 | scomment | scomment | scomment | varchar2(250) |
| 51 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 52 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 53 | signdate | signdate | signdate | char(19) |
| 54 | signperiod | signperiod | signperiod | varchar2(2) |
| 55 | signuser | signuser | signuser | varchar2(20) |  |  | '~' |
| 56 | signyear | signyear | signyear | varchar2(4) |
| 57 | src_syscode | src_syscode | src_syscode | number(38, 0) |
| 58 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 59 | syscode | syscode | syscode | number(38, 0) | √ |
| 60 | taxcountryid | taxcountryid | taxcountryid | varchar2(20) |
| 61 | def1 | def1 | def1 | varchar2(101) |
| 62 | def2 | def2 | def2 | varchar2(101) |
| 63 | def3 | def3 | def3 | varchar2(101) |
| 64 | def4 | def4 | def4 | varchar2(101) |
| 65 | def5 | def5 | def5 | varchar2(101) |
| 66 | def6 | def6 | def6 | varchar2(101) |
| 67 | def7 | def7 | def7 | varchar2(101) |
| 68 | def8 | def8 | def8 | varchar2(101) |
| 69 | def9 | def9 | def9 | varchar2(101) |
| 70 | def10 | def10 | def10 | varchar2(101) |
| 71 | def11 | def11 | def11 | varchar2(101) |
| 72 | def12 | def12 | def12 | varchar2(101) |
| 73 | def13 | def13 | def13 | varchar2(101) |
| 74 | def14 | def14 | def14 | varchar2(101) |
| 75 | def15 | def15 | def15 | varchar2(101) |
| 76 | def16 | def16 | def16 | varchar2(101) |
| 77 | def17 | def17 | def17 | varchar2(101) |
| 78 | def18 | def18 | def18 | varchar2(101) |
| 79 | def19 | def19 | def19 | varchar2(101) |
| 80 | def20 | def20 | def20 | varchar2(101) |
| 81 | def21 | def21 | def21 | varchar2(101) |
| 82 | def22 | def22 | def22 | varchar2(101) |
| 83 | def23 | def23 | def23 | varchar2(101) |
| 84 | def24 | def24 | def24 | varchar2(101) |
| 85 | def25 | def25 | def25 | varchar2(101) |
| 86 | def26 | def26 | def26 | varchar2(101) |
| 87 | def27 | def27 | def27 | varchar2(101) |
| 88 | def28 | def28 | def28 | varchar2(101) |
| 89 | def29 | def29 | def29 | varchar2(101) |
| 90 | def30 | def30 | def30 | varchar2(101) |
| 91 | creationtime | creationtime | creationtime | char(19) | √ |
| 92 | creator | creator | creator | char(20) | √ |
| 93 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 94 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 95 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 96 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |