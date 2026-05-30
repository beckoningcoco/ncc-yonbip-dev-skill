# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | reppk | reppk | reppk | char(20) | √ |
| 2 | context | context | context | blob |
| 3 | crawltime | crawltime | crawltime | varchar2(30) |
| 4 | dims | dims | dims | blob |
| 5 | info | info | info | blob |
| 6 | measures | measures | measures | blob |
| 7 | note | note | note | blob |
| 8 | repcode | repcode | repcode | varchar2(50) |
| 9 | repname | repname | repname | varchar2(200) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |