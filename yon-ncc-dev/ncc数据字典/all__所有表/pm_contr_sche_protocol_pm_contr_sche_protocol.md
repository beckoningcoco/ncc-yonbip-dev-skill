# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10577.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protocol | pk_protocol | pk_protocol | char(20) | √ |
| 2 | account_number | account_number | account_number | number(38, 0) |
| 3 | bal_taxmny | bal_taxmny | bal_taxmny | number(28, 8) |
| 4 | curr_expe_mny | curr_expe_mny | curr_expe_mny | number(28, 8) |
| 5 | deadline | deadline | deadline | char(19) |
| 6 | effectdate | effectdate | effectdate | char(19) |
| 7 | last_bal_mny | last_bal_mny | last_bal_mny | number(28, 8) |
| 8 | oprnum | oprnum | oprnum | number(38, 0) |  |  | 0 |
| 9 | paymentday | paymentday | paymentday | number(38, 0) |
| 10 | pk_contr_pay | pk_contr_pay | pk_contr_pay | varchar2(20) |
| 11 | pk_contr_sche | pk_contr_sche | pk_contr_sche | char(20) | √ |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | sched_taxmny | sched_taxmny | sched_taxmny | number(28, 8) |
| 16 | src_bill_code | src_bill_code | src_bill_code | varchar2(20) |
| 17 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 18 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(40) |
| 19 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 20 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 21 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 22 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 23 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 24 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 25 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 26 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 27 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 28 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 29 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 30 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 31 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 32 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 33 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 34 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 35 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 36 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 37 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 38 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 39 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |