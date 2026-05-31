# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrv | pk_hpsrv | pk_hpsrv | char(20) | √ |
| 2 | cate_hp | cate_hp | cate_hp | varchar2(50) |
| 3 | code_hp | code_hp | code_hp | varchar2(50) |
| 4 | date_begin | date_begin | date_begin | char(19) |
| 5 | date_end | date_end | date_end | char(19) |
| 6 | dt_hptype | dt_hptype | dt_hptype | varchar2(50) |
| 7 | note | note | note | varchar2(200) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 10 | pk_hptype | pk_hptype | pk_hptype | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 13 | price | price | price | number(28, 8) |
| 14 | radio | radio | radio | number(28, 8) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |