# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guideline | pk_guideline | pk_guideline | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | defaultvalue | defaultvalue | defaultvalue | varchar2(50) | √ |
| 4 | detail | detail | detail | varchar2(1536) |
| 5 | funcode | funcode | funcode | varchar2(20) | √ |
| 6 | name | name | name | varchar2(75) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |