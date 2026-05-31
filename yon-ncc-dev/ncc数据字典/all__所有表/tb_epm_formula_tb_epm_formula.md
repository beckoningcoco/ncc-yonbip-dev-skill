# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | createdby | createdby | createdby | varchar2(20) |
| 3 | createddate | createddate | createddate | char(19) |
| 4 | describe | describe | describe | blob |
| 5 | direction | direction | direction | varchar2(1) |
| 6 | express | express | express | blob |
| 7 | f_order | f_order | f_order | number(38, 0) |
| 8 | info | info | info | varchar2(1000) |
| 9 | measure | measure | measure | varchar2(100) |
| 10 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 11 | modifieddate | modifieddate | modifieddate | char(19) |
| 12 | objname | objname | objname | varchar2(100) |
| 13 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 14 | type_direction | type_direction | type_direction | varchar2(10) |
| 15 | xmlexpress | xmlexpress | xmlexpress | blob |
| 16 | def1 | def1 | def1 | varchar2(50) |
| 17 | def2 | def2 | def2 | varchar2(50) |
| 18 | def3 | def3 | def3 | varchar2(50) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |