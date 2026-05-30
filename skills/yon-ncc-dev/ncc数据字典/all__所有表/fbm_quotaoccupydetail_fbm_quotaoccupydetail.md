# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8213.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(50) | √ |
| 2 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 3 | pk_downquota | pk_downquota | pk_downquota | varchar2(50) | √ |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_orgv | pk_orgv | pk_orgv | varchar2(20) |  |  | '~' |
| 6 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 7 | quota | quota | quota | number(28, 8) | √ |
| 8 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |