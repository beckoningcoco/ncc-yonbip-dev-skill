# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliverylog_b | pk_deliverylog_b | pk_deliverylog_b | char(20) | √ |
| 2 | accbalance | accbalance | accbalance | number(28, 8) |
| 3 | amount | amount | amount | number(28, 8) |
| 4 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 5 | base | base | base | number(38, 0) |
| 6 | deliverydate | deliverydate | deliverydate | char(19) |
| 7 | deliveryrate | deliveryrate | deliveryrate | number(4, 2) |
| 8 | deliveryresult | deliveryresult | deliveryresult | blob |
| 9 | deliverytime | deliverytime | deliverytime | char(19) |
| 10 | deliverytype | deliverytype | deliverytype | number(38, 0) |
| 11 | leastamount | leastamount | leastamount | number(28, 8) |
| 12 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 13 | pk_deliverrule_b | pk_deliverrule_b | pk_deliverrule_b | varchar2(50) |
| 14 | pk_deliverylog_h | pk_deliverylog_h | pk_deliverylog_h | char(20) | √ |
| 15 | pk_delivery_b | pk_delivery_b | pk_delivery_b | varchar2(50) |
| 16 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 17 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | ration | ration | ration | number(28, 8) |
| 22 | remainmoney | remainmoney | remainmoney | number(28, 8) |
| 23 | transamount | transamount | transamount | number(28, 8) |
| 24 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(50) |
| 25 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(50) |
| 26 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(50) |
| 27 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(50) |
| 28 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(50) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |