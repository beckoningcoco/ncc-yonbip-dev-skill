# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handcond | pk_handcond | pk_handcond | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | pk_adminorg | pk_adminorg | pk_adminorg | varchar2(20) |  |  | '~' |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | pk_psncl | pk_psncl | pk_psncl | varchar2(20) |  |  | '~' |
| 7 | type | type | type | number(38, 0) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |