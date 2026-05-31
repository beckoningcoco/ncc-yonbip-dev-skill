# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repmapping | pk_repmapping | pk_repmapping | char(20) | √ |
| 2 | doccode | doccode | doccode | varchar2(50) |
| 3 | doctype | doctype | doctype | number(38, 0) |
| 4 | maplevel | maplevel | maplevel | number(38, 0) |
| 5 | pk_accsystem | pk_accsystem | pk_accsystem | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_reportitem | pk_reportitem | pk_reportitem | varchar2(50) |
| 9 | pk_reportsystem | pk_reportsystem | pk_reportsystem | varchar2(20) | √ |
| 10 | preferflag | preferflag | preferflag | char(1) |
| 11 | repitemcode | repitemcode | repitemcode | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |