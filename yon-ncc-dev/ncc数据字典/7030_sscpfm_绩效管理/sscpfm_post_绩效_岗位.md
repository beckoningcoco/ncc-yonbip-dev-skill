# |<<

**绩效_岗位 (sscpfm_post / nc.vo.sscpfm.basic.PFMPostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5583.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | code | 编码 | code | varchar(254) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_org | 共享中心主键ID | pk_org | varchar(36) |  | 字符串 (String) |
| 5 | parentid | 父节点ID | parentid | varchar(36) |  | 字符串 (String) |
| 6 | fullpath | 层级 | fullpath | varchar(254) |  | 字符串 (String) |
| 7 | isleaf | 是否叶子节点 | isleaf | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | srcsystem | 来源系统 | srcsystem | varchar(254) |  | 字符串 (String) |
| 9 | modulecode | 模块号 | modulecode | varchar(254) |  | 字符串 (String) |