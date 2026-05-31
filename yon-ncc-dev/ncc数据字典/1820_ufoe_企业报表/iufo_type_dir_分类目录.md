# |<<

**分类目录 (iufo_type_dir / nc.vo.iufo.pub.TypeDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3530.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_typedir | 分类目录id | pk_typedir | char(20) | √ | 主键 (UFID) |
| 2 | name | 分类目录名称 | name | varchar(1024) |  | 多语文本 (MultiLangText) |
| 3 | note | 分类目录说明 | note | varchar(1024) |  | 备注 (Memo) |
| 4 | pk_parent | 父级分类目录 | pk_parent | varchar(20) |  | 分类目录 (typedir) |
| 5 | pk_function | 所属功能节点 | pk_function | varchar(50) |  | 字符串 (String) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | seq | 序号 | seq | varchar(20) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |