# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(50) |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | isexec | isexec | isexec | char(1) |
| 6 | pk_busirule | pk_busirule | pk_busirule | char(20) |
| 7 | pk_createorg | pk_createorg | pk_createorg | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | pk_otherobj | pk_otherobj | pk_otherobj | char(20) |
| 10 | pk_refrange | pk_refrange | pk_refrange | blob |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |