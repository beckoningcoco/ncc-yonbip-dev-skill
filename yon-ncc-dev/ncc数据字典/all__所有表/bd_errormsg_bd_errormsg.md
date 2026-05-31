# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_errormsg | pk_errormsg | pk_errormsg | char(20) | √ |
| 2 | errormsg | errormsg | errormsg | varchar2(1000) |
| 3 | pk_errorlog | pk_errorlog | pk_errorlog | char(20) | √ |
| 4 | recordtime | recordtime | recordtime | char(19) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |