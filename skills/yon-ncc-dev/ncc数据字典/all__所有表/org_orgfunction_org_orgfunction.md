# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_func | pk_org_func | pk_org_func | char(20) | √ |
| 2 | org_func_code | org_func_code | org_func_code | varchar2(50) |
| 3 | pk_org | pk_org | pk_org | char(20) |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |