# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | pk_post_sub | pk_post_sub | char(20) | √ |
| 2 | contfreq | contfreq | contfreq | varchar2(200) |
| 3 | contmemo | contmemo | contmemo | varchar2(1500) |
| 4 | contmode | contmode | contmode | varchar2(200) |
| 5 | lastflag | lastflag | lastflag | char(1) |
| 6 | pk_contactobj | pk_contactobj | pk_contactobj | varchar2(20) |
| 7 | pk_post | pk_post | pk_post | varchar2(20) |
| 8 | recordnum | recordnum | recordnum | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |