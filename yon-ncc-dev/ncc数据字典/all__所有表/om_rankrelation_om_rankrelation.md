# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rankrelation | pk_rankrelation | pk_rankrelation | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | defaultrank | defaultrank | defaultrank | char(1) |
| 4 | pk_job | pk_job | pk_job | varchar2(20) |  |  | '~' |
| 5 | pk_joblevel | pk_joblevel | pk_joblevel | varchar2(20) | √ |  | '~' |
| 6 | pk_joblevelsys | pk_joblevelsys | pk_joblevelsys | varchar2(20) | √ |  | '~' |
| 7 | pk_jobrank | pk_jobrank | pk_jobrank | varchar2(20) | √ |  | '~' |
| 8 | pk_jobtype | pk_jobtype | pk_jobtype | varchar2(20) |  |  | '~' |
| 9 | pk_levelrelation | pk_levelrelation | pk_levelrelation | varchar2(20) | √ |  | '~' |
| 10 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 11 | pk_postseries | pk_postseries | pk_postseries | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |