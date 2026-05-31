# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docattr | pk_docattr | pk_docattr | char(20) | √ |
| 2 | code | code | code | varchar2(20) |
| 3 | defaultvalue | defaultvalue | defaultvalue | varchar2(100) |
| 4 | isedit | isedit | isedit | char(1) |
| 5 | isoperinfo | isoperinfo | isoperinfo | char(1) |
| 6 | isprimarykey | isprimarykey | isprimarykey | char(1) |
| 7 | length | length | length | number(38, 0) |
| 8 | name | name | name | varchar2(300) |
| 9 | ordernum | ordernum | ordernum | number(38, 0) |
| 10 | pk_busifeature | pk_busifeature | pk_busifeature | varchar2(20) |  |  | '~' |
| 11 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 12 | refname | refname | refname | varchar2(100) |
| 13 | type | type | type | varchar2(100) |
| 14 | type_style | type_style | type_style | varchar2(50) |
| 15 | visible | visible | visible | char(1) |
| 16 | visibleoncard | visibleoncard | visibleoncard | char(1) |
| 17 | visibleongrid | visibleongrid | visibleongrid | char(1) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |