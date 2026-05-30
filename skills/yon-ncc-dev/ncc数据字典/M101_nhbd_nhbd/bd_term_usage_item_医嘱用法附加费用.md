# |<<

**医嘱用法附加费用 (bd_term_usage_item / com.yonyou.nhis.bd.pub2.srv.vo.TermUsageItemVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usageitem | 用法费用主键 | pk_usageitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_usage | 用法主键 | pk_usage | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_item | 绑定项目 | pk_item | char(20) |  | 主键 (UFID) |
| 6 | pk_pvtype | 就诊类别 | pk_pvtype | char(20) |  | 主键 (UFID) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |