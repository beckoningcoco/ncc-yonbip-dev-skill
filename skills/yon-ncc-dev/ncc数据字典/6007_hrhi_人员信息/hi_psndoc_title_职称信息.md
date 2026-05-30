# |<<

**职称信息 (hi_psndoc_title / nc.vo.hi.psndoc.TitleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 评定日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 终止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | pk_techposttitle | 获得职称 | pk_techposttitle | char(20) | √ | 专业技术职务(自定义档案) (Defdoc-HR019_0xx) |
| 5 | titlerank | 职称等级 | titlerank | varchar(20) |  | 职称等级(自定义档案) (Defdoc-HR025_0xx) |
| 6 | assorg | 评定机构 | assorg | varchar(128) |  | 字符串 (String) |
| 7 | certifcode | 证书编号 | certifcode | varchar(28) |  | 字符串 (String) |
| 8 | achive | 获得成就 | achive | varchar(256) |  | 字符串 (String) |
| 9 | tiptop_flag | 最高 | tiptop_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | strongsuit | 专长 | strongsuit | varchar(256) |  | 字符串 (String) |
| 11 | summ | 简要说明 | summ | varchar(256) |  | 字符串 (String) |
| 12 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 13 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 15 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 16 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 17 | certificationtime | 发证日期 | certificationtime | 20 |  | 模糊日期 (UFLiteralDate) |
| 18 | specialtyname | 专业名称 | specialtyname | 0 |  | 字符串 (String) |
| 19 | achievement | 成绩 | achievement | 0 |  | 字符串 (String) |
| 20 | titlengage | 聘任职称 | titlengage | 5 |  | 专业技术职务(自定义档案) (Defdoc-HR019_0xx) |
| 21 | jobagelimit | 任职年限 | jobagelimit | 1 |  | 整数 (Integer) |
| 22 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 25 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |