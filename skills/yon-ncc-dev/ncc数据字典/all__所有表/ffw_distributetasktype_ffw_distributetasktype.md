# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributetasktype | pk_distributetasktype | pk_distributetasktype | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | module | module | module | varchar2(200) |
| 4 | name | name | name | varchar2(50) |
| 5 | resid | resid | resid | varchar2(200) |
| 6 | resmodule | resmodule | resmodule | varchar2(200) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |