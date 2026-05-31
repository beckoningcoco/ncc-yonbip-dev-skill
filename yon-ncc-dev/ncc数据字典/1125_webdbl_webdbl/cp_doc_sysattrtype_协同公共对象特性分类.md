# |<<

**协同公共对象特性分类 (cp_doc_sysattrtype / uap.lfw.dbl.vo.CpDocSysAttrTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysattrtype | 主键 | pk_sysattrtype | char(20) | √ | 主键 (UFID) |
| 2 | typename | 名称 | typename | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | typecode | 编码 | typecode | varchar(50) |  | 字符串 (String) |
| 4 | issys | 是否预置 | issys | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | uigeneratorclass | UI引擎实现类 | uigeneratorclass | varchar(400) |  | 字符串 (String) |
| 6 | pagemodelclass | PageModel实现类 | pagemodelclass | varchar(400) |  | 字符串 (String) |
| 7 | sysattrctrlclass | 特性控制类 | sysattrctrlclass | varchar(400) |  | 字符串 (String) |
| 8 | viewtype | VIEW位置 | viewtype | varchar(50) |  | 字符串 (String) |
| 9 | descriptions | 特性描述 | descriptions | varchar(400) |  | 多语文本 (MultiLangText) |
| 10 | ordernum | 序号 | ordernum | int |  | 整数 (Integer) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | configurl | 配置地址 | configurl | varchar(50) |  | 字符串 (String) |
| 14 | sysext | 系统扩展字段 | sysext | varchar(50) |  | 字符串 (String) |
| 15 | sysext2 | 系统扩展字段2 | sysext2 | varchar(50) |  | 字符串 (String) |
| 16 | sysext3 | 系统扩展字段3 | sysext3 | varchar(50) |  | 字符串 (String) |
| 17 | sysext4 | 系统扩展字段4 | sysext4 | varchar(50) |  | 字符串 (String) |
| 18 | sysext5 | 系统扩展字段5 | sysext5 | varchar(50) |  | 字符串 (String) |
| 19 | busiext | 业务扩展字段 | busiext | varchar(50) |  | 字符串 (String) |
| 20 | busiext2 | 业务扩展字段2 | busiext2 | varchar(50) |  | 字符串 (String) |
| 21 | busiext3 | 业务扩展字段3 | busiext3 | varchar(50) |  | 字符串 (String) |
| 22 | busiext4 | 业务扩展字段4 | busiext4 | varchar(50) |  | 字符串 (String) |
| 23 | busiext5 | 业务扩展字段5 | busiext5 | varchar(50) |  | 字符串 (String) |
| 24 | busiext6 | 业务扩展字段6 | busiext6 | varchar(50) |  | 字符串 (String) |
| 25 | busiext7 | 业务扩展字段7 | busiext7 | varchar(50) |  | 字符串 (String) |
| 26 | busiext8 | 业务扩展字段8 | busiext8 | varchar(50) |  | 字符串 (String) |
| 27 | busiext9 | 业务扩展字段9 | busiext9 | varchar(50) |  | 字符串 (String) |
| 28 | busiext10 | 业务扩展字段10 | busiext10 | varchar(50) |  | 字符串 (String) |
| 29 | configafter | 发布后配置 | configafter | char(1) |  | 布尔类型 (UFBoolean) |