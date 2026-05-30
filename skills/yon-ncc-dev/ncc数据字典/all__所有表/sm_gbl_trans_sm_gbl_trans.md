# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11555.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | tid | tid | tid | number(38, 0) | √ |
| 2 | mgflag | mgflag | mgflag | varchar2(1) |
| 3 | mgid | mgid | mgid | varchar2(100) |
| 4 | starttime | starttime | starttime | number(38, 0) |
| 5 | stat | stat | stat | number(38, 0) |
| 6 | tmout | tmout | tmout | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |