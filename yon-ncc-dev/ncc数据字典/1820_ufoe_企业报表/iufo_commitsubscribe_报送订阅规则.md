# |<<

**报送订阅规则 (iufo_commitsubscribe / nc.vo.iufo.commitsubscribe.CommitSubscribeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commitsub | 主键 | pk_commitsub | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | rulecontent | 规则内容 | rulecontent | image |  | BLOB (BLOB) |
| 5 | commitsubssort | 所属分类 | commitsubssort | varchar(20) |  | 报送订阅规则分类 (报送订阅规则分类) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_rms | 组织体系 | pk_rms | varchar(20) |  | 组织结构_报表组织体系 (reportmanastru) |
| 9 | keyvalues | 关键字值 | keyvalues | varchar(50) |  | 字符串 (String) |
| 10 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |