# |<<

**医疗服务别名 (bd_uh_srv_alias / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvAliasVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvalias | 服务别名主键 | pk_srvalias | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_srv | 服务 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 5 | alias | 别名 | alias | varchar(50) |  | 字符串 (String) |
| 6 | eu_mnetype | 助记符类型 | eu_mnetype | varchar(50) |  | 字符串 (String) |
| 7 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |