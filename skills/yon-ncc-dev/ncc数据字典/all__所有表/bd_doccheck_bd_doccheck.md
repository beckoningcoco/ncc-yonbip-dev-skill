# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | checktime | checktime | checktime | char(19) |
| 2 | mdid | mdid | mdid | varchar2(50) |
| 3 | message | message | message | varchar2(200) |
| 4 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(50) |
| 6 | pk_org | pk_org | pk_org | varchar2(50) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |