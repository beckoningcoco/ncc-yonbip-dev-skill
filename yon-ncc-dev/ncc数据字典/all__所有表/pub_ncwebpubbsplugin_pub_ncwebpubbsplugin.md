# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | activecode | activecode | activecode | varchar2(50) |
| 3 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 4 | ordernum | ordernum | ordernum | number(38, 0) |
| 5 | pluginclass | pluginclass | pluginclass | varchar2(200) |
| 6 | pluginmodule | pluginmodule | pluginmodule | varchar2(50) |
| 7 | plugintype | plugintype | plugintype | varchar2(50) |
| 8 | trantypecode | trantypecode | trantypecode | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |