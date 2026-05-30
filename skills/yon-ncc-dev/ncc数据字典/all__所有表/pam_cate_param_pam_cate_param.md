# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cate_param | pk_cate_param | pk_cate_param | char(20) | √ |
| 2 | classid | classid | classid | varchar2(36) |  |  | '~' |
| 3 | input_digit | input_digit | input_digit | number(38, 0) |
| 4 | input_length | input_length | input_length | number(38, 0) |
| 5 | nullflag | nullflag | nullflag | char(1) |
| 6 | param_index | param_index | param_index | number(38, 0) |
| 7 | pk_category | pk_category | pk_category | char(20) | √ |
| 8 | show_name | show_name | show_name | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |