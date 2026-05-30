# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_serialno | pk_wr_serialno | pk_wr_serialno | char(20) | √ |
| 2 | csastunitid | csastunitid | csastunitid | varchar2(20) |  |  | '~' |
| 3 | csmaterialid | csmaterialid | csmaterialid | varchar2(20) |  |  | '~' |
| 4 | csmaterialvid | csmaterialvid | csmaterialvid | varchar2(20) |  |  | '~' |
| 5 | csqualitylevelid | csqualitylevelid | csqualitylevelid | varchar2(50) |
| 6 | csunitid | csunitid | csunitid | varchar2(20) |  |  | '~' |
| 7 | fserialnosrc | fserialnosrc | fserialnosrc | number(38, 0) |
| 8 | fsprocessmethod | fsprocessmethod | fsprocessmethod | number(38, 0) |
| 9 | fsserialnostatus | fsserialnostatus | fsserialnostatus | number(38, 0) |
| 10 | nserialnoastnum | nserialnoastnum | nserialnoastnum | number(28, 8) |
| 11 | nserialnonum | nserialnonum | nserialnonum | number(28, 8) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 15 | pk_serialno | pk_serialno | pk_serialno | char(20) |
| 16 | pk_wr_product | pk_wr_product | pk_wr_product | char(20) | √ |
| 17 | tcisempass | tcisempass | tcisempass | char(1) |
| 18 | vschangerate | vschangerate | vschangerate | varchar2(60) |
| 19 | vsdue2deptid | vsdue2deptid | vsdue2deptid | varchar2(20) |  |  | '~' |
| 20 | vsdue2deptvid | vsdue2deptvid | vsdue2deptvid | varchar2(20) |  |  | '~' |
| 21 | vsdue2psnid | vsdue2psnid | vsdue2psnid | varchar2(20) |  |  | '~' |
| 22 | vserialno | vserialno | vserialno | varchar2(128) |
| 23 | vsnote | vsnote | vsnote | varchar2(181) |
| 24 | vsrejectdesc | vsrejectdesc | vsrejectdesc | varchar2(181) |
| 25 | vsrejectreasonid | vsrejectreasonid | vsrejectreasonid | varchar2(20) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |