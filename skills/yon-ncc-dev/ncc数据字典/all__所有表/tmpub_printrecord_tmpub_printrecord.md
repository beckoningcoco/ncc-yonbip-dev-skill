# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrecord | pk_printrecord | pk_printrecord | char(20) | √ |
| 2 | ifformal | ifformal | ifformal | char(1) |
| 3 | pk_corp | pk_corp | pk_corp | varchar2(20) |
| 4 | pk_sourcepk | pk_sourcepk | pk_sourcepk | varchar2(20) |
| 5 | printtime | printtime | printtime | char(19) |
| 6 | voperator | voperator | voperator | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |