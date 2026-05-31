# |<<

**协同公共对象 (cp_doc / uap.lfw.dbl.vo.CpDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | pk_doc | pk_doc | char(20) | √ | 主键 (UFID) |
| 2 | doc_code | 编码 | doc_code | varchar(50) |  | 字符串 (String) |
| 3 | doc_name | 名称 | doc_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_doctype | 公共对象类型 | pk_doctype | varchar(20) |  | 协同公共对象类型 (wapdoc_type) |
| 5 | pk_metadata | 元数据主键 | pk_metadata | varchar(50) |  | 字符串 (String) |
| 6 | pk_component | 组件主键 | pk_component | varchar(50) |  | 字符串 (String) |
| 7 | doc_tablename | 对应表名 | doc_tablename | varchar(40) |  | 字符串 (String) |
| 8 | useflow | 使用流程 | useflow | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | usetext | 使用正文 | usetext | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | usegrant | 使用数据权限 | usegrant | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | module | 所属模块 | module | varchar(50) |  | 字符串 (String) |
| 12 | pk_parent | 父公共对象 | pk_parent | varchar(20) |  | 协同公共对象 (wapdoc_doc) |
| 13 | sysattrtypes | 使用特性集合 | sysattrtypes | varchar(2000) |  | 字符串 (String) |
| 14 | ispublished | 是否已经发布 | ispublished | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | fulltablename | 完整表名 | fulltablename | varchar(50) |  | 字符串 (String) |
| 16 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 18 | queryauthority | 查询权限 | queryauthority | varchar(50) |  | 字符串 (String) |
| 19 | sysext | 系统扩展属性 | sysext | varchar(50) |  | 字符串 (String) |
| 20 | sysext2 | 系统扩展属性2 | sysext2 | varchar(50) |  | 字符串 (String) |
| 21 | sysext3 | 系统扩展属性3 | sysext3 | varchar(50) |  | 字符串 (String) |
| 22 | sysext4 | 系统扩展属性4 | sysext4 | varchar(50) |  | 字符串 (String) |
| 23 | sysext5 | 系统扩展属性5 | sysext5 | varchar(50) |  | 字符串 (String) |
| 24 | busiext | 业务扩展属性 | busiext | varchar(50) |  | 字符串 (String) |
| 25 | busiext2 | 业务扩展属性2 | busiext2 | varchar(50) |  | 字符串 (String) |
| 26 | busiext3 | 业务扩展属性3 | busiext3 | varchar(50) |  | 字符串 (String) |
| 27 | busiext4 | 业务扩展属性4 | busiext4 | varchar(50) |  | 字符串 (String) |
| 28 | busiext5 | 业务扩展属性5 | busiext5 | varchar(50) |  | 字符串 (String) |
| 29 | busiext6 | 业务扩展属性6 | busiext6 | varchar(50) |  | 字符串 (String) |
| 30 | busiext7 | 业务扩展属性7 | busiext7 | varchar(50) |  | 字符串 (String) |
| 31 | busiext8 | 业务扩展属性8 | busiext8 | varchar(50) |  | 字符串 (String) |
| 32 | busiext9 | 业务扩展属性9 | busiext9 | varchar(50) |  | 字符串 (String) |
| 33 | busiext10 | 业务扩展属性10 | busiext10 | varchar(50) |  | 字符串 (String) |
| 34 | pluginclass | 对应插件类 | pluginclass | varchar(50) |  | 字符串 (String) |
| 35 | bingsysattrs | 已绑定系统特性 | bingsysattrs | varchar(2000) |  | 字符串 (String) |
| 36 | busiext11 | 业务扩展属性11 | busiext11 | varchar(50) |  | 字符串 (String) |
| 37 | busiext12 | 业务扩展属性12 | busiext12 | varchar(50) |  | 字符串 (String) |
| 38 | busiext13 | 业务扩展属性13 | busiext13 | varchar(50) |  | 字符串 (String) |
| 39 | busiext14 | 业务扩展属性14 | busiext14 | varchar(50) |  | 字符串 (String) |
| 40 | busiext15 | 业务扩展属性15 | busiext15 | varchar(50) |  | 字符串 (String) |
| 41 | busiext16 | 业务扩展属性16 | busiext16 | varchar(50) |  | 字符串 (String) |
| 42 | busiext17 | 业务扩展属性17 | busiext17 | varchar(50) |  | 字符串 (String) |
| 43 | busiext18 | 业务扩展属性18 | busiext18 | varchar(50) |  | 字符串 (String) |
| 44 | busiext19 | 业务扩展属性19 | busiext19 | varchar(50) |  | 字符串 (String) |
| 45 | signattr | 签章绑定属性 | signattr | varchar(2000) |  | 字符串 (String) |