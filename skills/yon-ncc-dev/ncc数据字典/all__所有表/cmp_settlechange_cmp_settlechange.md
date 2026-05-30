# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7571.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlechange | pk_settlechange | pk_settlechange | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | bankmsg | bankmsg | bankmsg | varchar2(100) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | bill_number | bill_number | bill_number | varchar2(50) |
| 6 | busistatus | busistatus | busistatus | varchar2(50) |
| 7 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 8 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 9 | dbilldate | dbilldate | dbilldate | char(19) |
| 10 | dept | dept | dept | varchar2(20) |
| 11 | direct_ecds | direct_ecds | direct_ecds | char(1) |
| 12 | direct_ecds_old | direct_ecds_old | direct_ecds_old | char(1) |
| 13 | doperatedate | doperatedate | doperatedate | char(19) |
| 14 | doperatetime | doperatetime | doperatetime | char(19) |
| 15 | fundtype | fundtype | fundtype | varchar2(50) |
| 16 | globalpaylocal_last | globalpaylocal_last | globalpaylocal_last | number(28, 8) |
| 17 | globalpayrate_last | globalpayrate_last | globalpayrate_last | number(28, 8) |
| 18 | grouppaylocal_last | grouppaylocal_last | grouppaylocal_last | number(28, 8) |
| 19 | grouppayrate_last | grouppayrate_last | grouppayrate_last | number(28, 8) |
| 20 | memo | memo | memo | varchar2(181) |
| 21 | memo_old | memo_old | memo_old | varchar2(181) |
| 22 | notenumber | notenumber | notenumber | varchar2(50) |
| 23 | pay | pay | pay | number(28, 8) |
| 24 | paylocalrate_last | paylocalrate_last | paylocalrate_last | number(28, 8) |
| 25 | paylocal_last | paylocal_last | paylocal_last | number(28, 8) |
| 26 | paylogpk | paylogpk | paylogpk | varchar2(20) |
| 27 | person | person | person | varchar2(20) |
| 28 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 29 | pk_account_old | pk_account_old | pk_account_old | varchar2(50) |
| 30 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 31 | pk_balatype_old | pk_balatype_old | pk_balatype_old | varchar2(20) |  |  | '~' |
| 32 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 33 | pk_bank_old | pk_bank_old | pk_bank_old | varchar2(20) |  |  | '~' |
| 34 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 35 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 36 | pk_cashaccount | pk_cashaccount | pk_cashaccount | varchar2(20) |  |  | '~' |
| 37 | pk_cashaccount_old | pk_cashaccount_old | pk_cashaccount_old | varchar2(50) |
| 38 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 39 | pk_detail | pk_detail | pk_detail | varchar2(50) |
| 40 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 41 | pk_notenumber | pk_notenumber | pk_notenumber | varchar2(50) |
| 42 | pk_notenumber_old | pk_notenumber_old | pk_notenumber_old | varchar2(50) |
| 43 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 44 | pk_notetype_old | pk_notetype_old | pk_notetype_old | varchar2(20) |  |  | '~' |
| 45 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 46 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 47 | pk_settlement | pk_settlement | pk_settlement | varchar2(50) |
| 48 | submitdate | submitdate | submitdate | char(19) |
| 49 | submittor | submittor | submittor | varchar2(20) |  |  | '~' |
| 50 | vbillno | vbillno | vbillno | varchar2(50) |
| 51 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 52 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 53 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 54 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 55 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 56 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 57 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 58 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 59 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 60 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 61 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 62 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 63 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 64 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 65 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 66 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 67 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 68 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 69 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 70 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 71 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 72 | creationtime | creationtime | creationtime | char(19) |
| 73 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 74 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 75 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 76 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 77 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |