# |<<

**组织_版本信息 (org_orgs_v / nc.vo.vorg.OrgVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织主键 | pk_org | char(20) | √ | 组织 (org) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_fatherorg | 上级业务单元 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |