# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cperiod | cperiod | cperiod | varchar2(181) | √ |
| 2 | businessdate | businessdate | businessdate | char(19) |
| 3 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(50) |
| 4 | cmeasureunit | cmeasureunit | cmeasureunit | varchar2(20) |  |  | '~' |
| 5 | convertrate | convertrate | convertrate | varchar2(50) |
| 6 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 7 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 8 | featurematerial | featurematerial | featurematerial | char(20) |
| 9 | nassistlasttotalnum | nassistlasttotalnum | nassistlasttotalnum | number(28, 8) |
| 10 | nassistnumber | nassistnumber | nassistnumber | number(28, 8) |
| 11 | nassistthistotalnum | nassistthistotalnum | nassistthistotalnum | number(28, 8) |
| 12 | nlstperiod | nlstperiod | nlstperiod | number(28, 8) |
| 13 | nnumber | nnumber | nnumber | number(28, 8) |
| 14 | nthisyear | nthisyear | nthisyear | number(28, 8) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |