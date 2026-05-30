# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | varchar2(100) | √ |
| 2 | activetime | activetime | activetime | number(20, 0) |
| 3 | createtime | createtime | createtime | number(20, 0) |
| 4 | dropflag | dropflag | dropflag | number(38, 0) |
| 5 | dsname | dsname | dsname | varchar2(30) |
| 6 | hostid | hostid | hostid | varchar2(50) |
| 7 | tablename | tablename | tablename | varchar2(50) |
| 8 | tabletype | tabletype | tabletype | varchar2(30) |
| 9 | threadname | threadname | threadname | varchar2(200) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |