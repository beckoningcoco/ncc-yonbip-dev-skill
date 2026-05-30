# |<<

**组织其它_组织类型 (org_orgtype / nc.vo.org.orgmodel.OrgTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgtype | 组织类型主键 | pk_orgtype | char(20) | √ | 主键 (UFID) |
| 2 | mdclassid | 元数据主键 | mdclassid | varchar(36) |  | 字符串 (String) |
| 3 | fullclassname | vo类路径 | fullclassname | varchar(200) |  | 字符串 (String) |
| 4 | name | 组织类型名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | code | 组织类型编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | fieldname | 组织对应字段 | fieldname | varchar(50) |  | 字符串 (String) |
| 7 | displayname | 显示名称 | displayname | varchar(40) |  | 字符串 (String) |
| 8 | memo | 描述 | memo | varchar(100) |  | 字符串 (String) |
| 9 | editorclass | 编辑器实现类 | editorclass | varchar(200) |  | 字符串 (String) |
| 10 | serviceclass | 增删改服务接口 | serviceclass | varchar(200) |  | 字符串 (String) |
| 11 | qryserviceclass | 查询服务接口 | qryserviceclass | varchar(200) |  | 字符串 (String) |
| 12 | taborder | 页签顺序 | taborder | int |  | 整数 (Integer) |
| 13 | configfilepath | 配置文件路径 | configfilepath | varchar(200) |  | 字符串 (String) |
| 14 | isbusinessunittype | 是否为业务单元类型 | isbusinessunittype | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isorgtreetype | 是否为组织树一级节点类型 | isorgtreetype | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | usedparacode | 启用参数代码 | usedparacode | varchar(50) |  | 字符串 (String) |
| 17 | orgtypestyle | 组织类型样式 | orgtypestyle | int |  | 组织类型样式 (orgtypestyle) | 0 | 0=列表; |