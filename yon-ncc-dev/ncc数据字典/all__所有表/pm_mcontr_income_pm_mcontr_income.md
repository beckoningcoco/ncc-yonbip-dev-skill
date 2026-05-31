# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentch | pk_paymentch | pk_paymentch | char(20) | √ |
| 2 | accrate | accrate | accrate | number(28, 8) |
| 3 | effectdate | effectdate | effectdate | varchar2(20) |  |  | '~' |
| 4 | effectdateadddate | effectdateadddate | effectdateadddate | number(38, 0) |
| 5 | finishpercent | finishpercent | finishpercent | number(28, 8) |
| 6 | isdeposit | isdeposit | isdeposit | char(1) |
| 7 | memo | memo | memo | varchar2(50) |
| 8 | paymentday | paymentday | paymentday | number(38, 0) |
| 9 | pk_child_oid | pk_child_oid | pk_child_oid | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_mar_contr | pk_mar_contr | pk_mar_contr | char(20) | √ |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 15 | prepayment | prepayment | prepayment | char(1) |
| 16 | qual_time | qual_time | qual_time | number(38, 0) |
| 17 | shou_taxmny | shou_taxmny | shou_taxmny | number(28, 8) |
| 18 | showorder | showorder | showorder | number(38, 0) |
| 19 | taxmny | taxmny | taxmny | number(28, 8) |
| 20 | tot_bal_taxmny | tot_bal_taxmny | tot_bal_taxmny | number(28, 8) |
| 21 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 22 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 23 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 24 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 25 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 26 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 27 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 28 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 29 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 30 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 31 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 32 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 33 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 34 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 35 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 36 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 37 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 38 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 39 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 40 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |