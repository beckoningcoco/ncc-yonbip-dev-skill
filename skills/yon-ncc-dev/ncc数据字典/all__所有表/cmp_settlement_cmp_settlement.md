# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlement | pk_settlement | pk_settlement | char(20) | √ |
| 2 | aduitstatus | aduitstatus | aduitstatus | number(38, 0) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | arithmetic | arithmetic | arithmetic | number(38, 0) |
| 6 | backreason | backreason | backreason | varchar2(200) |
| 7 | billcode | billcode | billcode | varchar2(40) |
| 8 | busistatus | busistatus | busistatus | number(38, 0) |
| 9 | busi_auditdate | busi_auditdate | busi_auditdate | char(19) |
| 10 | busi_billdate | busi_billdate | busi_billdate | char(19) |
| 11 | code | code | code | varchar2(1024) |
| 12 | commitdate | commitdate | commitdate | char(19) |
| 13 | commiter | commiter | commiter | varchar2(20) |  |  | '~' |
| 14 | commpaybegindate | commpaybegindate | commpaybegindate | char(19) |
| 15 | commpayenddate | commpayenddate | commpayenddate | char(19) |
| 16 | consignagreement | consignagreement | consignagreement | varchar2(50) |
| 17 | costcenter | costcenter | costcenter | varchar2(20) |  |  | '~' |
| 18 | creditorreference | creditorreference | creditorreference | varchar2(200) |
| 19 | direction | direction | direction | number(38, 0) |
| 20 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 21 | expectdealdate | expectdealdate | expectdealdate | char(19) |
| 22 | fts_billtype | fts_billtype | fts_billtype | varchar2(20) |  |  | '~' |
| 23 | globaloacl | globaloacl | globaloacl | number(28, 8) |
| 24 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 25 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 26 | isautosign | isautosign | isautosign | char(1) |
| 27 | isback | isback | isback | char(1) |
| 28 | isbusieffect | isbusieffect | isbusieffect | char(1) |
| 29 | iscommpay | iscommpay | iscommpay | char(1) |
| 30 | ishadbeenreturned | ishadbeenreturned | ishadbeenreturned | char(1) |
| 31 | isindependent | isindependent | isindependent | char(1) |
| 32 | isreset | isreset | isreset | char(1) |
| 33 | isreturned | isreturned | isreturned | char(1) |
| 34 | issettleeffect | issettleeffect | issettleeffect | char(1) |
| 35 | isssc | isssc | isssc | char(1) |
| 36 | isverify | isverify | isverify | char(1) |  |  | 'N' |
| 37 | lastupdatedate | lastupdatedate | lastupdatedate | char(19) |
| 38 | lastupdater | lastupdater | lastupdater | varchar2(20) |  |  | '~' |
| 39 | ntberrmsg | ntberrmsg | ntberrmsg | varchar2(200) |
| 40 | orglocal | orglocal | orglocal | number(28, 8) |
| 41 | payreason | payreason | payreason | varchar2(181) |
| 42 | pk_auditor | pk_auditor | pk_auditor | varchar2(20) |  |  | '~' |
| 43 | pk_billoperator | pk_billoperator | pk_billoperator | varchar2(20) |  |  | '~' |
| 44 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 46 | pk_busibill | pk_busibill | pk_busibill | varchar2(20) |  |  | '~' |
| 47 | pk_busitype | pk_busitype | pk_busitype | varchar2(50) |
| 48 | pk_executor | pk_executor | pk_executor | varchar2(20) |  |  | '~' |
| 49 | pk_ftsbill | pk_ftsbill | pk_ftsbill | char(20) |
| 50 | pk_ftsbilltype | pk_ftsbilltype | pk_ftsbilltype | varchar2(20) |
| 51 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 52 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 53 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 54 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 55 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 56 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 57 | pk_signer | pk_signer | pk_signer | varchar2(20) |  |  | '~' |
| 58 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 59 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 60 | primal | primal | primal | number(28, 8) |
| 61 | returnreason | returnreason | returnreason | varchar2(272) |
| 62 | reversalreason | reversalreason | reversalreason | varchar2(181) |
| 63 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 64 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 65 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 66 | saga_status | saga_status | saga_status | number(38, 0) |
| 67 | sddreversaldate | sddreversaldate | sddreversaldate | char(19) |
| 68 | sddreversaler | sddreversaler | sddreversaler | varchar2(20) |  |  | '~' |
| 69 | sddreversalflag | sddreversalflag | sddreversalflag | char(1) |
| 70 | settlebilltype | settlebilltype | settlebilltype | varchar2(50) |
| 71 | settledate | settledate | settledate | char(19) |
| 72 | settlenum | settlenum | settlenum | varchar2(30) |
| 73 | settlestatus | settlestatus | settlestatus | number(38, 0) |
| 74 | settletype | settletype | settletype | number(38, 0) |
| 75 | signdate | signdate | signdate | char(19) |
| 76 | structuredstandard | structuredstandard | structuredstandard | varchar2(50) |
| 77 | systemcode | systemcode | systemcode | varchar2(20) |  |  | '~' |
| 78 | tradertypecode | tradertypecode | tradertypecode | varchar2(50) |
| 79 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 80 | def1 | def1 | def1 | varchar2(101) |
| 81 | def2 | def2 | def2 | varchar2(101) |
| 82 | def3 | def3 | def3 | varchar2(101) |
| 83 | def4 | def4 | def4 | varchar2(101) |
| 84 | def5 | def5 | def5 | varchar2(101) |
| 85 | def6 | def6 | def6 | varchar2(101) |
| 86 | def7 | def7 | def7 | varchar2(101) |
| 87 | def8 | def8 | def8 | varchar2(101) |
| 88 | def9 | def9 | def9 | varchar2(101) |
| 89 | def10 | def10 | def10 | varchar2(101) |
| 90 | def11 | def11 | def11 | varchar2(101) |
| 91 | def12 | def12 | def12 | varchar2(101) |
| 92 | def13 | def13 | def13 | varchar2(101) |
| 93 | def14 | def14 | def14 | varchar2(101) |
| 94 | def15 | def15 | def15 | varchar2(101) |
| 95 | def16 | def16 | def16 | varchar2(101) |
| 96 | def17 | def17 | def17 | varchar2(101) |
| 97 | def18 | def18 | def18 | varchar2(101) |
| 98 | def19 | def19 | def19 | varchar2(101) |
| 99 | def20 | def20 | def20 | varchar2(101) |
| 100 | creationtime | creationtime | creationtime | char(19) |
| 101 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 102 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 103 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 104 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 105 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |