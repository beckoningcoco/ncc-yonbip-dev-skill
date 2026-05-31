# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aber | pk_aber | pk_aber | char(20) | √ |
| 2 | desc_aber | desc_aber | desc_aber | varchar2(255) |
| 3 | enable_aber | enable_aber | enable_aber | char(1) |
| 4 | pk_abertype | pk_abertype | pk_abertype | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |