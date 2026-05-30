# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog_d | pk_tasklog_d | pk_tasklog_d | char(20) | √ |
| 2 | cubecode | cubecode | cubecode | varchar2(50) |
| 3 | pk_imptask | pk_imptask | pk_imptask | varchar2(20) | √ |
| 4 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 5 | pk_tasklog | pk_tasklog | pk_tasklog | varchar2(20) | √ |
| 6 | txtvalue | txtvalue | txtvalue | varchar2(128) |
| 7 | uniqkey | uniqkey | uniqkey | varchar2(99) |
| 8 | value | value | value | number(33, 8) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |