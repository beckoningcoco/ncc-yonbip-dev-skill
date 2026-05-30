# |<<

**IUFO计划目录 (iufo_schedulesort / nc.vo.iufo.schedule.IUfoScheduleSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3506.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schedulesort | 计划分类主键 | pk_schedulesort | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_parent | 上级分类主键 | pk_parent | varchar(20) |  | IUFO计划目录 (IUFO计划目录) |
| 4 | busi_prop | 业务属性 | busi_prop | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |