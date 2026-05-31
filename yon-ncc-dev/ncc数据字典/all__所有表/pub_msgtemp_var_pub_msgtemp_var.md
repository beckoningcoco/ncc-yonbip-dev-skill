# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10945.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tmpvar | pk_tmpvar | pk_tmpvar | char(20) | √ |
| 2 | name | name | name | varchar2(300) |
| 3 | pk_temptype | pk_temptype | pk_temptype | char(20) | √ |
| 4 | resid | resid | resid | varchar2(50) |
| 5 | varcode | varcode | varcode | varchar2(50) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |