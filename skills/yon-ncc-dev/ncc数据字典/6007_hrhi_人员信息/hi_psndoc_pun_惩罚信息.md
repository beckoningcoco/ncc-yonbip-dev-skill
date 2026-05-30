# |<<

**惩罚信息 (hi_psndoc_pun / nc.vo.hi.psndoc.PunVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | punishdate | 惩罚日期 | punishdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | punishtype | 惩罚类型 | punishtype | varchar(100) |  | 字符串 (String) |
| 4 | punishorg | 惩罚机构 | punishorg | varchar(100) | √ | 字符串 (String) |
| 5 | punishmeas | 惩罚措施 | punishmeas | varchar(256) |  | 字符串 (String) |
| 6 | punishmatter | 惩罚事由 | punishmatter | varchar(256) | √ | 字符串 (String) |
| 7 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 8 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 10 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 11 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |