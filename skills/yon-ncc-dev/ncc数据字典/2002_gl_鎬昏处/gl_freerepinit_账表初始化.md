# |<<

**账表初始化 (gl_freerepinit / nc.vo.gl.freereport.FreeReportInitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freereportinit | 主键 | pk_freereportinit | char(20) | √ | 主键 (UFID) |
| 2 | pk_freereportinit | 主键 | pk_freereportinit | char(20) | √ | 主键 (UFID) |
| 3 | reptype | 账表类型 | reptype | varchar(50) |  | 字符串 (String) |
| 4 | code | 节点编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 节点名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | reportkind | 报表类型 | reportkind | int |  | 整数 (Integer) |
| 7 | pk_freereport | 报表主键 | pk_freereport | varchar(20) |  | 字符串 (String) |
| 8 | pk_funcnode | 功能节点主键 | pk_funcnode | varchar(20) |  | 字符串 (String) |
| 9 | pk_menuitem | 菜单主键 | pk_menuitem | varchar(20) |  | 字符串 (String) |
| 10 | queryobjshowtype | 查询对象显示内容 | queryobjshowtype | int |  | 整数 (Integer) |
| 11 | sorttype | 排序方式 | sorttype | int |  | 整数 (Integer) |
| 12 | multbookshowtype | 多账簿显示方式 | multbookshowtype | int |  | 整数 (Integer) |
| 13 | booksubjdspbase | 按各核算账簿显示科目名称 | booksubjdspbase | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | qrybybookass | 按各核算账簿查询辅助核算 | qrybybookass | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | accounttype | 账簿格式 | accounttype | int |  | 整数 (Integer) |
| 16 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |