# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | beanid | beanid | beanid | varchar2(60) |
| 3 | dbcol | dbcol | dbcol | varchar2(30) | √ |
| 4 | dbtablename | dbtablename | dbtablename | varchar2(38) | √ |
| 5 | levelcode | levelcode | levelcode | varchar2(30) | √ |
| 6 | pk_dimdef | pk_dimdef | pk_dimdef | char(20) | √ |
| 7 | propid | propid | propid | varchar2(30) | √ |
| 8 | proppath | proppath | proppath | varchar2(150) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |