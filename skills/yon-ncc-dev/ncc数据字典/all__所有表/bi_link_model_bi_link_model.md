# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | relationid | relationid | relationid | varchar2(30) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | endcolumnid | endcolumnid | endcolumnid | varchar2(50) |
| 4 | endmetatype | endmetatype | endmetatype | varchar2(30) |
| 5 | endtableid | endtableid | endtableid | varchar2(50) |
| 6 | isactive | isactive | isactive | number(38, 0) |
| 7 | moduleid | moduleid | moduleid | varchar2(30) |
| 8 | note | note | note | varchar2(1024) |
| 9 | relationname | relationname | relationname | varchar2(60) |
| 10 | relationtype | relationtype | relationtype | varchar2(30) |
| 11 | startcolumnid | startcolumnid | startcolumnid | varchar2(50) |
| 12 | startmetatype | startmetatype | startmetatype | varchar2(30) |
| 13 | starttableid | starttableid | starttableid | varchar2(50) |
| 14 | creator | creator | creator | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |