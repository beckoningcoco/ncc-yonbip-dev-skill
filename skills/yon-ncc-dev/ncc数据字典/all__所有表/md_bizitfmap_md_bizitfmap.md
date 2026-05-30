# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | classid | classid | classid | varchar2(50) | √ |
| 2 | intattrid | intattrid | intattrid | varchar2(50) | √ |
| 3 | bizinterfaceid | bizinterfaceid | bizinterfaceid | varchar2(50) | √ |
| 4 | bizitfimpclassname | bizitfimpclassname | bizitfimpclassname | varchar2(256) |
| 5 | classattrid | classattrid | classattrid | varchar2(50) |
| 6 | classattrpath | classattrpath | classattrpath | varchar2(512) |
| 7 | industry | industry | industry | varchar2(50) |
| 8 | versiontype | versiontype | versiontype | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |