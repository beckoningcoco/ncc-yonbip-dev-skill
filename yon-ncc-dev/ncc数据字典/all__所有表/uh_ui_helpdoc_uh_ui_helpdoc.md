# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_helpdoc | pk_helpdoc | pk_helpdoc | char(20) | √ |
| 2 | funcode | funcode | funcode | varchar2(50) | √ |
| 3 | fun_desc | fun_desc | fun_desc | varchar2(4000) |
| 4 | helpdoc_name | helpdoc_name | helpdoc_name | varchar2(100) | √ |
| 5 | img_path | img_path | img_path | varchar2(4000) |
| 6 | instructions | instructions | instructions | varchar2(4000) |
| 7 | creationtime | creationtime | creationtime | char(19) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |