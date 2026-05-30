# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchlevel | pk_batchlevel | pk_batchlevel | char(20) | √ |
| 2 | areaclinnercode | areaclinnercode | areaclinnercode | varchar2(230) |
| 3 | caskunicode | caskunicode | caskunicode | char(27) |
| 4 | customerinnercode | customerinnercode | customerinnercode | varchar2(230) |
| 5 | dbegindate | dbegindate | dbegindate | varchar2(19) | √ |
| 6 | denddate | denddate | denddate | varchar2(19) |
| 7 | materialinnercode | materialinnercode | materialinnercode | varchar2(230) |
| 8 | nnumber1 | nnumber1 | nnumber1 | number(28, 8) |
| 9 | nnumber2 | nnumber2 | nnumber2 | number(28, 8) |
| 10 | nnumber3 | nnumber3 | nnumber3 | number(28, 8) |
| 11 | nnumber4 | nnumber4 | nnumber4 | number(28, 8) |
| 12 | npriceadd1 | npriceadd1 | npriceadd1 | number(28, 8) |
| 13 | npriceadd2 | npriceadd2 | npriceadd2 | number(28, 8) |
| 14 | npriceadd3 | npriceadd3 | npriceadd3 | number(28, 8) |
| 15 | npriceadd4 | npriceadd4 | npriceadd4 | number(28, 8) |
| 16 | npricefactor1 | npricefactor1 | npricefactor1 | number(28, 8) |
| 17 | npricefactor2 | npricefactor2 | npricefactor2 | number(28, 8) |
| 18 | npricefactor3 | npricefactor3 | npricefactor3 | number(28, 8) |
| 19 | npricefactor4 | npricefactor4 | npricefactor4 | number(28, 8) |
| 20 | pk_channeltype | pk_channeltype | pk_channeltype | varchar2(20) |  |  | '~' |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 23 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 24 | pk_custsaleclass | pk_custsaleclass | pk_custsaleclass | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 26 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 27 | pk_marsaleclass | pk_marsaleclass | pk_marsaleclass | varchar2(20) |  |  | '~' |
| 28 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 30 | pk_unit | pk_unit | pk_unit | varchar2(20) | √ |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |