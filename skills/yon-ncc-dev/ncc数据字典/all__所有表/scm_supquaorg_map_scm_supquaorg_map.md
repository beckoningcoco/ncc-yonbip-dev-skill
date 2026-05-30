# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11461.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | enablestate | enablestate | enablestate | varchar2(50) |
| 2 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 5 | pk_supplierquali | pk_supplierquali | pk_supplierquali | varchar2(20) |  |  | '~' |
| 6 | pk_supquaorg_map | pk_supquaorg_map | pk_supquaorg_map | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |