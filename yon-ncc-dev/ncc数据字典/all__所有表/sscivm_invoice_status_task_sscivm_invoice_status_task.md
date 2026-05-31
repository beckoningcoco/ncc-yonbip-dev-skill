# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | pk_task | pk_task | char(20) | √ |
| 2 | error_no | error_no | error_no | number(38, 0) |  |  | 0 |
| 3 | request_data | request_data | request_data | varchar2(2048) |
| 4 | request_type | request_type | request_type | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |