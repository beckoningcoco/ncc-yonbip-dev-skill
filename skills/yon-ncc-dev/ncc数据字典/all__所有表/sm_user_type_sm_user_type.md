# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11664.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_type | pk_user_type | pk_user_type | char(20) | √ |
| 2 | basicdoc_type | basicdoc_type | basicdoc_type | varchar2(200) |
| 3 | usertype_code | usertype_code | usertype_code | varchar2(200) |
| 4 | usertype_name | usertype_name | usertype_name | varchar2(200) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |