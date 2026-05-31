# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | cryptograph | cryptograph | cryptograph | varchar2(1024) | √ |
| 3 | memo | memo | memo | varchar2(181) | √ |
| 4 | srctext | srctext | srctext | varchar2(4000) | √ |
| 5 | userpk | userpk | userpk | char(20) | √ |
| 6 | yurref | yurref | yurref | varchar2(30) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |