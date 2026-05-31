# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | catalogid | catalogid | catalogid | char(20) | √ |
| 2 | catalogcode | catalogcode | catalogcode | varchar2(50) | √ |
| 3 | catalogname | catalogname | catalogname | varchar2(300) | √ |
| 4 | catalogname2 | catalogname2 | catalogname2 | varchar2(300) |
| 5 | catalogname3 | catalogname3 | catalogname3 | varchar2(300) |
| 6 | catalogname4 | catalogname4 | catalogname4 | varchar2(300) |
| 7 | catalogname5 | catalogname5 | catalogname5 | varchar2(300) |
| 8 | catalogname6 | catalogname6 | catalogname6 | varchar2(300) |
| 9 | parentcatalogid | parentcatalogid | parentcatalogid | varchar2(20) |  |  | '~' |
| 10 | remark | remark | remark | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |