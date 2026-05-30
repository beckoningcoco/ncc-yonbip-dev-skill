# |<<

**证书类型 (hr_ctfkind / nc.vo.hr.certificatefile.CtfKindVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctfkind | 主键 | pk_ctfkind | char(20) | √ | 主键 (UFID) |
| 2 | ctfkindcode | 编码 | ctfkindcode | varchar(50) | √ | 字符串 (String) |
| 3 | ctfkindname | 名称 | ctfkindname | varchar(30) | √ | 多语文本 (MultiLangText) |
| 4 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 证书类型 (ctfkind) |
| 5 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |