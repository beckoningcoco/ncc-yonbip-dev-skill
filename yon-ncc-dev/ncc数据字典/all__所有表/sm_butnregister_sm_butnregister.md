# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btn | pk_btn | pk_btn | char(20) | √ |
| 2 | btncode | btncode | btncode | varchar2(50) |
| 3 | btndesc | btndesc | btndesc | varchar2(300) |
| 4 | btnname | btnname | btnname | varchar2(75) |
| 5 | btnownertype | btnownertype | btnownertype | number(38, 0) |
| 6 | isbuttonpower | isbuttonpower | isbuttonpower | char(1) |
| 7 | isenable | isenable | isenable | char(1) |
| 8 | iskeyfunc | iskeyfunc | iskeyfunc | char(1) |
| 9 | parent_id | parent_id | parent_id | varchar2(50) |
| 10 | resid | resid | resid | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |