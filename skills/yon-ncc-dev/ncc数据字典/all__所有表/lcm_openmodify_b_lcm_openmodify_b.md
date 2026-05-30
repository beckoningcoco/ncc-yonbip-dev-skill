# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9770.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openmodify_b | pk_openmodify_b | pk_openmodify_b | char(20) | √ |
| 2 | modifyafter | modifyafter | modifyafter | varchar2(181) |
| 3 | modifybefore | modifybefore | modifybefore | varchar2(181) |
| 4 | modifyitem | modifyitem | modifyitem | varchar2(50) |
| 5 | modifyitemkey | modifyitemkey | modifyitemkey | varchar2(50) |
| 6 | pk_openmodify | pk_openmodify | pk_openmodify | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |