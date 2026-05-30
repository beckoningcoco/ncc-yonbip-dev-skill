# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8194.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pk_discalculate_b | pk_pk_discalculate_b | pk_pk_discalculate_b | char(20) | √ |
| 2 | delay_days | delay_days | delay_days | number(38, 0) |
| 3 | discount_date | discount_date | discount_date | char(19) |
| 4 | discount_days | discount_days | discount_days | number(38, 0) |
| 5 | discount_interest | discount_interest | discount_interest | number(28, 8) |
| 6 | discount_money | discount_money | discount_money | number(28, 8) |
| 7 | enable_date | enable_date | enable_date | char(19) |
| 8 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 9 | glc_discount_interest | glc_discount_interest | glc_discount_interest | number(28, 8) |
| 10 | glc_discount_money | glc_discount_money | glc_discount_money | number(28, 8) |
| 11 | gll_discount_interest | gll_discount_interest | gll_discount_interest | number(28, 8) |
| 12 | gll_discount_money | gll_discount_money | gll_discount_money | number(28, 8) |
| 13 | interest_day | interest_day | interest_day | number(28, 8) |
| 14 | interest_days | interest_days | interest_days | number(38, 0) |
| 15 | interest_month | interest_month | interest_month | number(28, 8) |
| 16 | interest_year | interest_year | interest_year | number(28, 8) |
| 17 | olc_discount_interest | olc_discount_interest | olc_discount_interest | number(28, 8) |
| 18 | olc_discount_money | olc_discount_money | olc_discount_money | number(28, 8) |
| 19 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 20 | pk_discalculate | pk_discalculate | pk_discalculate | char(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |