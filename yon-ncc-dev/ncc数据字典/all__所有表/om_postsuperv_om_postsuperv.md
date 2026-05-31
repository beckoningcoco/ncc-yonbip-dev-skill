# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | pk_post_sub | pk_post_sub | char(20) | √ |
| 2 | lastflag | lastflag | lastflag | char(1) |
| 3 | pk_post | pk_post | pk_post | varchar2(20) |
| 4 | pk_supervtype | pk_supervtype | pk_supervtype | varchar2(20) |
| 5 | recordnum | recordnum | recordnum | number(38, 0) |
| 6 | supervmemo | supervmemo | supervmemo | varchar2(1500) |
| 7 | supervrelapost | supervrelapost | supervrelapost | varchar2(1500) |
| 8 | workdegree | workdegree | workdegree | varchar2(200) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |