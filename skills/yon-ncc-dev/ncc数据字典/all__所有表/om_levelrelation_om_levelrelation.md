# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_levelrelation | pk_levelrelation | pk_levelrelation | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | defaultlevel | defaultlevel | defaultlevel | char(1) |
| 4 | defaultrank | defaultrank | defaultrank | varchar2(20) |  |  | '~' |
| 5 | jobrank | jobrank | jobrank | varchar2(2000) |  |  | '~' |
| 6 | memo | memo | memo | varchar2(50) |
| 7 | pk_job | pk_job | pk_job | varchar2(20) |  |  | '~' |
| 8 | pk_joblevel | pk_joblevel | pk_joblevel | varchar2(20) |  |  | '~' |
| 9 | pk_joblevelsys | pk_joblevelsys | pk_joblevelsys | varchar2(20) |  |  | '~' |
| 10 | pk_jobtype | pk_jobtype | pk_jobtype | varchar2(20) |  |  | '~' |
| 11 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 12 | pk_postseries | pk_postseries | pk_postseries | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |