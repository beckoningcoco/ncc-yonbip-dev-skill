# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costtranprint | pk_costtranprint | pk_costtranprint | char(20) | √ |
| 2 | begincost | begincost | begincost | number(28, 8) |
| 3 | ccostcenter | ccostcenter | ccostcenter | varchar2(20) |  |  | '~' |
| 4 | ccostobjcode | ccostobjcode | ccostobjcode | varchar2(20) |  |  | '~' |
| 5 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 6 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 7 | ctranstatus | ctranstatus | ctranstatus | varchar2(50) |
| 8 | currentperiodcost | currentperiodcost | currentperiodcost | number(28, 8) |
| 9 | cvoucherstatus | cvoucherstatus | cvoucherstatus | varchar2(50) |
| 10 | finishedcost | finishedcost | finishedcost | number(28, 8) |
| 11 | finishednum | finishednum | finishednum | number(28, 8) |
| 12 | nlevel | nlevel | nlevel | number(38, 0) |
| 13 | nseq | nseq | nseq | number(38, 0) |
| 14 | onproducecost | onproducecost | onproducecost | number(28, 8) |
| 15 | onproducenum | onproducenum | onproducenum | number(28, 8) |
| 16 | tranoutcost | tranoutcost | tranoutcost | number(28, 8) |
| 17 | wastecost | wastecost | wastecost | number(28, 8) |
| 18 | wastenum | wastenum | wastenum | number(28, 8) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |