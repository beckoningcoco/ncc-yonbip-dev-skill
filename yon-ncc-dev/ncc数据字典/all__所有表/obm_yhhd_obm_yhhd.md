# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_yhhd | pk_yhhd | pk_yhhd | char(20) | √ |
| 2 | acct_name | acct_name | acct_name | varchar2(60) |
| 3 | acct_no | acct_no | acct_no | varchar2(50) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approvenote | approvenote | approvenote | varchar2(50) |
| 6 | approver | approver | approver | varchar2(50) |
| 7 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 8 | autolink | autolink | autolink | char(1) |
| 9 | bank_seq_no | bank_seq_no | bank_seq_no | varchar2(50) |
| 10 | billdate | billdate | billdate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(50) |
| 12 | billno | billno | billno | varchar2(50) |
| 13 | billtype | billtype | billtype | varchar2(50) |
| 14 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 15 | bill_extend | bill_extend | bill_extend | varchar2(2000) |
| 16 | bill_no | bill_no | bill_no | varchar2(60) |
| 17 | busitype | busitype | busitype | varchar2(50) |
| 18 | code | code | code | varchar2(50) |
| 19 | curr_code | curr_code | curr_code | varchar2(50) |
| 20 | dc_flag | dc_flag | dc_flag | varchar2(50) |
| 21 | downfileflag | downfileflag | downfileflag | char(1) |
| 22 | emendenum | emendenum | emendenum | number(38, 0) |
| 23 | handlink | handlink | handlink | char(1) |
| 24 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 25 | maketime | maketime | maketime | char(19) | √ |
| 26 | name | name | name | varchar2(50) |
| 27 | pkorg | pkorg | pkorg | varchar2(50) |
| 28 | pk_accorg | pk_accorg | pk_accorg | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | remark | remark | remark | varchar2(1000) |
| 33 | rowno | rowno | rowno | varchar2(50) |
| 34 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 35 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 36 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 37 | srcsystem | srcsystem | srcsystem | varchar2(50) |
| 38 | to_acct_bank | to_acct_bank | to_acct_bank | varchar2(50) |
| 39 | to_acct_bank_name | to_acct_bank_name | to_acct_bank_name | varchar2(600) |
| 40 | to_acct_name | to_acct_name | to_acct_name | varchar2(600) |
| 41 | to_acct_no | to_acct_no | to_acct_no | varchar2(100) |
| 42 | transtype | transtype | transtype | varchar2(50) |
| 43 | transtypepk | transtypepk | transtypepk | char(20) | √ |
| 44 | tran_date | tran_date | tran_date | char(19) |
| 45 | trsamt | trsamt | trsamt | number(28, 8) |
| 46 | use_name | use_name | use_name | varchar2(600) |
| 47 | def1 | def1 | def1 | varchar2(100) |
| 48 | def2 | def2 | def2 | varchar2(100) |
| 49 | def3 | def3 | def3 | varchar2(100) |
| 50 | def4 | def4 | def4 | varchar2(100) |
| 51 | def5 | def5 | def5 | varchar2(100) |
| 52 | def6 | def6 | def6 | varchar2(100) |
| 53 | def7 | def7 | def7 | varchar2(100) |
| 54 | def8 | def8 | def8 | varchar2(100) |
| 55 | def9 | def9 | def9 | varchar2(100) |
| 56 | def10 | def10 | def10 | varchar2(100) |
| 57 | def11 | def11 | def11 | varchar2(100) |
| 58 | def12 | def12 | def12 | varchar2(100) |
| 59 | def13 | def13 | def13 | varchar2(100) |
| 60 | def14 | def14 | def14 | varchar2(100) |
| 61 | def15 | def15 | def15 | varchar2(100) |
| 62 | def16 | def16 | def16 | varchar2(100) |
| 63 | def17 | def17 | def17 | varchar2(100) |
| 64 | def18 | def18 | def18 | varchar2(100) |
| 65 | def19 | def19 | def19 | varchar2(100) |
| 66 | def20 | def20 | def20 | varchar2(100) |
| 67 | creationtime | creationtime | creationtime | char(19) |
| 68 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 69 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 70 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 71 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 72 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |