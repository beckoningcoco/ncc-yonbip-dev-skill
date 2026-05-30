# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | invokedid | invokedid | invokedid | varchar2(200) | √ |
| 2 | handlerclz | handlerclz | handlerclz | varchar2(100) |
| 3 | lasttime | lasttime | lasttime | char(50) |
| 4 | nexttime | nexttime | nexttime | number(30, 0) |
| 5 | nexttime2 | nexttime2 | nexttime2 | char(50) |
| 6 | timeconfig | timeconfig | timeconfig | blob |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |