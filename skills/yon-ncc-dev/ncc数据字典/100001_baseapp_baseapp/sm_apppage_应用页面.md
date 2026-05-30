# |<<

**应用页面 (sm_apppage / nc.vo.platform.workbench.AppPageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5281.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apppage | 主键 | pk_apppage | char(20) | √ | 主键 (UFID) |
| 2 | pagecode | 页面编码 | pagecode | varchar(50) | √ | 字符串 (String) |
| 3 | pagename | 页面名称 | pagename | varchar(300) | √ | 字符串 (String) |
| 4 | pagedesc | 页面描述 | pagedesc | varchar(200) |  | 字符串 (String) |
| 5 | pageurl | 页面url | pageurl | varchar(50) |  | 字符串 (String) |
| 6 | parent_id | 应用id | parent_id | varchar(50) | √ | 字符串 (String) |
| 7 | parentcode | 应用编码 | parentcode | varchar(50) |  | 字符串 (String) |
| 8 | resid | 多语标识 | resid | varchar(100) |  | 字符串 (String) |
| 9 | isdefault | 是否为默认页面 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | iscarddefault | 是否卡片默认 | iscarddefault | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |