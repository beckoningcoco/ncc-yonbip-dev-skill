# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defaultscheme | pk_defaultscheme | pk_defaultscheme | char(20) | √ |
| 2 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 3 | pk_printscheme | pk_printscheme | pk_printscheme | varchar2(50) |
| 4 | pk_task | pk_task | pk_task | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |