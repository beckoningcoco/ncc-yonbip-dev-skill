# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccdetail | pk_bankaccdetail | pk_bankaccdetail | char(20) | √ |
| 2 | apapprop | apapprop | apapprop | varchar2(50) |
| 3 | balance | balance | balance | number(28, 8) |
| 4 | fundformcode | fundformcode | fundformcode | number(38, 0) |
| 5 | glcbalance | glcbalance | glcbalance | number(28, 8) |
| 6 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 7 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 8 | gllcbalance | gllcbalance | gllcbalance | number(28, 8) |
| 9 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 10 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 11 | inmoney | inmoney | inmoney | number(28, 8) |
| 12 | isbegin | isbegin | isbegin | char(1) |
| 13 | note | note | note | varchar2(181) |
| 14 | olcbalance | olcbalance | olcbalance | number(28, 8) |
| 15 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 16 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 17 | oppbank | oppbank | oppbank | varchar2(300) |
| 18 | oppbankacc | oppbankacc | oppbankacc | varchar2(300) |
| 19 | oppunit | oppunit | oppunit | varchar2(300) |
| 20 | outmoney | outmoney | outmoney | number(28, 8) |
| 21 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 22 | pk_balancetype | pk_balancetype | pk_balancetype | varchar2(50) |
| 23 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 24 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 25 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 26 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 27 | pk_cashflow | pk_cashflow | pk_cashflow | varchar2(50) |
| 28 | pk_curr | pk_curr | pk_curr | varchar2(50) |
| 29 | pk_deptdoc | pk_deptdoc | pk_deptdoc | varchar2(50) |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_inout | pk_inout | pk_inout | varchar2(50) |
| 32 | pk_oppaccount | pk_oppaccount | pk_oppaccount | varchar2(50) |
| 33 | pk_oppbank | pk_oppbank | pk_oppbank | varchar2(50) |
| 34 | pk_opporg | pk_opporg | pk_opporg | varchar2(50) |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_project | pk_project | pk_project | varchar2(50) |
| 38 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(50) |
| 39 | tallydate | tallydate | tallydate | char(10) |
| 40 | tallytime | tallytime | tallytime | char(19) |
| 41 | vbillno | vbillno | vbillno | varchar2(50) |
| 42 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 43 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 44 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 45 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 46 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 47 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 48 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 49 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 50 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 51 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 52 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 53 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 54 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 55 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 56 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 57 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 58 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 59 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 60 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 61 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |