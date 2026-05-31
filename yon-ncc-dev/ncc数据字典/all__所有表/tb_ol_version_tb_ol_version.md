# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | batch_is_curruser | batch_is_curruser | batch_is_curruser | char(1) |
| 3 | batch_name | batch_name | batch_name | varchar2(200) |
| 4 | batch_occurtime | batch_occurtime | batch_occurtime | char(19) |
| 5 | batch_type | batch_type | batch_type | char(4) |
| 6 | datasource | datasource | datasource | varchar2(50) |
| 7 | isdisk | isdisk | isdisk | char(1) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |