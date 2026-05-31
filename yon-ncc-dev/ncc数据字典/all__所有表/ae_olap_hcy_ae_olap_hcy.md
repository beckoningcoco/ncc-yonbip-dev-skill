# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hierarchy | pk_hierarchy | pk_hierarchy | char(20) | √ |
| 2 | agg_member_caption | agg_member_caption | agg_member_caption | varchar2(200) |
| 3 | agg_member_name | agg_member_name | agg_member_name | varchar2(50) |
| 4 | dimtableid | dimtableid | dimtableid | varchar2(200) |
| 5 | dimtablename | dimtablename | dimtablename | varchar2(200) |
| 6 | dimtabletype | dimtabletype | dimtabletype | number(38, 0) |
| 7 | extfield | extfield | extfield | varchar2(2000) |
| 8 | has_agg_member | has_agg_member | has_agg_member | number(38, 0) |
| 9 | hierarchyid | hierarchyid | hierarchyid | varchar2(100) |
| 10 | hierarchyname | hierarchyname | hierarchyname | varchar2(200) |
| 11 | isvisible | isvisible | isvisible | number(38, 0) |
| 12 | jointable | jointable | jointable | varchar2(50) |
| 13 | memberreader | memberreader | memberreader | varchar2(100) |
| 14 | pkcolumn | pkcolumn | pkcolumn | varchar2(50) | √ |
| 15 | pk_dim | pk_dim | pk_dim | char(20) | √ |
| 16 | scriptcached | scriptcached | scriptcached | number(38, 0) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |