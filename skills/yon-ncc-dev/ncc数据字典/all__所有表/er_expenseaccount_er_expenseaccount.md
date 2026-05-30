# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7959.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenseaccount | pk_expenseaccount | pk_expenseaccount | char(20) | √ |
| 2 | accmonth | accmonth | accmonth | char(2) |
| 3 | accperiod | accperiod | accperiod | varchar2(50) |
| 4 | accyear | accyear | accyear | char(4) |
| 5 | assume_amount | assume_amount | assume_amount | number(28, 8) |
| 6 | assume_dept | assume_dept | assume_dept | varchar2(20) |  |  | '~' |
| 7 | assume_org | assume_org | assume_org | varchar2(20) |  |  | '~' |
| 8 | billdate | billdate | billdate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billstatus | billstatus | billstatus | number(38, 0) |
| 11 | bx_cashitem | bx_cashitem | bx_cashitem | varchar2(20) |  |  | '~' |
| 12 | bx_cashproj | bx_cashproj | bx_cashproj | varchar2(20) |  |  | '~' |
| 13 | bx_deptid | bx_deptid | bx_deptid | varchar2(20) |  |  | '~' |
| 14 | bx_dwbm | bx_dwbm | bx_dwbm | varchar2(20) |  |  | '~' |
| 15 | bx_fiorg | bx_fiorg | bx_fiorg | varchar2(20) |  |  | '~' |
| 16 | bx_group | bx_group | bx_group | varchar2(20) |  |  | '~' |
| 17 | bx_jkbxr | bx_jkbxr | bx_jkbxr | varchar2(20) |  |  | '~' |
| 18 | bx_jsfs | bx_jsfs | bx_jsfs | varchar2(20) |  |  | '~' |
| 19 | bx_org | bx_org | bx_org | varchar2(20) |  |  | '~' |
| 20 | bx_tradetype | bx_tradetype | bx_tradetype | varchar2(50) |  |  | '~' |
| 21 | global_amount | global_amount | global_amount | number(28, 8) |
| 22 | global_currinfo | global_currinfo | global_currinfo | number(15, 8) |
| 23 | group_amount | group_amount | group_amount | number(28, 8) |
| 24 | group_currinfo | group_currinfo | group_currinfo | number(15, 8) |
| 25 | iswriteoff | iswriteoff | iswriteoff | char(1) | √ |  | 'N' |
| 26 | org_amount | org_amount | org_amount | number(28, 8) |
| 27 | org_currinfo | org_currinfo | org_currinfo | number(15, 8) |
| 28 | paydate | paydate | paydate | char(19) |
| 29 | payflag | payflag | payflag | number(38, 0) |
| 30 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 31 | pk_brand | pk_brand | pk_brand | varchar2(20) |  |  | '~' |
| 32 | pk_checkele | pk_checkele | pk_checkele | varchar2(20) |  |  | '~' |
| 33 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |
| 34 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_iobsclass | pk_iobsclass | pk_iobsclass | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_payorg | pk_payorg | pk_payorg | varchar2(20) |  |  | '~' |
| 39 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 40 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 41 | pk_proline | pk_proline | pk_proline | varchar2(20) |  |  | '~' |
| 42 | pk_resacostcenter | pk_resacostcenter | pk_resacostcenter | varchar2(20) |  |  | '~' |
| 43 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 44 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 45 | reason | reason | reason | varchar2(256) |  |  | '~' |
| 46 | src_billno | src_billno | src_billno | varchar2(50) |
| 47 | src_billtab | src_billtab | src_billtab | varchar2(50) |
| 48 | src_billtype | src_billtype | src_billtype | varchar2(50) |  |  | '~' |
| 49 | src_id | src_id | src_id | varchar2(50) |
| 50 | src_subid | src_subid | src_subid | varchar2(50) |
| 51 | src_tradetype | src_tradetype | src_tradetype | varchar2(50) |  |  | '~' |
| 52 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 53 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 54 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 55 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 56 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 57 | defitem6 | defitem6 | defitem6 | varchar2(101) |
| 58 | defitem7 | defitem7 | defitem7 | varchar2(101) |
| 59 | defitem8 | defitem8 | defitem8 | varchar2(101) |
| 60 | defitem9 | defitem9 | defitem9 | varchar2(101) |
| 61 | defitem10 | defitem10 | defitem10 | varchar2(101) |
| 62 | defitem11 | defitem11 | defitem11 | varchar2(101) |
| 63 | defitem12 | defitem12 | defitem12 | varchar2(101) |
| 64 | defitem13 | defitem13 | defitem13 | varchar2(101) |
| 65 | defitem14 | defitem14 | defitem14 | varchar2(101) |
| 66 | defitem15 | defitem15 | defitem15 | varchar2(101) |
| 67 | defitem16 | defitem16 | defitem16 | varchar2(101) |
| 68 | defitem17 | defitem17 | defitem17 | varchar2(101) |
| 69 | defitem18 | defitem18 | defitem18 | varchar2(101) |
| 70 | defitem19 | defitem19 | defitem19 | varchar2(101) |
| 71 | defitem20 | defitem20 | defitem20 | varchar2(101) |
| 72 | defitem21 | defitem21 | defitem21 | varchar2(101) |
| 73 | defitem22 | defitem22 | defitem22 | varchar2(101) |
| 74 | defitem23 | defitem23 | defitem23 | varchar2(101) |
| 75 | defitem24 | defitem24 | defitem24 | varchar2(101) |
| 76 | defitem25 | defitem25 | defitem25 | varchar2(101) |
| 77 | defitem26 | defitem26 | defitem26 | varchar2(101) |
| 78 | defitem27 | defitem27 | defitem27 | varchar2(101) |
| 79 | defitem28 | defitem28 | defitem28 | varchar2(101) |
| 80 | defitem29 | defitem29 | defitem29 | varchar2(101) |
| 81 | defitem30 | defitem30 | defitem30 | varchar2(101) |
| 82 | creationtime | creationtime | creationtime | char(19) |
| 83 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 84 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 85 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 86 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 87 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |