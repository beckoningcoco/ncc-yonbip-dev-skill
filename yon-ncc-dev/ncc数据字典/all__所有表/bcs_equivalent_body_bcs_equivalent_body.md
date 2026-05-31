# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equivalent_body | pk_equivalent_body | pk_equivalent_body | char(20) | √ |
| 2 | assessmode | assessmode | assessmode | number(38, 0) |
| 3 | autogenervoucher | autogenervoucher | autogenervoucher | char(1) |
| 4 | availablesalefinalassets | availablesalefinalassets | availablesalefinalassets | number(28, 8) |
| 5 | bm_scope | bm_scope | bm_scope | varchar2(50) | √ |
| 6 | combineratio | combineratio | combineratio | number(28, 8) |
| 7 | controlinvest | controlinvest | controlinvest | varchar2(20) |  |  | '~' |
| 8 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 9 | equivalentratio | equivalentratio | equivalentratio | number(28, 8) |
| 10 | groupstockratio | groupstockratio | groupstockratio | number(28, 8) |
| 11 | investdate | investdate | investdate | char(19) |
| 12 | investproportion | investproportion | investproportion | number(28, 8) |
| 13 | periodstockinvest | periodstockinvest | periodstockinvest | number(28, 8) |
| 14 | pk_equivalent | pk_equivalent | pk_equivalent | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | role | role | role | varchar2(50) |
| 18 | totalstockratio | totalstockratio | totalstockratio | number(28, 8) |
| 19 | tradingday_rate | tradingday_rate | tradingday_rate | number(28, 8) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |