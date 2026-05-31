# |<<

**页面模板 (pub_page_templet / nc.vo.platform.appsystemplate.PageTempletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_page_templet | 主键 | pk_page_templet | char(20) | √ | 主键 (UFID) |
| 2 | code | 模板编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | resid | 多语 | resid | varchar(50) |  | 字符串 (String) |
| 5 | templetdesc | 模板描述 | templetdesc | varchar(50) |  | 字符串 (String) |
| 6 | isdefault | 是否为开发预置 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | parentid | 父模板ID | parentid | varchar(50) |  | 字符串 (String) |
| 8 | pagecode | 页面编码 | pagecode | varchar(50) |  | 字符串 (String) |
| 9 | clazz | 实体类名 | clazz | varchar(50) |  | 字符串 (String) |
| 10 | metaid | 元数据 | metaid | varchar(50) |  | 字符串 (String) |
| 11 | headcode | 表头编码 | headcode | varchar(50) |  | 字符串 (String) |
| 12 | appcode | 应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 13 | resmodule | 多语路径 | resmodule | varchar(100) |  | 字符串 (String) |
| 14 | pk_group | 集团ID | pk_group | varchar(50) |  | 字符串 (String) |
| 15 | pk_org | 组织ID | pk_org | varchar(50) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |