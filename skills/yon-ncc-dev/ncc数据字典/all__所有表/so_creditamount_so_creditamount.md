# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccreditamountid | ccreditamountid | ccreditamountid | char(20) | √ |
| 2 | bcdownsaleflag | bcdownsaleflag | bcdownsaleflag | char(1) |  |  | 'Y' |
| 3 | capplyerid | capplyerid | capplyerid | varchar2(20) |
| 4 | ccreditauditid | ccreditauditid | ccreditauditid | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 7 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 8 | climitlevelid | climitlevelid | climitlevelid | varchar2(20) |  |  | '~' |
| 9 | climittypeid | climittypeid | climittypeid | varchar2(20) |  |  | '~' |
| 10 | csaledeptid | csaledeptid | csaledeptid | varchar2(20) |  |  | '~' |
| 11 | csaleorgid | csaleorgid | csaleorgid | varchar2(20) |  |  | '~' |
| 12 | dfromdate | dfromdate | dfromdate | varchar2(19) |
| 13 | dtodate | dtodate | dtodate | varchar2(19) |
| 14 | nlimitmny | nlimitmny | nlimitmny | number(28, 8) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | taudittime | taudittime | taudittime | char(19) |
| 18 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |