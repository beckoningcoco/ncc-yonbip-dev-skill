# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_includeclass | pk_includeclass | pk_includeclass | char(20) | √ |
| 2 | batch | batch | batch | number(38, 0) | √ |
| 3 | cperiod | cperiod | cperiod | char(2) |
| 4 | cyear | cyear | cyear | char(4) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | pk_childclass | pk_childclass | pk_childclass | varchar2(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 8 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 9 | pk_parentclass | pk_parentclass | pk_parentclass | varchar2(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |