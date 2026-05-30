# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capwt | pk_capwt | pk_capwt | char(20) | √ |
| 2 | capbeginday | capbeginday | capbeginday | number(38, 0) | √ |
| 3 | capbegintime | capbegintime | capbegintime | char(8) | √ |
| 4 | capendday | capendday | capendday | number(38, 0) | √ |
| 5 | capendtime | capendtime | capendtime | char(8) | √ |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | char(20) | √ |
| 8 | pk_org | pk_org | pk_org | char(20) | √ |
| 9 | pk_shift | pk_shift | pk_shift | char(20) | √ |
| 10 | timeid | timeid | timeid | number(38, 0) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |