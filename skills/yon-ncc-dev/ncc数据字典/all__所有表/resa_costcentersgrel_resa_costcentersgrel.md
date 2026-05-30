# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | char(20) | √ |
| 2 | pk_ccgroup | pk_ccgroup | pk_ccgroup | varchar2(20) |  |  | '~' |
| 3 | pk_ccstructure | pk_ccstructure | pk_ccstructure | char(20) | √ |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |