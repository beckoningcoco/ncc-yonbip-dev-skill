# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formtype | pk_formtype | pk_formtype | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_menuitem | pk_menuitem | pk_menuitem | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 6 | typecode | typecode | typecode | varchar2(50) | √ |
| 7 | typename | typename | typename | varchar2(300) | √ |
| 8 | typename2 | typename2 | typename2 | varchar2(300) |
| 9 | typename3 | typename3 | typename3 | varchar2(300) |
| 10 | typename4 | typename4 | typename4 | varchar2(300) |
| 11 | typename5 | typename5 | typename5 | varchar2(300) |
| 12 | typename6 | typename6 | typename6 | varchar2(300) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |