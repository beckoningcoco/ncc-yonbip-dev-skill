# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accdt | pk_accdt | pk_accdt | char(20) | √ |
| 2 | acc_consume | acc_consume | acc_consume | char(1) |
| 3 | amt_credit | amt_credit | amt_credit | number(28, 8) |
| 4 | amt_debit | amt_debit | amt_debit | number(28, 8) |
| 5 | balance | balance | balance | number(28, 8) |
| 6 | code_cg | code_cg | code_cg | varchar2(50) |
| 7 | code_pipay | code_pipay | code_pipay | varchar2(50) |
| 8 | code_pvpay | code_pvpay | code_pvpay | varchar2(50) |
| 9 | date_opr | date_opr | date_opr | char(19) |
| 10 | desc_opr | desc_opr | desc_opr | varchar2(50) |
| 11 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 12 | eu_type | eu_type | eu_type | number(38, 0) |
| 13 | name_psn_pay | name_psn_pay | name_psn_pay | varchar2(50) |
| 14 | pk_dept_pay | pk_dept_pay | pk_dept_pay | varchar2(50) |
| 15 | pk_group | pk_group | pk_group | char(20) |
| 16 | pk_org | pk_org | pk_org | char(20) |
| 17 | pk_pati | pk_pati | pk_pati | char(20) |
| 18 | pk_patiacc | pk_patiacc | pk_patiacc | char(20) |
| 19 | pk_paypati_link | pk_paypati_link | pk_paypati_link | varchar2(50) |
| 20 | pk_psn_pay | pk_psn_pay | pk_psn_pay | varchar2(50) |
| 21 | pk_pv | pk_pv | pk_pv | char(20) |
| 22 | pk_st | pk_st | pk_st | varchar2(50) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |