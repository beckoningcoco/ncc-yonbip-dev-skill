# |<<

**报告 (sscqm_ag_article / nccloud.vo.sscqm.sscag.article.ArticleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5592.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_article | 主键 | pk_article | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(500) |  | 字符串 (String) |
| 3 | article | 报告内容 | article | image |  | BLOB (BLOB) |
| 4 | src_pk | 来源单据主键 | src_pk | varchar(50) |  | 字符串 (String) |
| 5 | src_type | 来源系统类型 | src_type | varchar(50) |  | 字符串 (String) |
| 6 | remark | 备注 | remark | varchar(500) |  | 字符串 (String) |
| 7 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |