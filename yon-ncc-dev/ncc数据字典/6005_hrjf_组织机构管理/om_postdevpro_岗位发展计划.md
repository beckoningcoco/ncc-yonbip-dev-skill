# |<<

**岗位发展计划 (om_postdevpro / nc.vo.om.post.PostDevproVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位发展计划主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 基准岗位 (poststd) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | recpromote | 近期上升 | recpromote | varchar(50) | √ | 字符串 (String) |
| 6 | futpromote | 远期上升 | futpromote | varchar(50) |  | 字符串 (String) |
| 7 | receqaltraffing | 近期平调 | receqaltraffing | varchar(50) |  | 字符串 (String) |
| 8 | futeqaltraffing | 远期平调 | futeqaltraffing | varchar(50) |  | 字符串 (String) |
| 9 | demote | 下调 | demote | varchar(50) |  | 字符串 (String) |