# |<<

**多栏账定义 (gl_multibook_f / nc.vo.gl.multbookformate.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_columnmode | 账簿格式标识 | pk_columnmode | char(20) | √ | 主键 (UFID) |
| 2 | pk_multicol | 多栏账定义标识 | pk_multicol | char(20) |  | 主键 (UFID) |
| 3 | pk_style | 账簿显示模式标识 | pk_style | char(20) |  | 主键 (UFID) |
| 4 | columnname | 列显示名称 | columnname | varchar(40) |  | 字符串 (String) |
| 5 | columnkey | 列键值 | columnkey | int |  | 整数 (Integer) |
| 6 | columnindex | 列序号 | columnindex | int |  | 整数 (Integer) |
| 7 | columnwidth | 列宽度 | columnwidth | int |  | 整数 (Integer) |
| 8 | isvisible | 是否可见 | isvisible | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | iseditable | 是否可编辑 | iseditable | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | islinewrap | 是否折行 | islinewrap | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | alignment | 对齐方式 | alignment | int |  | 整数 (Integer) |
| 12 | isfrozen | 是否固定列 | isfrozen | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 14 | pk_fathercol | 父列主建 | pk_fathercol | char(20) |  | 主键 (UFID) |
| 15 | fathercolname | 父列显示名称 | fathercolname | varchar(40) |  | 字符串 (String) |
| 16 | userdata | 自定义项 | userdata | varchar(400) |  | 字符串 (String) |
| 17 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 18 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 19 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 20 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 21 | free1 | 扩展1 | free1 | varchar(400) |  | 字符串 (String) |
| 22 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |