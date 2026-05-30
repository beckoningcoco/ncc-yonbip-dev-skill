# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlpriclassb | pk_settlpriclassb | pk_settlpriclassb | char(20) | √ |
| 2 | ordernum | ordernum | ordernum | number(38, 0) |
| 3 | pk_interfactor | pk_interfactor | pk_interfactor | varchar2(20) |  |  | '~' |
| 4 | pk_settlpriclass | pk_settlpriclass | pk_settlpriclass | char(20) | √ |
| 5 | unused | unused | unused | char(1) |
| 6 | def1 | def1 | def1 | varchar2(101) |
| 7 | def2 | def2 | def2 | varchar2(101) |
| 8 | def3 | def3 | def3 | varchar2(101) |
| 9 | def4 | def4 | def4 | varchar2(101) |
| 10 | def5 | def5 | def5 | varchar2(101) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |