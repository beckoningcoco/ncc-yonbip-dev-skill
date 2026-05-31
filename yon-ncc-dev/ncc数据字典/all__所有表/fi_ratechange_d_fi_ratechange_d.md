# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratechange_d | pk_ratechange_d | pk_ratechange_d | char(20) | √ |
| 2 | headflag | headflag | headflag | char(1) |
| 3 | interestflag | interestflag | interestflag | char(1) |
| 4 | note | note | note | varchar2(100) |
| 5 | overdueflag | overdueflag | overdueflag | char(1) |
| 6 | periodflag | periodflag | periodflag | char(1) |
| 7 | pk_ratecode | pk_ratecode | pk_ratecode | char(20) | √ |
| 8 | rationflag | rationflag | rationflag | char(1) |
| 9 | revisedate | revisedate | revisedate | char(19) |
| 10 | reviser | reviser | reviser | varchar2(20) |  |  | '~' |
| 11 | testcode | testcode | testcode | char(20) |  |  | '~' |
| 12 | versionno | versionno | versionno | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |