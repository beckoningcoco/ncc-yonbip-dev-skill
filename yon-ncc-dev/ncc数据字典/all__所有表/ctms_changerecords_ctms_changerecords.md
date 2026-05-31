# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | classinfo | classinfo | classinfo | varchar2(256) |
| 3 | data | data | data | blob |
| 4 | flag | flag | flag | varchar2(64) |
| 5 | note | note | note | varchar2(1000) |
| 6 | opitempk | opitempk | opitempk | varchar2(30) |
| 7 | optype | optype | optype | number(38, 0) |
| 8 | opuser | opuser | opuser | varchar2(64) |
| 9 | params | params | params | blob |
| 10 | pkitem | pkitem | pkitem | varchar2(32) |
| 11 | state | state | state | number(38, 0) |
| 12 | timestamp | timestamp | timestamp | varchar2(256) |
| 13 | varyid | varyid | varyid | varchar2(64) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(64) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |