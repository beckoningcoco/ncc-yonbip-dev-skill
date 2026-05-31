# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11615.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cproductid | cproductid | cproductid | char(20) | √ |
| 2 | devlevel | devlevel | devlevel | number(38, 0) |
| 3 | devorg | devorg | devorg | varchar2(50) |
| 4 | note | note | note | varchar2(200) |
| 5 | parentcode | parentcode | parentcode | varchar2(20) |
| 6 | productcode | productcode | productcode | varchar2(20) | √ |
| 7 | version | version | version | varchar2(100) | √ |
| 8 | visible | visible | visible | char(1) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |