# |<<

**帮助文档 (uh_ui_helpdoc / com.yonyouhealth.uaph.framework.org.bizsys.web.helpdoc.vo.HelpDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6287.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_helpdoc | 主键 | pk_helpdoc | char(20) | √ | 主键 (UFID) |
| 2 | helpdoc_name | 帮助名称 | helpdoc_name | varchar(100) | √ | 字符串 (String) |
| 3 | funcode | 功能编码 | funcode | varchar(50) | √ | 字符串 (String) |
| 4 | fun_desc | 功能说明 | fun_desc | varchar(4000) |  | 字符串 (String) |
| 5 | instructions | 操作说明 | instructions | varchar(4000) |  | 字符串 (String) |
| 6 | img_path | 图片路径 | img_path | varchar(4000) |  | 字符串 (String) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |