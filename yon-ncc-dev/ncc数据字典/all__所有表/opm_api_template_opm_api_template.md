# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_api_template | pk_api_template | pk_api_template | char(20) | √ |
| 2 | api_url | api_url | api_url | varchar2(100) |
| 3 | code | code | code | varchar2(50) |
| 4 | describe | describe | describe | varchar2(200) |
| 5 | http_type | http_type | http_type | varchar2(20) |
| 6 | http_url | http_url | http_url | varchar2(100) |
| 7 | name | name | name | varchar2(100) |
| 8 | param_examples | param_examples | param_examples | varchar2(500) |
| 9 | param_type | param_type | param_type | varchar2(50) |
| 10 | result_examples | result_examples | result_examples | varchar2(500) |
| 11 | thirdapp_code | thirdapp_code | thirdapp_code | varchar2(100) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |