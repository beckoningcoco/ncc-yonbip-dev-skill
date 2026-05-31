# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | pk_voucher | pk_voucher | char(20) | √ |
| 2 | accountcreditamt | accountcreditamt | accountcreditamt | number(28, 8) |
| 3 | accountdebitamt | accountdebitamt | accountdebitamt | number(28, 8) |
| 4 | accountingyear | accountingyear | accountingyear | varchar2(20) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | approvetime | approvetime | approvetime | char(19) |
| 8 | billdate | billdate | billdate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billnum | billnum | billnum | number(38, 0) |
| 11 | billstatus | billstatus | billstatus | number(38, 0) |
| 12 | billtype | billtype | billtype | varchar2(50) |
| 13 | blankoutflag | blankoutflag | blankoutflag | char(1) |
| 14 | businessdate | businessdate | businessdate | char(19) |
| 15 | def_period | def_period | def_period | varchar2(50) |
| 16 | detailpos | detailpos | detailpos | varchar2(50) |
| 17 | errmsg | errmsg | errmsg | varchar2(200) |
| 18 | filecount | filecount | filecount | number(38, 0) |
| 19 | glbcreditamt | glbcreditamt | glbcreditamt | number(28, 8) |
| 20 | glbdebitamt | glbdebitamt | glbdebitamt | number(28, 8) |
| 21 | grpcreditamt | grpcreditamt | grpcreditamt | number(28, 8) |
| 22 | grpdebitamt | grpdebitamt | grpdebitamt | number(28, 8) |
| 23 | invalidinfo | invalidinfo | invalidinfo | varchar2(255) |
| 24 | isblankout | isblankout | isblankout | char(1) |
| 25 | lastbilltype | lastbilltype | lastbilltype | varchar2(50) |
| 26 | period | period | period | varchar2(20) |
| 27 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 28 | pk_accountingcurrency | pk_accountingcurrency | pk_accountingcurrency | varchar2(20) |  |  | '~' |
| 29 | pk_acurrencyscheme | pk_acurrencyscheme | pk_acurrencyscheme | varchar2(20) |  |  | '~' |
| 30 | pk_glbcurrency | pk_glbcurrency | pk_glbcurrency | varchar2(20) |  |  | '~' |
| 31 | pk_glbcurrscheme | pk_glbcurrscheme | pk_glbcurrscheme | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_grpcurrency | pk_grpcurrency | pk_grpcurrency | varchar2(20) |  |  | '~' |
| 34 | pk_grpcurrscheme | pk_grpcurrscheme | pk_grpcurrscheme | varchar2(20) |  |  | '~' |
| 35 | pk_lastbillid | pk_lastbillid | pk_lastbillid | char(20) |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 39 | pk_source | pk_source | pk_source | char(20) |
| 40 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | char(20) |
| 41 | pk_sourcebilltype | pk_sourcebilltype | pk_sourcebilltype | varchar2(20) |  |  | '~' |
| 42 | pk_sourcetranstype | pk_sourcetranstype | pk_sourcetranstype | varchar2(20) |  |  | '~' |
| 43 | pk_target | pk_target | pk_target | char(20) |
| 44 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 45 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 46 | postdate | postdate | postdate | char(19) |
| 47 | ratedate | ratedate | ratedate | char(19) |
| 48 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 49 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 50 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 51 | saga_status | saga_status | saga_status | number(38, 0) |
| 52 | sourcesys | sourcesys | sourcesys | varchar2(20) |  |  | '~' |
| 53 | sourcevoucherno | sourcevoucherno | sourcevoucherno | varchar2(50) |
| 54 | targetvoucherno | targetvoucherno | targetvoucherno | varchar2(50) |
| 55 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 56 | vapprovenote | vapprovenote | vapprovenote | varchar2(255) |
| 57 | voucherno | voucherno | voucherno | varchar2(50) |
| 58 | vouchertype | vouchertype | vouchertype | number(38, 0) |
| 59 | def1 | def1 | def1 | varchar2(101) |
| 60 | def2 | def2 | def2 | varchar2(101) |
| 61 | def3 | def3 | def3 | varchar2(101) |
| 62 | def4 | def4 | def4 | varchar2(101) |
| 63 | def5 | def5 | def5 | varchar2(101) |
| 64 | def6 | def6 | def6 | varchar2(101) |
| 65 | def7 | def7 | def7 | varchar2(101) |
| 66 | def8 | def8 | def8 | varchar2(101) |
| 67 | def9 | def9 | def9 | varchar2(101) |
| 68 | def10 | def10 | def10 | varchar2(101) |
| 69 | def11 | def11 | def11 | varchar2(101) |
| 70 | def12 | def12 | def12 | varchar2(101) |
| 71 | def13 | def13 | def13 | varchar2(101) |
| 72 | def14 | def14 | def14 | varchar2(101) |
| 73 | def15 | def15 | def15 | varchar2(101) |
| 74 | def16 | def16 | def16 | varchar2(101) |
| 75 | def17 | def17 | def17 | varchar2(101) |
| 76 | def18 | def18 | def18 | varchar2(101) |
| 77 | def19 | def19 | def19 | varchar2(101) |
| 78 | def20 | def20 | def20 | varchar2(101) |
| 79 | def21 | def21 | def21 | varchar2(101) |
| 80 | def22 | def22 | def22 | varchar2(101) |
| 81 | def23 | def23 | def23 | varchar2(101) |
| 82 | def24 | def24 | def24 | varchar2(101) |
| 83 | def25 | def25 | def25 | varchar2(101) |
| 84 | def26 | def26 | def26 | varchar2(101) |
| 85 | def27 | def27 | def27 | varchar2(101) |
| 86 | def28 | def28 | def28 | varchar2(101) |
| 87 | def29 | def29 | def29 | varchar2(101) |
| 88 | def30 | def30 | def30 | varchar2(101) |
| 89 | def31 | def31 | def31 | varchar2(101) |
| 90 | def32 | def32 | def32 | varchar2(101) |
| 91 | def33 | def33 | def33 | varchar2(101) |
| 92 | def34 | def34 | def34 | varchar2(101) |
| 93 | def35 | def35 | def35 | varchar2(101) |
| 94 | def36 | def36 | def36 | varchar2(101) |
| 95 | def37 | def37 | def37 | varchar2(101) |
| 96 | def38 | def38 | def38 | varchar2(101) |
| 97 | def39 | def39 | def39 | varchar2(101) |
| 98 | def40 | def40 | def40 | varchar2(101) |
| 99 | def41 | def41 | def41 | varchar2(101) |
| 100 | def42 | def42 | def42 | varchar2(101) |
| 101 | def43 | def43 | def43 | varchar2(101) |
| 102 | def44 | def44 | def44 | varchar2(101) |
| 103 | def45 | def45 | def45 | varchar2(101) |
| 104 | def46 | def46 | def46 | varchar2(101) |
| 105 | def47 | def47 | def47 | varchar2(101) |
| 106 | def48 | def48 | def48 | varchar2(101) |
| 107 | def49 | def49 | def49 | varchar2(101) |
| 108 | def50 | def50 | def50 | varchar2(101) |
| 109 | creationtime | creationtime | creationtime | char(19) |
| 110 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 111 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 112 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 113 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 114 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |