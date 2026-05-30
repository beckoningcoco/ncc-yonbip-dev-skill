# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchcoderule | pk_batchcoderule | pk_batchcoderule | char(20) | √ |
| 2 | canchange | canchange | canchange | char(1) |
| 3 | isauto | isauto | isauto | char(1) |
| 4 | isbatchin | isbatchin | isbatchin | char(1) |
| 5 | lastsn | lastsn | lastsn | varchar2(20) |
| 6 | obj1length | obj1length | obj1length | number(38, 0) |
| 7 | obj2length | obj2length | obj2length | number(38, 0) |
| 8 | object1 | object1 | object1 | varchar2(20) |
| 9 | object2 | object2 | object2 | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |
| 12 | snnum | snnum | snnum | number(38, 0) |
| 13 | snresetflag | snresetflag | snresetflag | varchar2(20) |
| 14 | vday | vday | vday | varchar2(20) |
| 15 | vmonth | vmonth | vmonth | varchar2(20) |
| 16 | vprefix | vprefix | vprefix | varchar2(20) |
| 17 | vsuffix | vsuffix | vsuffix | varchar2(20) |
| 18 | vyear | vyear | vyear | varchar2(20) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |