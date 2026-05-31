# |<<

**语言能力 (hi_psndoc_langability / nc.vo.hi.psndoc.LangAbilityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2568.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | langsort | 语种 | langsort | char(20) | √ | 语种(自定义档案) (Defdoc-HR014_0xx) |
| 3 | langskill | 语种熟练程度 | langskill | char(20) | √ | 语种熟练程度(自定义档案) (Defdoc-HR015_0xx) |
| 4 | langlev | 掌握语种水平的级别 | langlev | varchar(128) |  | 字符串 (String) |
| 5 | certifname | 证书名称 | certifname | varchar(128) |  | 字符串 (String) |
| 6 | certifcode | 证书编号 | certifcode | varchar(28) |  | 字符串 (String) |
| 7 | certifdate | 获证日期 | certifdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 9 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 10 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 12 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 13 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |