# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printlog | pk_printlog | pk_printlog | char(20) | √ |
| 2 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 3 | pk_printnumber | pk_printnumber | pk_printnumber | char(20) | √ |
| 4 | printdata | printdata | printdata | char(19) |
| 5 | printnumber | printnumber | printnumber | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |