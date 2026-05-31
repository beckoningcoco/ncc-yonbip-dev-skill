# |<<

**奖励情况 (hi_psndoc_enc / nc.vo.hi.psndoc.EncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | encourdate | 奖励日期 | encourdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | encourtype | 奖励类型 | encourtype | varchar(100) |  | 字符串 (String) |
| 4 | encourrank | 奖励级别 | encourrank | varchar(20) |  | 奖励级别(自定义档案) (Defdoc-HR026_0xx) |
| 5 | encourorg | 奖励机构 | encourorg | varchar(100) |  | 字符串 (String) |
| 6 | encourmeas | 奖励措施 | encourmeas | varchar(256) |  | 字符串 (String) |
| 7 | encourmatter | 奖励事由 | encourmatter | varchar(256) |  | 字符串 (String) |
| 8 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 9 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 11 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 12 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |