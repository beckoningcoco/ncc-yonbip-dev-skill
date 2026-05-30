# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratechange_d | pk_ratechange_d | pk_ratechange_d | char(20) | √ |
| 2 | drate | drate | drate | number(28, 4) |
| 3 | interestflag | interestflag | interestflag | char(1) |
| 4 | note | note | note | varchar2(100) |
| 5 | pk_usectmanage | pk_usectmanage | pk_usectmanage | char(20) | √ |
| 6 | revisedate | revisedate | revisedate | char(19) |
| 7 | reviser | reviser | reviser | varchar2(20) |  |  | '~' |
| 8 | sharerate | sharerate | sharerate | number(28, 4) |
| 9 | testcode | testcode | testcode | char(20) |  |  | '~' |
| 10 | unitrate | unitrate | unitrate | number(28, 4) |
| 11 | versionno | versionno | versionno | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |