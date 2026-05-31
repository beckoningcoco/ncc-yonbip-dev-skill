# |<<

**科研专利 (hi_psndoc_scientpatent / nc.vo.hi.psndoc.ScientPatentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | 0 |  | 字符串 (String) |
| 2 | pk_psndoc | 人员档案主键 | pk_psndoc | 0 |  | 字符串 (String) |
| 3 | begindate | 取得日期 | begindate | 20 |  | 模糊日期 (UFLiteralDate) |
| 4 | enddate | 结束日期 | enddate | 20 |  | 模糊日期 (UFLiteralDate) |
| 5 | recordnum | 记录序号 | recordnum | 1 |  | 整数 (Integer) |
| 6 | lastflag | 最近记录标志 | lastflag | 4 |  | 布尔类型 (UFBoolean) |
| 7 | patentname | 专利名称 | patentname | 0 |  | 字符串 (String) |
| 8 | patentcode | 专利编号 | patentcode | 0 |  | 字符串 (String) |
| 9 | remark | 备注 | remark | 0 |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | 5 |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | 15 |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | 5 |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | 15 |  | 日期时间 (UFDateTime) |