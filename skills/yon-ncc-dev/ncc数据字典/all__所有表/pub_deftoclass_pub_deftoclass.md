# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deftoclass | pk_deftoclass | pk_deftoclass | char(20) | √ |
| 2 | classname | classname | classname | varchar2(50) | √ |
| 3 | classtype | classtype | classtype | number(38, 0) |
| 4 | tablename | tablename | tablename | varchar2(18) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |