# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9249.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatherrule | pk_gatherrule | pk_gatherrule | char(20) | √ |
| 2 | bdef | bdef | bdef | char(1) | √ |
| 3 | bdemanddate | bdemanddate | bdemanddate | char(1) | √ |
| 4 | bdept | bdept | bdept | char(1) | √ |
| 5 | bmaterial | bmaterial | bmaterial | char(1) | √ |  | '~' |
| 6 | bodyvdef | bodyvdef | bodyvdef | varchar2(50) |
| 7 | boristockorg | boristockorg | boristockorg | char(1) |
| 8 | bproductor | bproductor | bproductor | char(1) | √ |
| 9 | bproject | bproject | bproject | char(1) | √ |
| 10 | bproposer | bproposer | bproposer | char(1) | √ |
| 11 | bstockorg | bstockorg | bstockorg | char(1) | √ |  | '~' |
| 12 | bstorage | bstorage | bstorage | char(1) | √ |
| 13 | buncombine | buncombine | buncombine | char(1) | √ |
| 14 | bvbillcode | bvbillcode | bvbillcode | char(1) | √ |
| 15 | demanddatenum | demanddatenum | demanddatenum | number(28, 8) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |