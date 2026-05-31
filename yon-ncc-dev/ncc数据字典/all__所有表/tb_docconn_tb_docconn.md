# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dbtablename | dbtablename | dbtablename | varchar2(30) | √ |
| 3 | pkdimdef | pkdimdef | pkdimdef | varchar2(20) | √ |
| 4 | pkdimhier | pkdimhier | pkdimhier | varchar2(20) | √ |
| 5 | pkreadstruct | pkreadstruct | pkreadstruct | varchar2(20) | √ |
| 6 | pk_doc | pk_doc | pk_doc | varchar2(20) | √ |
| 7 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 8 | pk_uplevel | pk_uplevel | pk_uplevel | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |