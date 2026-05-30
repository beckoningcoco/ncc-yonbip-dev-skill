# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvoucherdetailid | cvoucherdetailid | cvoucherdetailid | char(20) | √ |
| 2 | cactivityid | cactivityid | cactivityid | varchar2(20) |  |  | '~' |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 4 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(20) |  |  | '~' |
| 5 | celementid | celementid | celementid | varchar2(20) |  |  | '~' |
| 6 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 7 | cperiod | cperiod | cperiod | char(7) |
| 8 | dbilldate | dbilldate | dbilldate | char(19) |
| 9 | ibilltype | ibilltype | ibilltype | number(38, 0) |
| 10 | nmoney | nmoney | nmoney | number(28, 8) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |