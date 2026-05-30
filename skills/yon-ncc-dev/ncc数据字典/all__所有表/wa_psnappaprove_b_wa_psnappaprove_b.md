# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnapp_b | pk_psnapp_b | pk_psnapp_b | char(20) | √ |
| 2 | applyreason | applyreason | applyreason | varchar2(100) |
| 3 | approved | approved | approved | char(1) |
| 4 | assgid | assgid | assgid | number(38, 0) |
| 5 | confirmstate | confirmstate | confirmstate | number(38, 0) |
| 6 | crt_max_value | crt_max_value | crt_max_value | number(31, 8) |
| 7 | crt_min_value | crt_min_value | crt_min_value | number(31, 8) |
| 8 | negotiation | negotiation | negotiation | char(1) |
| 9 | partflag | partflag | partflag | char(1) |
| 10 | pk_changecause | pk_changecause | pk_changecause | varchar2(20) |
| 11 | pk_psnapp | pk_psnapp | pk_psnapp | varchar2(20) |
| 12 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |
| 13 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |
| 14 | pk_wa_crt | pk_wa_crt | pk_wa_crt | varchar2(20) |
| 15 | pk_wa_grd | pk_wa_grd | pk_wa_grd | varchar2(20) |
| 16 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) |
| 17 | pk_wa_prmlv_apply | pk_wa_prmlv_apply | pk_wa_prmlv_apply | varchar2(20) |
| 18 | pk_wa_prmlv_cofm | pk_wa_prmlv_cofm | pk_wa_prmlv_cofm | varchar2(20) |
| 19 | pk_wa_prmlv_old | pk_wa_prmlv_old | pk_wa_prmlv_old | varchar2(20) |
| 20 | pk_wa_seclv_apply | pk_wa_seclv_apply | pk_wa_seclv_apply | varchar2(20) |
| 21 | pk_wa_seclv_cofm | pk_wa_seclv_cofm | pk_wa_seclv_cofm | varchar2(20) |
| 22 | pk_wa_seclv_old | pk_wa_seclv_old | pk_wa_seclv_old | varchar2(20) |
| 23 | usedate | usedate | usedate | char(10) |
| 24 | vnote | vnote | vnote | varchar2(100) |
| 25 | wa_apply_money | wa_apply_money | wa_apply_money | number(31, 8) |
| 26 | wa_cofm_money | wa_cofm_money | wa_cofm_money | number(31, 8) |
| 27 | wa_crt_apply_money | wa_crt_apply_money | wa_crt_apply_money | number(31, 8) |
| 28 | wa_crt_cofm_money | wa_crt_cofm_money | wa_crt_cofm_money | number(31, 8) |
| 29 | wa_crt_old_money | wa_crt_old_money | wa_crt_old_money | number(31, 8) |
| 30 | wa_old_money | wa_old_money | wa_old_money | number(31, 8) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |