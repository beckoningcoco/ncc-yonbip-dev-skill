# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sngenerator | pk_sngenerator | pk_sngenerator | varchar2(20) | √ |
| 2 | productcode | productcode | productcode | varchar2(50) |
| 3 | sngclass | sngclass | sngclass | varchar2(100) | √ |
| 4 | sngdescresid | sngdescresid | sngdescresid | varchar2(50) |
| 5 | sngnameresid | sngnameresid | sngnameresid | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |