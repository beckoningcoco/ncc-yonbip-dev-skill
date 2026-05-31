# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrvcate | pk_hpsrvcate | pk_hpsrvcate | char(20) | √ |
| 2 | cate_hp | cate_hp | cate_hp | varchar2(50) |
| 3 | date_begin | date_begin | date_begin | char(19) |
| 4 | date_end | date_end | date_end | char(19) |
| 5 | dt_hptype | dt_hptype | dt_hptype | varchar2(50) |
| 6 | note | note | note | varchar2(200) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 9 | pk_hptype | pk_hptype | pk_hptype | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_srvcate | pk_srvcate | pk_srvcate | varchar2(50) |  |  | '~' |
| 12 | ratio | ratio | ratio | number(28, 8) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | varchar2(50) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |