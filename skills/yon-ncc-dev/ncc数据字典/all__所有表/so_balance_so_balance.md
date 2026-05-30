# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csobalanceid | csobalanceid | csobalanceid | char(20) | √ |
| 2 | carorgid | carorgid | carorgid | varchar2(20) |
| 3 | cchanneltypeid | cchanneltypeid | cchanneltypeid | varchar2(20) |
| 4 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 5 | cdeptid | cdeptid | cdeptid | varchar2(20) |
| 6 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |
| 7 | cinvoicecustid | cinvoicecustid | cinvoicecustid | varchar2(20) |
| 8 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |
| 9 | cpaytermid | cpaytermid | cpaytermid | varchar2(20) |
| 10 | csaleorderid | csaleorderid | csaleorderid | varchar2(20) |
| 11 | dbilldate | dbilldate | dbilldate | varchar2(19) |
| 12 | ntotalorigbalmny | ntotalorigbalmny | ntotalorigbalmny | number(28, 8) |
| 13 | ntotalorigtaxmny | ntotalorigtaxmny | ntotalorigtaxmny | number(28, 8) |
| 14 | ntotalpaymny | ntotalpaymny | ntotalpaymny | number(28, 8) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 18 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 19 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 20 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 21 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 22 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 23 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |