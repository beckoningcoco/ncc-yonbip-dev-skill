# |<<

**学术兼职 (hi_psndoc_learnpartime / nc.vo.hi.psndoc.LearnPartimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | 0 |  | 字符串 (String) |
| 2 | pk_psndoc | 人员档案主键 | pk_psndoc | 0 |  | 字符串 (String) |
| 3 | begindate | 开始日期 | begindate | 20 |  | 模糊日期 (UFLiteralDate) |
| 4 | enddate | 结束日期 | enddate | 20 |  | 模糊日期 (UFLiteralDate) |
| 5 | recordnum | 记录序号 | recordnum | 1 |  | 整数 (Integer) |
| 6 | lastflag | 最近记录标志 | lastflag | 4 |  | 布尔类型 (UFBoolean) |
| 7 | name | 名称 | name | 0 |  | 字符串 (String) |
| 8 | grade | 级别 | grade | 0 |  | 字符串 (String) |
| 9 | assorg | 颁发机构 | assorg | 0 |  | 字符串 (String) |
| 10 | remark | 备注 | remark | 0 |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | 5 |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | 15 |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | 5 |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | 15 |  | 日期时间 (UFDateTime) |