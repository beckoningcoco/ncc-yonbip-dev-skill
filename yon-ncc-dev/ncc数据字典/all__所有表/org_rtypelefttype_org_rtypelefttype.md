# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10296.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lefttype | pk_lefttype | pk_lefttype | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | mdclassid | mdclassid | mdclassid | varchar2(36) | √ |  | '~' |
| 5 | typecode | typecode | typecode | varchar2(50) | √ |
| 6 | typename | typename | typename | varchar2(300) | √ |
| 7 | typename2 | typename2 | typename2 | varchar2(300) |
| 8 | typename3 | typename3 | typename3 | varchar2(300) |
| 9 | typename4 | typename4 | typename4 | varchar2(300) |
| 10 | typename5 | typename5 | typename5 | varchar2(300) |
| 11 | typename6 | typename6 | typename6 | varchar2(300) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |