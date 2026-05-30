# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entry_material | pk_entry_material | pk_entry_material | char(20) | √ |
| 2 | deadline | deadline | deadline | char(10) |
| 3 | isreceive | isreceive | isreceive | char(1) |
| 4 | memo | memo | memo | varchar2(512) |
| 5 | pk_entryapply | pk_entryapply | pk_entryapply | char(20) |
| 6 | pk_group | pk_group | pk_group | char(20) |
| 7 | pk_material | pk_material | pk_material | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | receivedate | receivedate | receivedate | char(10) |
| 10 | uncommit | uncommit | uncommit | char(1) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |