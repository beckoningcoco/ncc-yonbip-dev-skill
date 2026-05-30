# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dimtablename | dimtablename | dimtablename | varchar2(200) |
| 3 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 4 | pk_dimdef | pk_dimdef | pk_dimdef | varchar2(20) |
| 5 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |