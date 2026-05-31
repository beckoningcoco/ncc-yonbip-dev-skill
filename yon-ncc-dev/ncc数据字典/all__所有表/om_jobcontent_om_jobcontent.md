# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job_sub | pk_job_sub | pk_job_sub | char(20) | √ |
| 2 | jobcontentdesc | jobcontentdesc | jobcontentdesc | varchar2(384) |
| 3 | jobcontenttype | jobcontenttype | jobcontenttype | varchar2(20) |
| 4 | jobworktype | jobworktype | jobworktype | char(50) |
| 5 | lastflag | lastflag | lastflag | char(1) |
| 6 | pk_job | pk_job | pk_job | varchar2(20) |
| 7 | recordnum | recordnum | recordnum | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |