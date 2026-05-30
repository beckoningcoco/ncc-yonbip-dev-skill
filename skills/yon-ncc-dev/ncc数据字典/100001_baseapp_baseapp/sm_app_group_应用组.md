# |<<

**应用组 (sm_app_group / nc.vo.platform.workbench.AppGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_app_group | 主键 | pk_app_group | char(20) | √ | 主键 (UFID) |
| 2 | groupname | 组名称 | groupname | varchar(50) |  | 字符串 (String) |
| 3 | workbenchid | 工作桌面ID | workbenchid | varchar(50) |  | 字符串 (String) |
| 4 | position | 位置 | position | int |  | 整数 (Integer) |
| 5 | resid | 多语字段 | resid | varchar(50) |  | 字符串 (String) |
| 6 | respath | 多语文件夹末级路径 | respath | varchar(50) |  | 字符串 (String) |
| 7 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |