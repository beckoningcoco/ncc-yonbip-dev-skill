# |<<

**报表订阅任务接受人信息表 (iufo_subscibe_embracer / nc.vo.report.subscibe.SubscibeEmbracerVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_embracer | 接受对象主键 | pk_embracer | char(20) | √ | 主键 (UFID) |
| 2 | pk_myreport | 我的报表PK | pk_myreport | varchar(20) |  | 字符串 (String) |
| 3 | pk_embracer_object | 接受者PK | pk_embracer_object | varchar(20) |  | 用户 (user) |
| 4 | embracer_type | 接受者类型 | embracer_type | int |  | 整数 (Integer) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |