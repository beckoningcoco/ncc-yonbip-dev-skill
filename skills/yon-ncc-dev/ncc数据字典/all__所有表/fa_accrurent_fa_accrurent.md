# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrurent | pk_accrurent | pk_accrurent | varchar2(50) | √ |
| 2 | accyear | accyear | accyear | varchar2(50) |
| 3 | adjustment_renttax | adjustment_renttax | adjustment_renttax | number(28, 8) |
| 4 | adjustment_renttax_local | adjustment_renttax_local | adjustment_renttax_local | number(28, 8) |
| 5 | asset_code | asset_code | asset_code | varchar2(50) |
| 6 | asset_name | asset_name | asset_name | varchar2(400) |
| 7 | calculate_rentnotax | calculate_rentnotax | calculate_rentnotax | number(28, 8) |
| 8 | calculate_rentnotax_loacal | calculate_rentnotax_loacal | calculate_rentnotax_loacal | number(28, 8) |
| 9 | calculate_renttax | calculate_renttax | calculate_renttax | number(28, 8) |
| 10 | calculate_renttax_local | calculate_renttax_local | calculate_renttax_local | number(28, 8) |
| 11 | calculate_tax | calculate_tax | calculate_tax | number(28, 8) |
| 12 | calculate_tax_local | calculate_tax_local | calculate_tax_local | number(28, 8) |
| 13 | card_model | card_model | card_model | varchar2(400) |
| 14 | contract_number | contract_number | contract_number | varchar2(50) |
| 15 | localcurr_rate | localcurr_rate | localcurr_rate | number(28, 8) |
| 16 | period | period | period | varchar2(50) |
| 17 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 18 | pk_card | pk_card | pk_card | varchar2(20) |  |  | '~' |
| 19 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |
| 21 | pk_lessor | pk_lessor | pk_lessor | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 24 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 25 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 26 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 27 | spec | spec | spec | varchar2(400) |
| 28 | tax_deductible | tax_deductible | tax_deductible | char(1) |
| 29 | tax_rate | tax_rate | tax_rate | number(28, 8) |
| 30 | voucher_date | voucher_date | voucher_date | char(19) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |