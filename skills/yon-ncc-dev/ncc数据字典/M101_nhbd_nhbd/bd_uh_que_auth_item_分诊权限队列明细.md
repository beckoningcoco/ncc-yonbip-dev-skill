# |<<

**分诊权限队列明细 (bd_uh_que_auth_item / com.yonyou.yh.nhis.bd.uhbdqueauth.vo.UhBdQueAuthItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_queauthitem | 主键 | pk_queauthitem | char(50) | √ | 主键 (UFID) |
| 2 | pk_pvques | 管理台主键 | pk_pvques | varchar(50) |  | 字符串 (String) |
| 3 | pk_pvque | 队列主键 | pk_pvque | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 7 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 8 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 9 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 10 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 11 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 12 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 13 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 14 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 15 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 16 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 17 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 18 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 19 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 20 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 21 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 22 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 23 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 24 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 25 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 26 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 27 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 28 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 29 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |