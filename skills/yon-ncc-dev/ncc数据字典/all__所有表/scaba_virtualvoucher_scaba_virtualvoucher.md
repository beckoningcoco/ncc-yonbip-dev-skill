# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11286.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_virvoucher | pk_virvoucher | pk_virvoucher | char(20) | √ |
| 2 | billtype_code | billtype_code | billtype_code | varchar2(50) |
| 3 | brtvoucherflag | brtvoucherflag | brtvoucherflag | char(1) |
| 4 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 5 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 6 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 7 | dbusinessdate | dbusinessdate | dbusinessdate | char(19) |
| 8 | isourcetype | isourcetype | isourcetype | number(38, 0) |
| 9 | nmoney | nmoney | nmoney | number(28, 8) |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_co | pk_org_co | pk_org_co | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 16 | pk_profitcenter_v | pk_profitcenter_v | pk_profitcenter_v | varchar2(20) |  |  | '~' |
| 17 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 18 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 19 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 20 | saga_status | saga_status | saga_status | number(38, 0) |
| 21 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 22 | vmocode | vmocode | vmocode | varchar2(40) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |