# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mutex | pk_mutex | pk_mutex | char(20) | √ |
| 2 | checkflag | checkflag | checkflag | char(100) |
| 3 | funtclass | funtclass | funtclass | char(50) |
| 4 | mutexcode | mutexcode | mutexcode | char(200) |
| 5 | mutexdesp | mutexdesp | mutexdesp | varchar2(200) |
| 6 | mutexno | mutexno | mutexno | char(10) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |