# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 2 | calcflag | calcflag | calcflag | char(1) |
| 3 | name | name | name | varchar2(50) |
| 4 | note | note | note | varchar2(50) |
| 5 | pk_hbscheme | pk_hbscheme | pk_hbscheme | char(20) | √ |
| 6 | pk_ref_rule | pk_ref_rule | pk_ref_rule | varchar2(50) |
| 7 | pk_taskhead | pk_taskhead | pk_taskhead | char(20) |
| 8 | queryflag | queryflag | queryflag | char(1) |
| 9 | type | type | type | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |