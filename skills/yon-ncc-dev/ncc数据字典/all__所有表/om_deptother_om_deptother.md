# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptdoc_sub | pk_deptdoc_sub | pk_deptdoc_sub | char(20) | √ |
| 2 | lastfalg | lastfalg | lastfalg | char(1) |
| 3 | pk_dept | pk_dept | pk_dept | char(20) |  |  | '~' |
| 4 | recordnum | recordnum | recordnum | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |