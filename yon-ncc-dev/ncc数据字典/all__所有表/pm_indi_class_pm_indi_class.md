# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10620.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 3 | fullpath | fullpath | fullpath | varchar2(765) | √ |
| 4 | indiclasscode | indiclasscode | indiclasscode | varchar2(20) | √ |
| 5 | indiclasslevel | indiclasslevel | indiclasslevel | number(38, 0) | √ |
| 6 | indiclassname | indiclassname | indiclassname | varchar2(300) | √ |
| 7 | indiclassnumber | indiclassnumber | indiclassnumber | number(38, 0) |
| 8 | indiclassparent | indiclassparent | indiclassparent | varchar2(32) |
| 9 | indiclasstype | indiclasstype | indiclasstype | number(38, 0) |
| 10 | isleaf | isleaf | isleaf | number(38, 0) | √ |
| 11 | orgid | orgid | orgid | varchar2(660) | √ |  | '' |
| 12 | tenantid | tenantid | tenantid | varchar2(32) |
| 13 | creationtime | creationtime | creationtime | date |
| 14 | creator | creator | creator | varchar2(36) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | date |
| 17 | modifier | modifier | modifier | varchar2(36) |
| 18 | ts | ts | ts | date |  |  | sysdate |