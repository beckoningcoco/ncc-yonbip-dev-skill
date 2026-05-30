# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockinvest_body | pk_stockinvest_body | pk_stockinvest_body | char(20) | √ |
| 2 | assessmode | assessmode | assessmode | number(38, 0) |
| 3 | autogenervoucher | autogenervoucher | autogenervoucher | char(1) |
| 4 | availablesalefinalassets | availablesalefinalassets | availablesalefinalassets | number(28, 8) |
| 5 | combineratio | combineratio | combineratio | number(28, 8) |
| 6 | controlinvest | controlinvest | controlinvest | varchar2(20) |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 8 | groupstockratio | groupstockratio | groupstockratio | number(28, 8) |
| 9 | investdate | investdate | investdate | char(19) |
| 10 | investproportion | investproportion | investproportion | number(28, 8) |
| 11 | periodstockinvest | periodstockinvest | periodstockinvest | number(28, 8) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_stockinvest | pk_stockinvest | pk_stockinvest | char(20) | √ |
| 15 | totalstockratio | totalstockratio | totalstockratio | number(28, 8) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |