# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_api | pk_api | pk_api | char(20) | √ |
| 2 | apiuri | apiuri | apiuri | varchar2(100) |
| 3 | code | code | code | varchar2(50) |
| 4 | describe | describe | describe | varchar2(300) |
| 5 | docpath | docpath | docpath | varchar2(100) |
| 6 | fk_parent | fk_parent | fk_parent | varchar2(20) |
| 7 | isapidata | isapidata | isapidata | char(1) |
| 8 | module_code | module_code | module_code | varchar2(50) |
| 9 | name | name | name | varchar2(200) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |