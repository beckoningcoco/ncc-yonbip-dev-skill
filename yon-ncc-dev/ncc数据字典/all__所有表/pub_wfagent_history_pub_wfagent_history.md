# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | agentor | agentor | agentor | char(20) |
| 3 | billtype | billtype | billtype | varchar2(256) |
| 4 | pk_outinfo | pk_outinfo | pk_outinfo | char(20) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |