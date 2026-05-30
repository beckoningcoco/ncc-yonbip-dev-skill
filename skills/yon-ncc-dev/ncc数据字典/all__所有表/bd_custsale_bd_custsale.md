# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custsale | pk_custsale | pk_custsale | char(20) | √ |
| 2 | billingcust | billingcust | billingcust | varchar2(20) |  |  | '~' |
| 3 | channel | channel | channel | varchar2(20) |  |  | '~' |
| 4 | currencydefault | currencydefault | currencydefault | varchar2(20) |  |  | '~' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | discountrate | discountrate | discountrate | number(20, 8) |
| 7 | issuecust | issuecust | issuecust | varchar2(20) |  |  | '~' |
| 8 | ordertypedefault | ordertypedefault | ordertypedefault | varchar2(20) |  |  | '~' |
| 9 | paytermdefault | paytermdefault | paytermdefault | varchar2(20) |  |  | '~' |
| 10 | pk_customer | pk_customer | pk_customer | char(20) | √ |
| 11 | pk_custsaleclass | pk_custsaleclass | pk_custsaleclass | varchar2(20) |  |  | '~' |
| 12 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | char(20) | √ |
| 14 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | char(20) | √ |
| 16 | pk_paycust | pk_paycust | pk_paycust | varchar2(20) |
| 17 | pk_receiveorg | pk_receiveorg | pk_receiveorg | varchar2(20) |  |  | '~' |
| 18 | pk_tradeterm | pk_tradeterm | pk_tradeterm | varchar2(20) |
| 19 | prepaidratio | prepaidratio | prepaidratio | number(38, 0) |
| 20 | respdept | respdept | respdept | varchar2(20) |  |  | '~' |
| 21 | respperson | respperson | respperson | varchar2(20) |  |  | '~' |
| 22 | shippingtype | shippingtype | shippingtype | varchar2(20) |  |  | '~' |
| 23 | stockpriceratio | stockpriceratio | stockpriceratio | number(38, 0) |  |  | 100 |
| 24 | def1 | def1 | def1 | varchar2(101) |
| 25 | def2 | def2 | def2 | varchar2(101) |
| 26 | def3 | def3 | def3 | varchar2(101) |
| 27 | def4 | def4 | def4 | varchar2(101) |
| 28 | def5 | def5 | def5 | varchar2(101) |
| 29 | def6 | def6 | def6 | varchar2(101) |
| 30 | def7 | def7 | def7 | varchar2(101) |
| 31 | def8 | def8 | def8 | varchar2(101) |
| 32 | def9 | def9 | def9 | varchar2(101) |
| 33 | def10 | def10 | def10 | varchar2(101) |
| 34 | def11 | def11 | def11 | varchar2(101) |
| 35 | def12 | def12 | def12 | varchar2(101) |
| 36 | def13 | def13 | def13 | varchar2(101) |
| 37 | def14 | def14 | def14 | varchar2(101) |
| 38 | def15 | def15 | def15 | varchar2(101) |
| 39 | def16 | def16 | def16 | varchar2(101) |
| 40 | def17 | def17 | def17 | varchar2(101) |
| 41 | def18 | def18 | def18 | varchar2(101) |
| 42 | def19 | def19 | def19 | varchar2(101) |
| 43 | def20 | def20 | def20 | varchar2(101) |
| 44 | def21 | def21 | def21 | varchar2(101) |
| 45 | def22 | def22 | def22 | varchar2(101) |
| 46 | def23 | def23 | def23 | varchar2(101) |
| 47 | def24 | def24 | def24 | varchar2(101) |
| 48 | def25 | def25 | def25 | varchar2(101) |
| 49 | def26 | def26 | def26 | varchar2(101) |
| 50 | def27 | def27 | def27 | varchar2(101) |
| 51 | def28 | def28 | def28 | varchar2(101) |
| 52 | def29 | def29 | def29 | varchar2(101) |
| 53 | def30 | def30 | def30 | varchar2(101) |
| 54 | creationtime | creationtime | creationtime | char(19) |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 58 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |