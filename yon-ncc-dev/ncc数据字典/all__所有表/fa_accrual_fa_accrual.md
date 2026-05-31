# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrual | pk_accrual | pk_accrual | char(20) | √ |
| 2 | accu_interest | accu_interest | accu_interest | number(28, 8) |
| 3 | accyear | accyear | accyear | varchar2(50) |
| 4 | asset_code | asset_code | asset_code | varchar2(50) |
| 5 | asset_name | asset_name | asset_name | varchar2(400) |
| 6 | begin_liability | begin_liability | begin_liability | number(28, 8) |
| 7 | card_model | card_model | card_model | varchar2(400) |
| 8 | end_liability | end_liability | end_liability | number(28, 8) |
| 9 | local_interest | local_interest | local_interest | number(28, 8) |
| 10 | origin_interest | origin_interest | origin_interest | number(28, 8) |
| 11 | period | period | period | varchar2(50) |
| 12 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 13 | pk_card | pk_card | pk_card | varchar2(20) |  |  | '~' |
| 14 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 18 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 19 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 20 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 21 | spec | spec | spec | varchar2(400) |
| 22 | voucher_date | voucher_date | voucher_date | char(19) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |