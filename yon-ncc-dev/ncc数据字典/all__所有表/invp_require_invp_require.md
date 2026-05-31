# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9258.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_require | pk_require | pk_require | varchar2(40) | √ |
| 2 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 4 | creqbillbid | creqbillbid | creqbillbid | varchar2(20) |
| 5 | creqbillid | creqbillid | creqbillid | varchar2(20) |
| 6 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 7 | dbilldate | dbilldate | dbilldate | char(19) |
| 8 | dorgreqdate | dorgreqdate | dorgreqdate | char(10) |
| 9 | dreqdate | dreqdate | dreqdate | char(19) |
| 10 | ipriority | ipriority | ipriority | number(38, 0) |
| 11 | itimebucket | itimebucket | itimebucket | number(38, 0) |
| 12 | nallocnum | nallocnum | nallocnum | number(28, 8) |
| 13 | nnum | nnum | nnum | number(28, 8) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | vreqbillcode | vreqbillcode | vreqbillcode | varchar2(50) |
| 18 | vreqrowno | vreqrowno | vreqrowno | varchar2(50) |
| 19 | vreqtrantype | vreqtrantype | vreqtrantype | varchar2(20) |  |  | '~' |
| 20 | vreqtype | vreqtype | vreqtype | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |