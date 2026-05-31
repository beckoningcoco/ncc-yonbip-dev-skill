# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceform | pk_priceform | pk_priceform | char(20) | √ |
| 2 | ndiscount | ndiscount | ndiscount | number(28, 8) |
| 3 | nnetprice | nnetprice | nnetprice | number(28, 8) |
| 4 | nprice | nprice | nprice | number(28, 8) |
| 5 | nquerydiscount | nquerydiscount | nquerydiscount | number(28, 8) |
| 6 | nquerynetprice | nquerynetprice | nquerynetprice | number(28, 8) |
| 7 | nqueryprice | nqueryprice | nqueryprice | number(28, 8) |
| 8 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 9 | pk_discountsaleorg | pk_discountsaleorg | pk_discountsaleorg | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_pricepolicy | pk_pricepolicy | pk_pricepolicy | varchar2(20) |  |  | '~' |
| 12 | pk_pricepolicyorg | pk_pricepolicyorg | pk_pricepolicyorg | varchar2(20) |  |  | '~' |
| 13 | pk_tariffdef | pk_tariffdef | pk_tariffdef | varchar2(20) |  |  | '~' |
| 14 | pk_tariffdeforg | pk_tariffdeforg | pk_tariffdeforg | varchar2(20) |  |  | '~' |
| 15 | priceformstr | priceformstr | priceformstr | varchar2(2000) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |