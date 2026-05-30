# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billitfdef | pk_billitfdef | pk_billitfdef | char(20) | √ |
| 2 | dest_billtype | dest_billtype | dest_billtype | varchar2(20) | √ |
| 3 | dest_transtype | dest_transtype | dest_transtype | varchar2(20) |  |  | '~' |
| 4 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | char(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | src_billtype | src_billtype | src_billtype | varchar2(20) | √ |
| 8 | src_transtype | src_transtype | src_transtype | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |