# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replacedoc | pk_replacedoc | pk_replacedoc | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | period_begin | period_begin | period_begin | varchar2(20) |  |  | '~' |
| 4 | period_end | period_end | period_end | varchar2(20) |  |  | '~' |
| 5 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(50) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_replaced | pk_replaced | pk_replaced | varchar2(20) |  |  | '~' |
| 9 | pk_replacer | pk_replacer | pk_replacer | varchar2(20) |  |  | '~' |
| 10 | quota | quota | quota | number(28, 8) |
| 11 | replacetype | replacetype | replacetype | number(38, 0) |
| 12 | state | state | state | number(38, 0) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |