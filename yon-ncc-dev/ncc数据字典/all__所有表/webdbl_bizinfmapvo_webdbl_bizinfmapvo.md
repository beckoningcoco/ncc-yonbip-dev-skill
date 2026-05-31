# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | classid | classid | classid | varchar2(50) | √ |
| 2 | bizinfclassname | bizinfclassname | bizinfclassname | varchar2(50) | √ |
| 3 | bizinfid | bizinfid | bizinfid | varchar2(50) | √ |
| 4 | classattrid | classattrid | classattrid | varchar2(50) |
| 5 | classattrpath | classattrpath | classattrpath | varchar2(400) |
| 6 | intattrid | intattrid | intattrid | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |