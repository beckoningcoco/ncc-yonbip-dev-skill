# |<<

**配置信息 (fiarc_config / nc.vo.archive.archiveinit.ConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2212.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | host | 主机名 | host | varchar(200) |  | 字符串 (String) |
| 2 | port | 端口 | port | varchar(200) |  | 字符串 (String) |
| 3 | username | 用户名 | username | varchar(200) |  | 字符串 (String) |
| 4 | password | 密码 | password | varchar(200) |  | 字符串 (String) |
| 5 | istransport | 是否传送电子档案 | istransport | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isarchivebook | 是否归档账表 | isarchivebook | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | isarchivereport | 是否归档报表 | isarchivereport | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isarchiveimage | 是否归档影像 | isarchiveimage | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isarchivebill | 是否归档单据 | isarchivebill | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isincrearchive | 是否增量归档 | isincrearchive | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | transportmode | 传送模式 | transportmode | varchar(200) |  | 传送模式 (transmode) |  | 1=FTP; |