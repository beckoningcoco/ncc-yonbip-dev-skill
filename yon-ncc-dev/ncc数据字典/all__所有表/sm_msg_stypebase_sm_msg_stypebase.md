# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stypebase | pk_stypebase | pk_stypebase | char(20) | √ |
| 2 | active | active | active | char(1) |
| 3 | editorclass | editorclass | editorclass | varchar2(50) |
| 4 | stclass | stclass | stclass | varchar2(200) |
| 5 | stname | stname | stname | varchar2(75) |
| 6 | stpcode | stpcode | stpcode | varchar2(50) |
| 7 | stpid | stpid | stpid | varchar2(50) |
| 8 | stscript | stscript | stscript | varchar2(300) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |