# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10824.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_policymatch | pk_policymatch | pk_policymatch | char(20) | √ |
| 2 | bpcorgtoaskflag | bpcorgtoaskflag | bpcorgtoaskflag | char(1) |
| 3 | caskunicode | caskunicode | caskunicode | char(27) |
| 4 | cbelongsaleorgid | cbelongsaleorgid | cbelongsaleorgid | varchar2(20) | √ |
| 5 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 6 | customerinnercode | customerinnercode | customerinnercode | varchar2(230) |
| 7 | materialinnercode | materialinnercode | materialinnercode | varchar2(230) |
| 8 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 9 | pk_custsaleclass | pk_custsaleclass | pk_custsaleclass | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 12 | pk_marsaleclass | pk_marsaleclass | pk_marsaleclass | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 14 | pk_pricepolicy | pk_pricepolicy | pk_pricepolicy | varchar2(20) | √ |
| 15 | saleorginnercode | saleorginnercode | saleorginnercode | varchar2(230) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |