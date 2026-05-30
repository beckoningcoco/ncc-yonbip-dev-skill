# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimfree | pk_dimfree | pk_dimfree | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | dimcount | dimcount | dimcount | number(38, 0) |
| 4 | isdef | isdef | isdef | char(1) | √ |
| 5 | mod | mod | mod | char(2) |
| 6 | modifytime | modifytime | modifytime | char(19) |
| 7 | tabnum | tabnum | tabnum | number(38, 0) |
| 8 | creator | creator | creator | char(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifier | modifier | modifier | char(20) |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |