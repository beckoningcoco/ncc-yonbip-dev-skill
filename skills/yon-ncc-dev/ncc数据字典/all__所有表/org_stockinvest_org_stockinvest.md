# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockinvest | pk_stockinvest | pk_stockinvest | char(20) | √ |
| 2 | assessmode | assessmode | assessmode | number(38, 0) | √ |
| 3 | autogenervoucher | autogenervoucher | autogenervoucher | char(1) |
| 4 | controlinvest | controlinvest | controlinvest | char(1) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | investdate | investdate | investdate | char(19) |
| 7 | investee | investee | investee | varchar2(20) |  |  | '~' |
| 8 | investor | investor | investor | varchar2(20) |  |  | '~' |
| 9 | investproportion | investproportion | investproportion | number(28, 8) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_investscheme | pk_investscheme | pk_investscheme | char(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | totalstockratio | totalstockratio | totalstockratio | number(28, 8) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |