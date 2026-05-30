# |<<

**学术交流 (hi_psndoc_learntalk / nc.vo.hi.psndoc.LearnTalkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2571.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | 0 |  | 字符串 (String) |
| 2 | pk_psndoc | 人员档案主键 | pk_psndoc | 0 |  | 字符串 (String) |
| 3 | begindate | 开始日期 | begindate | 20 |  | 模糊日期 (UFLiteralDate) |
| 4 | enddate | 结题日期 | enddate | 20 |  | 模糊日期 (UFLiteralDate) |
| 5 | recordnum | 记录序号 | recordnum | 1 |  | 整数 (Integer) |
| 6 | lastflag | 最近记录标志 | lastflag | 4 |  | 布尔类型 (UFBoolean) |
| 7 | meetname | 会议名称 | meetname | 0 |  | 字符串 (String) |
| 8 | meetorganizers | 会议举办方 | meetorganizers | 0 |  | 字符串 (String) |
| 9 | meetgrade | 会议级别 | meetgrade | 0 |  | 字符串 (String) |
| 10 | givelestitle | 授课专题 | givelestitle | 0 |  | 字符串 (String) |
| 11 | meetadress | 地点 | meetadress | 0 |  | 字符串 (String) |
| 12 | remark | 备注 | remark | 0 |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | 5 |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | 15 |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | 5 |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | 15 |  | 日期时间 (UFDateTime) |