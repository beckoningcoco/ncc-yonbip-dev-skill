# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rolemenu | pk_rolemenu | pk_rolemenu | char(20) | √ |
| 2 | defopen | defopen | defopen | char(1) |
| 3 | menucolor | menucolor | menucolor | varchar2(20) |
| 4 | menuitemcode | menuitemcode | menuitemcode | varchar2(50) |
| 5 | menuitemstr | menuitemstr | menuitemstr | varchar2(500) |
| 6 | pk_role | pk_role | pk_role | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |